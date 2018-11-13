package simple.member.messager;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	
	@Autowired
	private RabbitTemplate template;
	
	public void send(String message) {
		this.template.convertAndSend("mail-queue", message);
	}
}
