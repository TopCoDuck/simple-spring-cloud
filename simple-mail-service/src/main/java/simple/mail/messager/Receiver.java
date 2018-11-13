package simple.mail.messager;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class Receiver {
	
	    @RabbitHandler
	    public void receive(String message) {
	        System.out.println(" ¸Þ½ÃÁö : " + message + "'");
	    }
}
