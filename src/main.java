import java.math.BigDecimal;

import entities.ImportedGood;
import entities.NonImportedGood;
import entities.Receipt;
import entities.ShoppingBasket;
import good_types.GoodType;

public class main {

	public static void main(String[] args) {

		Receipt receipt = new Receipt();

		/*ShoppingBasket shoppingBasket1 = new ShoppingBasket("sb1");
		NonImportedGood nonig1 = new NonImportedGood("book", 2, new BigDecimal("12.49"), GoodType.BOOK);
		NonImportedGood nonig2 = new NonImportedGood("music CD", 1, new BigDecimal("14.99"));
		NonImportedGood nonig3 = new NonImportedGood("chocolate bar", 1, new BigDecimal("0.85"),GoodType.FOOD);

		shoppingBasket1.addItem(nonig1);
		shoppingBasket1.addItem(nonig2);
		shoppingBasket1.addItem(nonig3);
		receipt.addShoppingBasket(shoppingBasket1);


		ShoppingBasket shoppingBasket2 = new ShoppingBasket("sb2");
		ImportedGood imp1 = new ImportedGood("imported box of chocolates", 1, new BigDecimal("10.00"), GoodType.FOOD);
		ImportedGood imp2 = new ImportedGood("imported bottle of perfume", 1, new BigDecimal("47.50"));

		shoppingBasket2.addItem(imp1);
		shoppingBasket2.addItem(imp2);
		receipt.addShoppingBasket(shoppingBasket2);*/


		ShoppingBasket shoppingBasket3 = new ShoppingBasket("sb3");
		ImportedGood imp3 = new ImportedGood("imported bottle of perfume", 1, new BigDecimal("27.99"));
		NonImportedGood nonig4 = new NonImportedGood("bottle of perfume", 1, new BigDecimal("18.99"));
		NonImportedGood nonig5 = new NonImportedGood("packet of headache pills", 1, new BigDecimal("9.75"), GoodType.MEDICAL_PRODUCT);
		ImportedGood imp4 = new ImportedGood("imported box of chocolates", 3, new BigDecimal("11.25"), GoodType.FOOD);

		shoppingBasket3.addItem(imp3);
		shoppingBasket3.addItem(nonig4);
		shoppingBasket3.addItem(nonig5);
		shoppingBasket3.addItem(imp4);
		receipt.addShoppingBasket(shoppingBasket3);

		System.out.println(receipt);
	}
}
