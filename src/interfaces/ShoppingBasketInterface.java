/**
 * @author	Tiziano Antico
 * This class is used to create an interface for the Shopping Basket class
 */

package interfaces;

import entities.Good;
import entities.ShoppingBasket;
import exceptions.GoodNotFoundException;

public interface ShoppingBasketInterface {

	boolean addGood(Good good);
	boolean removeGood(String idName) throws GoodNotFoundException;
	ShoppingBasket getShoppingBasketFromReceipt(String idName) throws GoodNotFoundException;
	int shoppingBasketCount();
}
