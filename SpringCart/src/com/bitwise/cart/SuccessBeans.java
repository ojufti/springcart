package com.bitwise.cart;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Session")
public class SuccessBeans {
@Override
	public String toString() {
		return "SuccessBeans [itemList=" + itemList + "]";
	}

private String itemList;

public String getItemList() {
	return itemList;
}

public void setItemList(String itemList) {
	this.itemList = itemList;
}

}
