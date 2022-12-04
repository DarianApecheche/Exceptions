import java.io.*;

public class ErrorDePizzaException extends ErrorDeOrdenException{
	public ErrorDePizzaException() {
		super("Ha ocurrido un error en la orden de la pizza.");
	}
	public ErrorDePizzaException(String sms) {
		super(sms);
	}
}
