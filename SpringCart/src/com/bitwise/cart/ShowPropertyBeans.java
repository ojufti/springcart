package com.bitwise.cart;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class ShowPropertyBeans {
private String name,size,price,quantity;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getQuantity() {
	return quantity;
}

public void setQuantity(String quantity) {
	this.quantity = quantity;
}

}
