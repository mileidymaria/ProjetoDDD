package biblioteca;

public abstract class Publicacao extends DomainObject{

	private String titulo;
	private int numExemplares;
	private int numExemplaresEmprestados;
	private Area area;
	
	public Publicacao(long id, String titulo, int numExemplares, Area area) {
		super(id);
		this.titulo = titulo;
		this.numExemplares = numExemplares;
		this.area = area;
	}
	
	public int obterNumExemplaresDisponiveis() {
		return  this.numExemplares-this.numExemplaresEmprestados;
	}
	
	public int obterNumExemplares() {
		return numExemplares;
	}
	
	public void atualizarNumExemplares(int numExemplares) {
		this.numExemplares = numExemplares;
	}

}
