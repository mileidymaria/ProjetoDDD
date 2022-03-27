package biblioteca;

public class Revista extends Publicacao{

	private int periodicidadeEmdias;
	
	public Revista(long id, String titulo, int numExemplares, Area area, int periodicidadeEmdias) {
		super(id, titulo, numExemplares, area);
		this.periodicidadeEmdias = periodicidadeEmdias;
	}

}
