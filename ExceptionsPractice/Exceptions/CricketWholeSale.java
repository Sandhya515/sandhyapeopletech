package weekTwo.Exceptions;

public class CricketWholeSale {
	public void placeOrder(int quant)throws OrderException{
		if(quant<5)
			throw new OrderException(quant);
		else
			System.out.println("Order must have at least 5 items");
	}
	public static void main(String[] args) {
		CricketWholeSale sale = new CricketWholeSale();
		try {
			sale.placeOrder(24);
			sale.placeOrder(4);
		}catch(OrderException e) {
			System.out.println(e);
		}
	}

}
