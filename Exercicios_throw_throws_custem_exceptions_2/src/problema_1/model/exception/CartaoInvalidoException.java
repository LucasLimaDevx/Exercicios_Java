package problema_1.model.exception;

public class CartaoInvalidoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public CartaoInvalidoException(String msg) {
		super(msg);
	}
}
