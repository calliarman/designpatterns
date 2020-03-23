package behavioral.strategy;

import lombok.Data;

@Data
public class CreditCard {

	private String number;
	private String date;
	private String cvv;
	private ValidationStrategy strategy;
	
	public CreditCard(ValidationStrategy strategy) {
		this.strategy = strategy;
	}
	
	public boolean isValid() {
		return strategy.isValid(this);
	}

}
