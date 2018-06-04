/**
 * @author	Tiziano Antico
 * This class extends the abstract class Item. In this way you can create an instance of an object
 * which heritages the method of its subclass and creates of a new specific ones.
 */

package entities;

import java.math.BigDecimal;

import good_types.GoodType;
import helper.Helper;
import interfaces.GoodInterface;

public class ImportedGood extends Good implements GoodInterface {

	final String IMPORT_DUTY_TAX = "0.05"; // which corresponds to a discount of 5 %
	final String IMPORT_DUTY_BASIC_SALE_TAX = "0.15"; // which corresponds to a discount of 15 % (import duty tax + basic sale tax)

	/**
	 * Constructor for a ImportedGood item, given also the type of the Good
	 * @param description
	 * @param quantity
	 * @param price
	 * @param goodtype
	 */
	public ImportedGood(String description, int quantity, BigDecimal price, GoodType goodtype) {
		super(description, quantity, price, goodtype);
		this.computePrice();
	}

	/**
	 * Constructor for a ImportedGood item, without giving the type of the Item
	 * @param description
	 * @param quantity
	 * @param price
	 */
	public ImportedGood(String description, int quantity, BigDecimal price) {
		super(description, quantity, price);
		this.computePrice();
	}

	/**
	 * Compute the price of the Imported Good, by checking if it is needed to
	 * apply the BASIC_SALE_TAX to the Item or not
	 *
	 * @return
	 */
	public BigDecimal computePrice(){
		switch (this.getGoodtype()) {
        case BOOK:
        case FOOD:
        case MEDICAL_PRODUCT:
        	this.computeSaleTax();
        	this.setPrice((this.getPrice()).add(this.getSalesTax()));
        	return this.getPrice();
        case OTHER:
        default:
        	this.computeSaleTax();
        	this.setPrice(this.getPrice().add(this.getSalesTax()));
        	return this.getPrice();
		}
	}


	/**
	 * Compute the sale tax of the Imported Good
	 * @return
	 */
	public BigDecimal computeSaleTax(){
		switch (this.getGoodtype()) {
		case BOOK:
		case FOOD:
		case MEDICAL_PRODUCT:
			this.setSalesTax(Helper.roundUpTo(this.getPrice().multiply(new BigDecimal(IMPORT_DUTY_TAX)).setScale(2, BigDecimal.ROUND_UP), new BigDecimal("0.05")));
			return this.getSalesTax();
		case OTHER:
		default:
			this.setSalesTax(Helper.roundUpTo(this.getPrice().multiply(new BigDecimal(IMPORT_DUTY_BASIC_SALE_TAX)).setScale(2, BigDecimal.ROUND_UP), new BigDecimal("0.05")));
			return this.getSalesTax();
		}
	}
}
