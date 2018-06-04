package interfaces;

import entities.ShoppingBasket;
import exceptions.ShoppingBasketNotFoundException;

public interface ReceiptInterface {

	boolean addShoppingBasket(ShoppingBasket sb);
	boolean removeShoppingBasket(String idName) throws ShoppingBasketNotFoundException;
	ShoppingBasket getShoppingBasketFromReceipt(String idName) throws ShoppingBasketNotFoundException;
	int receiptCount();
}
