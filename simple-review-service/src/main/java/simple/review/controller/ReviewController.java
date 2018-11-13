package simple.review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import simple.review.model.Item;
import simple.review.model.ItemState;
import simple.review.model.Review;


@RestController
public class ReviewController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/reviews/{reviewSeq}")
	public Review getReview(@PathVariable int reviewSeq) throws Exception{
		Item item = restTemplate.getForObject("http://gateway-1/items/1", Item.class);

		Review review = new Review();
		if(item.getItemState() == ItemState.LIVE) {
			review.setReiwSeq(1);
			review.setItemId(item.getItemId());
			review.setContent("³»¿ë");
		}

		return review;
		
	}
}
