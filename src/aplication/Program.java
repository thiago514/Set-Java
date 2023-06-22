package application;

import java.util.HashSet;
import java.util.Scanner;

import entities.Aluno;

class Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
            Digite a opção desejada
        1    TreeSet;
        2    HashSet;
        3   LinkedHashSet;
        """);

        switch (sc.nextInt()) {
            case 1 -> treeSet();

            case 2 -> hashSet();

            case 3 -> linkedHashSet();
        }
    }
    public static void treeSet(){
        long startTime = System.nanoTime();

        System.out.println("adsfklçasjdf");
        // Criando um objeto HashSet
        HashSet<String> conjunto = new HashSet<String>();

        // Adicionando elementos ao conjunto
        conjunto.add("A");
        conjunto.add("B");
        conjunto.add("C");

        // Iterando através do conjunto
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
        System.out.println(System.nanoTime() - startTime);
    }
    public static void hashSet(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar dateAluno = Calendar.getInstance();
		dateAluno.setTime(sdf.parse("15/08/1999"));

        long startTime = System.nanoTime();
		
        Set<Aluno> setAluno = new TreeSet<>();
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



        System.out.println(System.nanoTime() - startTime);
    }
    public static void linkedHashSet(){
        long startTime = System.nanoTime();


        System.out.println(System.nanoTime() - startTime);
    }
    
}
