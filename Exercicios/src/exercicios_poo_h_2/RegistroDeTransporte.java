package exercicios_poo_h_2;

import java.util.ArrayList;
import java.util.List;

public class RegistroDeTransporte {
	List<Transporte> transportes = new ArrayList<>();
	
	public void adicionarTransporte(Transporte transporte) {
		transportes.add(transporte);
	}
	
	
	public void listarTransporte() {
		for(Transporte t : transportes) {
			if(t instanceof Aviao) {
				Aviao a = (Aviao) t;
				
				System.out.println(a.getOrigem() + " --> " + a.getDestino() + " - R$"+String.format("%.2f", a.getValor()));
			}
		}
	}
}
