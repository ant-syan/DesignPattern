package model;

public class FixedAmountTaxCalculator implements TaxComputationStrategy {

	public static final double TAX_AMOUNT_BELOW_BRACKET = 100.00;
	public static final double TAX_AMOUNT_INCLUSIVE_ABOVE_BRACKET = 200.00;
	public static final int TAX_BRACKET_5000 = 5000;
	
	@Override
	public double computeTax(double amount) {
		if (amount < TAX_BRACKET_5000) {
			return TAX_AMOUNT_BELOW_BRACKET;
		}
		return TAX_AMOUNT_INCLUSIVE_ABOVE_BRACKET;
	}

}
