import java.io.*;

public class ErrorDeRefrescoException extends ErrorDeOrdenException{
	public ErrorDeRefrescoException() {
		super("Ha ocurrido un error en la orden del refresco.");
	}
	public ErrorDeRefrescoException(String sms) {
		super(sms);
	}
}
