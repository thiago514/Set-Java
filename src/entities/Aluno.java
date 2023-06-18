package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{

	private Long matricula;
	
	private String nome;
	
	private Calendar nascimento;
	
	

	public Aluno(Long matricula, String nome, Calendar nascimento) {
		this.matricula = matricula;
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public Long getMatricula() {
		return matricula;
	}





	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}


	public Calendar getNascimento() {
		return nascimento;
	}





	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}


	
	@Override
	public int compareTo(Aluno o) {
		return (int) (matricula -o.getMatricula());
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", nascimento=" + sdf.format(nascimento.getTime()) + "]";
	}

	
	
	

}
