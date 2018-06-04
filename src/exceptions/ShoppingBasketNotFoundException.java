/**
 * @author	Tiziano Antico
 * This class is used to manage the Shopping Basket Exceptions
 */

package exceptions;

public class ShoppingBasketNotFoundException extends Exception{

	public ShoppingBasketNotFoundException(){}
	public ShoppingBasketNotFoundException(String msg){
		super(msg);
	}
}
