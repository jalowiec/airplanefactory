package airplanefactory;

import java.math.BigDecimal;

public class AirplaneB747 extends Airplane {
	
	private AirplaneModel airplaneModel = AirplaneModel.B747;
	private BigDecimal price = new BigDecimal(10000000);

	@Override
	public BigDecimal calculatePrice() {
		
		return price;
	}

}
