package problema_4.model.exceptions;

public class SaldoInsuficienteException extends Exception{
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
