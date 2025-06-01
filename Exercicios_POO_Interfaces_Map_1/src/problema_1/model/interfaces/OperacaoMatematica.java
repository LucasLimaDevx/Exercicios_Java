package problema_1.model.interfaces;

public interface OperacaoMatematica {
	public <T extends Number > Number calcular(T n1, T n2);
}
