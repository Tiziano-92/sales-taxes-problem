/**
 * @author	Tiziano Antico
 * This class extends the abstract class Item. In this way you can create an instance of an object
 * which heritages the method of its subclass and creates of a new specific ones.
 */

package entities;

import java.math.BigDecimal;
import good_types.GoodType;
import helper.Helper;

public class NonImportedGood extends Good{

	final String BASIC_SALE_TAX = "0.10"; // which corresponds to a discount of 10 %

	/**
	 * Constructor for an Item, given also the type of the Item
	 * @param description
	 * @param quantity
	 * @param price
	 * @param goodtype
	 */
	public NonImportedGood(String description, int quantity, BigDecimal price, GoodType goodtype) {
		super(description, quantity, price, goodtype);
	}

	/**
	 * Constructor for an Item, giving the type of the Item and giving the id
	 * @param id
	 * @param description
	 * @param quantity
	 * @param price
	 * @param goodtype
	 */
	public NonImportedGood(String id, String description, int quantity, BigDecimal price, GoodType goodtype) {
		super(id, description, quantity, price, goodtype);
	}

	/**
	 * Constructor for an Item, without giving the type of the Item
	 * @param description
	 * @param quantity
	 * @param price
	 */
	public NonImportedGood(String description, int quantity, BigDecimal price) {
		super(description, quantity, price);
	}

	/**
	 * Constructor for an Item, without giving the type of the Item and giving the id
	 * @param id
	 * @param description
	 * @param quantity
	 * @param price
	 */
	public NonImportedGood(String id, String description, int quantity, BigDecimal price) {
		super(id, description, quantity, price);
	}

	/**
	 * Compute the price of the Non Imported Good, by checking if it is needed to
	 * apply the BASIC_SALE_TAX to the Item or not
	 * @return
	 */
	public BigDecimal computePrice(){
		switch (this.getGoodtype()) {
        case BOOK:
        case FOOD:
        case MEDICAL_PRODUCT:
        	return this.getPrice();
        case OTHER:
        default:
        	this.computeSaleTax();
        	this.setPrice(this.getPrice().add(this.getSalesTax()));
        	return this.getPrice();
		}
	}

	/**
	 * Compute the sale tax of the Non Imported Good
	 */
	public BigDecimal computeSaleTax(){
		switch (this.getGoodtype()) {
		case BOOK:
		case FOOD:
		case MEDICAL_PRODUCT:
			return this.getSalesTax();
		case OTHER:
		default:
			this.setSalesTax(Helper.roundUpTo(this.getPrice().multiply(new BigDecimal(BASIC_SALE_TAX)).setScale(2, BigDecimal.ROUND_UP), new BigDecimal("0.05")));
			return this.getSalesTax();
		}
	}
}
