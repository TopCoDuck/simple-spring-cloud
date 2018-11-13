package simple.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simple.mail.messager.Sender;

@RestController
public class SenberTestController {

	@Autowired
	private Sender sender;
	
	@RequestMapping("/send")
	public void send() {
		sender.send("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
	}
}
