package model;

public class PercentageTaxCalculator implements TaxComputationStrategy {

	public static final double TAX_PERCENT_BELOW_BRACKET = 0.10;
	public static final double TAX_PERCENT_INCLUSIVE_ABOVE_BRACKET = 0.15;
	public static final int TAX_BRACKET_5000 = 5000;
	
	@Override
	public double computeTax(double amount) {
		if (amount < TAX_BRACKET_5000) {
			return amount * TAX_PERCENT_BELOW_BRACKET;
		}
		return amount * TAX_PERCENT_INCLUSIVE_ABOVE_BRACKET;
	}

}
