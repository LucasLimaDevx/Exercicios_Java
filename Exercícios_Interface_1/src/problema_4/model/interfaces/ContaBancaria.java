package problema_4.model.interfaces;

public interface ContaBancaria {
	void depositar(Double deposito);
	void saque(Double saque);
	double verificarSaldo();
}
