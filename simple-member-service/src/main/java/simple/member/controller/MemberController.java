package simple.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import simple.member.messager.Sender;

@RestController
public class MemberController {

	@Autowired
	private Sender sender;
	
	@GetMapping("/members/join")
	public void join() {
		System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
		//	sender.send("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
	}
}
