package exceptions;

public class InsuficientBalanceException extends RuntimeException{
	
	public InsuficientBalanceException(String msg) {
		super(msg);
	}
}
