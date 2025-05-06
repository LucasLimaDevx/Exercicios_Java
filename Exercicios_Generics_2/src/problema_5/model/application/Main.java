package problema_5.model.application;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(verificarTipos(1, 2));
		System.out.println(verificarTipos("x", 10));
		System.out.println(verificarTipos(2.0, 3.1));
		System.out.println(verificarTipos(true, "true"));
	}
	
	public static <T, U> boolean verificarTipos(T obj1 ,U obj2) {
		
		if(obj1.getClass() == obj2.getClass()) {
			return true;
		}
		
		return false;
	}

}
