package transaction;

import model.*;

public class TaxCalculatorClient {

	public static void main (String args[]) {
		double salary = 10000.00;
		TaxComputationStrategy fixedAmountCalc = new FixedAmountTaxCalculator();
		TaxComputationStrategy percentageCalculator = new PercentageTaxCalculator();
		
		System.out.println ("Fixed Amount Tax for " + salary + " is " + fixedAmountCalc.computeTax(salary));
		System.out.println ("Percentage Based Tax for " + salary + " is " + percentageCalculator.computeTax(salary));
	}
}
