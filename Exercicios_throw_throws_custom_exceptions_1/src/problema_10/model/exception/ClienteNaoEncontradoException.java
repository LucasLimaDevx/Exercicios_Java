package problema_10.model.exception;

public class ClienteNaoEncontradoException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public ClienteNaoEncontradoException(String msg) {
		super(msg);
	}
}
