import java.io.*;

public class FaltaDeQuesoException extends ErrorDePizzaException{
	public FaltaDeQuesoException() {
		super("No hay suficiente queso.");
	}
	public FaltaDeQuesoException(String sms) {
		super(sms);
	}
}