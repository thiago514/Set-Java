package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

import entities.Aluno;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		Set<Aluno> setAluno = new TreeSet<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar dateAluno = Calendar.getInstance();
		dateAluno.setTime(sdf.parse("15/08/1999"));
		
		setAluno.add(
				new Aluno(12341230L, "Pedro Araujo", dateAluno)
				);
		
		//Não vai ser adicionado por ser igual ao primeiro
		setAluno.add(
				new Aluno(12341230L, "Mateus", dateAluno)
				);
		
		setAluno.add(
				new Aluno(12341234L, "Fabio", dateAluno)
				);
		setAluno.add(
				new Aluno(12341232L, "Carlos", dateAluno)
				);
		setAluno.add(
				new Aluno(12341231L, "Marcos", dateAluno)
				);
		
		for(Aluno a : setAluno) {
			System.out.println(a);
		}
		
	}
}
