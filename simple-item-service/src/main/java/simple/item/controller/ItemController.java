package simple.item.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import simple.item.model.Item;
import simple.item.model.ItemState;

@RestController
public class ItemController {
	
	@GetMapping("/items/{itemId}")
	public Item getItem(@PathVariable String itemId) {
		System.out.println("ItemController");
		Item item = new Item();
		item.setItemId("ITEM_ID");
		item.setItemNm("ITEM_NM");
		item.setItemDesc("ITEM_DESC");
		item.setItemState(ItemState.LIVE);
		return item;
	}
}
