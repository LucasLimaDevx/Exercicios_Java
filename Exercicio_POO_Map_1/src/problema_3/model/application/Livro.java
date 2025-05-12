package problema_3.model.application;

import java.util.Objects;

public class Livro {
	private String codigo;
	private String titulo;
	private Boolean emprestado;
	
	public Livro(String codigo, String titulo, Boolean emprestado) {
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.emprestado = emprestado;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Boolean getEmprestado() {
		return emprestado;
	}
	public void setEmprestado(Boolean emprestado) {
		this.emprestado = emprestado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, emprestado, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(emprestado, other.emprestado)
				&& Objects.equals(titulo, other.titulo);
	}
	
	
	
	
}
