/**
 * @author	Tiziano Antico
 * This class runs and output the result of the JUnit Test
 */

package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(ReceiptJUnit.class);

      System.out.println("\nTest result = "+result.wasSuccessful()+"\n");

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
   }
}