import java.math.BigDecimal;

import enities.ImportedGood;
import enities.NonImportedGood;
import enities.Receipt;
import good_types.GoodType;

public class main {

	public static void main(String[] args) {

		Receipt receipt = new Receipt();

		NonImportedGood nonig1 = new NonImportedGood("book", 2, new BigDecimal("12.49"), GoodType.BOOK);
		NonImportedGood nonig2 = new NonImportedGood("music CD", 1, new BigDecimal("14.99"));
		NonImportedGood nonig3 = new NonImportedGood("chocolate bar", 1, new BigDecimal("0.85"),GoodType.FOOD);

		receipt.addItem(nonig1);
		receipt.addItem(nonig2);
		receipt.addItem(nonig3);

		System.out.println("OUTPUT\n");
		System.out.println("Output 1:");
		System.out.println(receipt);

		receipt.clean();


		ImportedGood imp1 = new ImportedGood("imported box of chocolates", 1, new BigDecimal("10.00"), GoodType.FOOD);
		ImportedGood imp2 = new ImportedGood("imported bottle of perfume", 1, new BigDecimal("47.50"));

		receipt.addItem(imp1);
		receipt.addItem(imp2);

		System.out.println("\nOutput 2:");
		System.out.println(receipt);





	}

}
