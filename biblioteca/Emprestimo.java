package biblioteca;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Emprestimo extends DomainObject{
	private Date inicio;
	private Date previsaoEntrega;
	private Date entrega;
	private Aluno aluno;

	public Emprestimo(long id, Date inicio, Date previsaoEntrega, Date entrega, Aluno aluno) {
		super(id);
		this.inicio = inicio;
		this.previsaoEntrega = previsaoEntrega;
		this.entrega = entrega;
		this.aluno = aluno;
	}

	public int obterDiasEmAtraso(){
		Long diff;
		diff = this.previsaoEntrega.getTime() - this.inicio.getTime(); //transforma em long e faz um diff entre os dois
		diff = TimeUnit.MILLISECONDS.toDays(diff);
		return diff.intValue();
	}
}
