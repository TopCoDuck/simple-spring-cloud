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
		System.out.println("회원가입이 완료 되었습니다.");
		//	sender.send("회원가입이 완료 되었습니다.");
	}
}
