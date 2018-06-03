package enities;

import java.math.BigDecimal;
import good_types.GoodType;

public class NonImportedGood extends Item{

	final String BASIC_SALE_TAX = "0.10"; // which corresponds to a discount of 10 %

	/**
	 * Constructor for a NonImportedGood item, given also the type of the Good
	 * @param description
	 * @param quantity
	 * @param price
	 * @param goodtype
	 */
	public NonImportedGood(String description, int quantity, BigDecimal price, GoodType goodtype) {
		super(description, quantity, price, goodtype);
	}

	/**
	 * Constructor for a NonImportedGood item, without giving the type of the Item
	 * @param description
	 * @param quantity
	 * @param price
	 */
	public NonImportedGood(String description, int quantity, BigDecimal price) {
		super(description, quantity, price);
	}

	/**
	 * Compute the price of the Non Imported Good, by checking if it is needed to
	 * apply the BASIC_SALE_TAX to the Item or not
	 */
	public void computePrice(){
		switch (this.getGoodtype()) {
        case BOOK:
        case FOOD:
        case MEDICAL_PRODUCT:
        	this.setPrice(this.getPrice().multiply(new BigDecimal(this.getQuantity())));
        	break;
        case OTHER:
        default:
        	this.computeSaleTax();
        	this.setPrice(this.getPrice().add(this.getSalesTax()));
        	break;
		}
	}

	/**
	 * Compute the sale tax of the Non Imported Good
	 */
	public void computeSaleTax(){
		switch (this.getGoodtype()) {
		case BOOK:
		case FOOD:
		case MEDICAL_PRODUCT:
			break;
		case OTHER:
		default:
			this.setSalesTax(this.getPrice().multiply(new BigDecimal(BASIC_SALE_TAX)).setScale(2, BigDecimal.ROUND_UP));
			break;
		}
	}
}
