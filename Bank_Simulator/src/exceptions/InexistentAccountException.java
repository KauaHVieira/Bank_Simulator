package exceptions;

public class InexistentAccountException extends RuntimeException{
	

	public InexistentAccountException(String msg) {
		super(msg);
	}
}
