/**
 * @author	Tiziano Antico
 * This class contains the shopping basket of the items bought.
 * It stores all the goods purchased by the person.
 */

package entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket_BACK {

	public List<Good> shoppingBasket;
	private BigDecimal totalSalesTax;
	private BigDecimal totalAmount;
	private String idBasket;


	/**
	 *
	 */
	public ShoppingBasket_BACK() {
		this.shoppingBasket = new ArrayList<Good>();
		this.totalSalesTax = BigDecimal.ZERO;
		this.totalAmount = BigDecimal.ZERO;
	}

	/**
	 *
	 * @param idBasket
	 */
	public ShoppingBasket_BACK(String idBasket) {
		this.shoppingBasket = new ArrayList<Good>();
		this.totalSalesTax = BigDecimal.ZERO;
		this.totalAmount = BigDecimal.ZERO;
		this.idBasket = idBasket;
	}

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
	 *
	 * @return
	 */
	public String getIdBasket() {
		return idBasket;
	}

	/**
	 *
	 * @param idBasket
	 */
	public void setIdBasket(String idBasket) {
		this.idBasket = idBasket;
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
	public void addItem(Good item){
		this.setTotalSalesTax(this.totalSalesTax.add((item.getSalesTax()).multiply(new BigDecimal(item.getQuantity()))));
		this.setTotalAmount(this.totalAmount.add((item.getPrice().multiply(new BigDecimal(item.getQuantity())))));
		item.setSalesTax((item.getSalesTax()).multiply(new BigDecimal(item.getQuantity())));
		this.shoppingBasket.add(item);
	}

	/**
	 * Clean the receipt
	 */
	public void clean(){
		this.shoppingBasket.clear();
		this.totalSalesTax = BigDecimal.ZERO;
		this.totalAmount = BigDecimal.ZERO;
	}

	@Override
	public String toString() {
		String output = "";

		for (Good item : this.shoppingBasket){
			output += item.toString() + "\n";
		}
		output += "Sales Taxes: "+this.getTotalSalesTax() + "\n" + "Total: "+this.getTotalAmount();

		return output;
	}
}
