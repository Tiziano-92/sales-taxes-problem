package enities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Receipt {

	public List<Item> receipt = new ArrayList<Item>();
	private BigDecimal totalSalesTax = BigDecimal.ZERO;
	private BigDecimal totalAmount = BigDecimal.ZERO;

	/**
	 * Getter for the totalSalesTax
	 * @return
	 */
	public BigDecimal getTotalSalesTax() {
		return totalSalesTax;
	}

	/**
	 * Getter for the totalAmount
	 * @return
	 */
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	/**
	 * Setter for the totalSalesTax
	 * @param totalSalesTax
	 */
	public void setTotalSalesTax(BigDecimal totalSalesTax) {
		this.totalSalesTax = totalSalesTax;
	}

	/**
	 * Setter for the totalAmount
	 * @param totalAmount
	 */
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * Add an Item to the receipt
	 * @param item
	 */
	public void addItem(Item item){
		receipt.add(item);
	}

	/**
	 * Compute the total amount of taxes for this receipt
	 * @return
	 */
	public BigDecimal computeTotalSalesTax(){
		for (Item item : this.receipt){
			this.setTotalSalesTax(this.totalSalesTax.add((item.getSalesTax()).multiply(new BigDecimal(item.getQuantity()))));
		}
		return this.totalSalesTax;
	}

	/**
	 * Compute the total amount of payment for this receipt
	 * @return
	 */
	public BigDecimal computeTotalAmount(){
		for (Item item : this.receipt){
			this.setTotalAmount(this.totalAmount.add((item.getPrice().multiply(new BigDecimal(item.getQuantity())))));
		}
		return this.totalAmount;
	}


	/**
	 * Clean the receipt
	 */
	public void clean(){
		this.receipt.clear();
		this.totalSalesTax = BigDecimal.ZERO;
		this.totalAmount = BigDecimal.ZERO;
	}

	@Override
	public String toString() {
		String output = "";

		for (Item item : this.receipt){
			output += item.toString() + "\n";
		}
		output += "Sales Taxes: "+this.computeTotalSalesTax() + "\n" + "Total: "+this.computeTotalAmount();

		return output;
	}
}
