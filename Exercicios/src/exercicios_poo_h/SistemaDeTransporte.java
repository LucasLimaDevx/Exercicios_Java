package exercicios_poo_h;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeTransporte {
	List<Transporte> transportes = new ArrayList<>();
	
	public void adicionarTransporte(Transporte transporte) {
		transportes.add(transporte);
	}
	
	public void listarTransporte() {
		for(Transporte t : transportes) {
			if(t.getTipoDoTransporte() == TipoDoTransporte.ONIBUS) {
				System.out.println("Ônibus da linha \""+ t.getLinha()+"\" cadastrado");
			}else {
				System.out.println("Metro da linha \""+ t.getLinha()+"\" cadastrado");
			}
		}
	}
			
}
