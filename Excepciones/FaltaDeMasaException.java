import java.io.*;

public class FaltaDeMasaException extends ErrorDePizzaException{
	public FaltaDeMasaException() {
		super("No hay suficiente masa.");
	}
	public FaltaDeMasaException(String sms) {
		super(sms);
	}
}
