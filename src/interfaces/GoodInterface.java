/**
 * @author	Tiziano Antico
 * This class is used to create an interface for the Good class
 */

package interfaces;

import java.math.BigDecimal;

public interface GoodInterface {
	BigDecimal computeSaleTax();
	BigDecimal computePrice();
}
