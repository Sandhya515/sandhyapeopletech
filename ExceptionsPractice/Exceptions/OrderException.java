package weekTwo.Exceptions;

public class OrderException extends Exception
{
	int quant;
	public OrderException(int quant) {
		this.quant = quant;
	}
	public String toSting() {
		return "\nYour requested quantity is : "+quant;
	}
}
