package problema_2.model.exception;

public class EstoqueInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;

	public EstoqueInvalidoException(String msg) {
		super(msg);
	}
}
