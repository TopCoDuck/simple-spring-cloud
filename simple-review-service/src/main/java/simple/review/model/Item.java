package simple.review.model;

import lombok.Data;

@Data
public class Item {
	
	private String itemId;
	
	private String itemNm;
	
	private String itemDesc;
	
	private ItemState itemState;
}
