package model.services;

public class BrazilTaxService implements TaxService {

	public double tax(double amount) {

		 return (amount <= 100.0) ? amount * 0.2 : amount * 0.15;

		/*if (amount <= 100.0) {
			return amount * 0.2;

		} else {
			return amount * 0.15;
		}*/

	}

}
