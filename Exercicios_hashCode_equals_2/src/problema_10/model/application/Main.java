package problema_10.model.application;

import java.util.HashMap;
import java.util.Map;

import problema_10.model.entities.Usuario;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Usuario> usuarios1 = new HashMap();
		Map<String, Usuario> usuarios2 = new HashMap();
		Map<String, Usuario> usuarios3 = new HashMap();
		Map<String, Usuario> usuarios4 = new HashMap();
		
		Usuario u1 = new Usuario("joao@gmail.com");
		Usuario u2 = new Usuario("maria@gmail.com");
		Usuario u3 = new Usuario("joao@gmail.com");
		Usuario u4 = new Usuario("ana@gmail.com");
		
		usuarios1.put(u1.getEmail(), u1);
		usuarios2.put(u2.getEmail(), u2);
		usuarios3.put(u3.getEmail(), u3);
		usuarios4.put(u4.getEmail(), u4);
		
		System.out.println(usuarios1.containsKey("joao@gmail.com"));
		System.out.println(usuarios2.containsKey("maria@gmail.com"));
		System.out.println(usuarios3.containsKey("maria@gmail.com"));
		System.out.println(usuarios4.containsKey("ana@gmail.com"));
	}

}
