import java.io.*;

public class FaltaDeAzucarException extends ErrorDeRefrescoException{
	public FaltaDeAzucarException() {
		super("No hay suficiente azucar.");
	}
	public FaltaDeAzucarException(String sms) {
		super(sms);
	}
}