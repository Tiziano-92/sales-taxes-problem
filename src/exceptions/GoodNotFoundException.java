package exceptions;

public class GoodNotFoundException extends Exception{

	public GoodNotFoundException(){}
	public GoodNotFoundException(String msg){
		super(msg);
	}
}
