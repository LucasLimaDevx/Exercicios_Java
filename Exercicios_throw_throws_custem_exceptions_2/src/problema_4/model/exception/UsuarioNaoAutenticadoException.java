package problema_4.model.exception;

public class UsuarioNaoAutenticadoException extends Exception{

	private static final long serialVersionUID = 1L;

	public UsuarioNaoAutenticadoException(String msg) {
		super(msg);
	}
}
