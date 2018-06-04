/**
 * @author	Tiziano Antico
 * Helper class which contains all the methods useful to be called in other classes,
 * in order to manage math operations.
 */

package helper;

import java.math.BigDecimal;

public class Helper {

	/**
	 * Method which computes the rounding up to the nearest 0.05 of a number
	 * @param number
	 * @param divisor
	 * @return
	 */
	public static BigDecimal roundUpTo(BigDecimal number, BigDecimal divisor){
		while (!(number.divideAndRemainder(divisor)[1]).equals(new BigDecimal("0.00"))){
			number = number.add(new BigDecimal("0.01"));
		}

		return number;
	}

}
