/**
 * @author	Tiziano Antico
 * This class contains a JUnitTest for the app
 */

package test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

import org.junit.Test;

import entities.ImportedGood;
import entities.NonImportedGood;
import entities.Receipt;
import entities.ShoppingBasket;
import good_types.GoodType;

public class ReceiptJUnit {

	@Test
	public void testReceiptResult() throws FileNotFoundException {

		Receipt receipt = new Receipt();

		// Shopping Basket 1
		ShoppingBasket shoppingBasket1 = new ShoppingBasket("sb1");
		NonImportedGood nonig1 = new NonImportedGood("book", 2, new BigDecimal("12.49"), GoodType.BOOK);
		NonImportedGood nonig2 = new NonImportedGood("music CD", 1, new BigDecimal("14.99"));
		NonImportedGood nonig3 = new NonImportedGood("chocolate bar", 1, new BigDecimal("0.85"),GoodType.FOOD);

		shoppingBasket1.addGood(nonig1);
		shoppingBasket1.addGood(nonig2);
		shoppingBasket1.addGood(nonig3);
		receipt.addShoppingBasket(shoppingBasket1);

		// Shopping Basket 2
		ShoppingBasket shoppingBasket2 = new ShoppingBasket("sb2");
		ImportedGood imp1 = new ImportedGood("imported box of chocolates", 1, new BigDecimal("10.00"), GoodType.FOOD);
		ImportedGood imp2 = new ImportedGood("imported bottle of perfume", 1, new BigDecimal("47.50"));

		shoppingBasket2.addGood(imp1);
		shoppingBasket2.addGood(imp2);
		receipt.addShoppingBasket(shoppingBasket2);

		// Shopping Basket 3
		ShoppingBasket shoppingBasket3 = new ShoppingBasket("sb3");
		ImportedGood imp3 = new ImportedGood("imported bottle of perfume", 1, new BigDecimal("27.99"));
		NonImportedGood nonig4 = new NonImportedGood("bottle of perfume", 1, new BigDecimal("18.99"));
		NonImportedGood nonig5 = new NonImportedGood("packet of headache pills", 1, new BigDecimal("9.75"), GoodType.MEDICAL_PRODUCT);
		ImportedGood imp4 = new ImportedGood("imported box of chocolates", 3, new BigDecimal("11.25"), GoodType.FOOD);

		shoppingBasket3.addGood(imp3);
		shoppingBasket3.addGood(nonig4);
		shoppingBasket3.addGood(nonig5);
		shoppingBasket3.addGood(imp4);
		receipt.addShoppingBasket(shoppingBasket3);

		String supposedResult = new Scanner(new File("src/test/result.txt")).useDelimiter("\\Z").next();
		System.out.println("OUTPUT\n");
		System.out.println(receipt);

		assertEquals(supposedResult,receipt.toString());
	}
}
