package enities;

import java.math.BigDecimal;

import good_types.GoodType;

public abstract class Item {

	private String description;
	private int quantity;
	private BigDecimal price;
	private BigDecimal salesTax;
	private GoodType goodtype;

	/**
	 * Constructor for an Item, given also the type of the Item
	 * @param description
	 * @param quantity
	 * @param price
	 * @param goodtype
	 */
	public Item(String description, int quantity, BigDecimal price, GoodType goodtype) {
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.salesTax = BigDecimal.ZERO;
		this.goodtype = goodtype;
	}

	/**
	 * Constructor for an Item, without giving the type of the Item
	 * @param description
	 * @param quantity
	 * @param price
	 */
	public Item(String description, int quantity, BigDecimal price) {
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.salesTax = BigDecimal.ZERO;
		this.goodtype = GoodType.OTHER;
	}

	/**
	 * Getter for the description of the Item
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Getter for the quantity of the Item
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Getter for the price of the Item
	 * @return
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * Getter for the tax sale of the Item
	 * @return
	 */
	public BigDecimal getSalesTax() {
		return salesTax;
	}

	/**
	 * Getter for the type of the Item
	 * @return
	 */
	public GoodType getGoodtype() {
		return goodtype;
	}

	/**
	 * Setter for the description of the Item
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Setter for the quantity of the Item
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Setter for the price of the Item
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * Setter for the tax sale of the Item
	 * @param salesTax
	 */
	public void setSalesTax(BigDecimal salesTax) {
		this.salesTax = salesTax;
	}

	/**
	 * Setter for the type of the Item
	 * @param goodtype
	 */
	public void setGoodtype(GoodType goodtype) {
		this.goodtype = goodtype;
	}

	/**
	 * ToString method for the Item object
	 */
	@Override
	public String toString() {
		return this.quantity+ " "+this.description + ": "+ (this.getPrice().multiply(new BigDecimal(this.getQuantity())));
	}

}
