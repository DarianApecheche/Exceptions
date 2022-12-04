import java.io.*;

public class FaltaDeZukoException extends ErrorDeRefrescoException{
	public FaltaDeZukoException() {
		super("No hay suficiente zuko.");
	}
	public FaltaDeZukoException(String sms) {
		super(sms);
	}
}