package simple.review.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import simple.review.model.Review;


@RestController
public class ReviewController {
	
	@GetMapping("/")
	public String getTest() {
		return "test";
	}
	
	@GetMapping("/{test}")
	public String getTest2() {
		return "test2";
	}
	@GetMapping("/reviews/{reviewSeq}")
	public Review getReview(@PathVariable int reviewSeq) throws Exception{
		Review review = new Review();
		review.setReiwSeq(1);
		review.setItemId("ITEM_ID");
		review.setContent("³»¿ë");
		return review;
	}
}
