import java.io.*;

public class ErrorDeOrdenException extends Exception{
	public ErrorDeOrdenException() {
		super("Ha ocurrido un error en la orden.");
	}
	public ErrorDeOrdenException(String sms) {
		super(sms);
	}
}
