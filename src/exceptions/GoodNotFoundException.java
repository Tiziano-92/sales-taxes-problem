/**
 * @author	Tiziano Antico
 * This class is used to manage the Good Exceptions
 */

package exceptions;

public class GoodNotFoundException extends Exception{

	public GoodNotFoundException(){}
	public GoodNotFoundException(String msg){
		super(msg);
	}

}
