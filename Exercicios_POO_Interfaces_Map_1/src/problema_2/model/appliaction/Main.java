package problema_2.model.appliaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import problema_2.model.entities.Circulo;
import problema_2.model.entities.FormaGeometrica;
import problema_2.model.entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Map<String, List<FormaGeometrica>> formasGeometricas = new HashMap<>();
		List<FormaGeometrica> retangulos = new ArrayList<>();
		List<FormaGeometrica> circulos = new ArrayList<>();
		
		retangulos.add(new Retangulo(5.0, 10.0));
		retangulos.add(new Retangulo(8.0, 12.0));
		circulos.add(new Circulo(7.0));
		circulos.add(new Circulo(3.0));
		
		formasGeometricas.put("Retângulo", retangulos);
		formasGeometricas.put("Circulo", circulos);

		
		for(String str : formasGeometricas.keySet()) {
			List<FormaGeometrica> fgs = formasGeometricas.get(str);
			
			for(int i = 0 ; i < fgs.size() ; i++) {
				
				FormaGeometrica fg = fgs.get(i);
				System.out.println(fg.toString() + ": " + (i+1));
				System.out.println("Área: " + String.format("%.2f", fg.calcularArea()) + ", Perímetro: " + String.format("%.2f", fg.calcularPerimetro()));
			}
			
			/*FormaGeometrica fg = formasGeometricas.get(str);
			System.out.println("Área: " + String.format("%.2f", fg.calcularArea()) + ", Perímetro: " + String.format("%.2f", fg.calcularPerimetro()))*/;
		}

	}

}
