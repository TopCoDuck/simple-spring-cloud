package simple.mail.messager;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	
	@Autowired
	private RabbitTemplate template;
	
	@Bean
	Queue queue1() {
		return new Queue("hello", false);
	}
	public void send(String message) {
		System.out.println("send message : " + message);
		this.template.convertAndSend("hello", message);
	}
}
