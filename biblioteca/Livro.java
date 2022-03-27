package biblioteca;

import java.util.List;

public class Livro extends Publicacao{

	private String isbn;
	private List<Autor> autores;

	public Livro(long id, String titulo, int numExemplares, Area area, String isbn) {
		super(id, titulo, numExemplares, area);
		this.isbn = isbn;
	}

	public void adicionarAutor(Autor autor){
		this.autores.add(autor);
	}

	public void removerAutor(Autor autor){
		this.autores.remove(autor);
	}
}
