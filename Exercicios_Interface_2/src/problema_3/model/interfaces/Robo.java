package problema_3.model.interfaces;

public interface Robo {
	default String mover() {
		return "Movendo-se";
	}
	String executarTarefa();
}
