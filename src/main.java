import java.math.BigDecimal;

import enities.NonImportedGood;
import good_types.GoodType;

public class main {

	public static void main(String[] args) {


		/*NonImportedGood nonig = new NonImportedGood("book", 2, new BigDecimal("12.49"), GoodType.BOOK);
		nonig.computePrice();
		System.out.println(nonig.getPrice());*/

		NonImportedGood nonig = new NonImportedGood("music CD", 1, new BigDecimal("14.99"));
		//nonig.computeSaleTax();
		nonig.computePrice();
		System.out.println(nonig.getPrice());





	}

}
