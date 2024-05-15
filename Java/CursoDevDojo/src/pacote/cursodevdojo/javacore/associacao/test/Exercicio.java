package pacote.cursodevdojo.javacore.associacao.test;
import java.util.*;
import pacote.cursodevdojo.javacore.associacao.exercicio.*;

public class Exercicio {
/*
Crie um sistema que gerencie seminários
O sitema deverá cadastrar seminários, estudantes, professores e local onde será realizado

Um aluno poderá estar em apenas um seminário
Um seminário poderá ter nenhum ou vários alunos
Um professor poderá ministrar vários seminários
Um seminário deve ter um local

Campos básicos (excluindo relacionamento)
Seminário: titulo 
aluno: nome e idade
Professor: nome, especialidade 
local: endereço
 */
	public static void main (String[] args) {
		//A ideia por trás do exercício é apenas demosntrar as relações de associação, e não criar um sisteminha funcional de cadastro de seminários. Tudo será estático, sem leitura
		Aluno aluno1 = new Aluno("Matheus",21);
		Aluno aluno2 = new Aluno("Juliana",24);
		Aluno aluno3 = new Aluno("Fulano",20);
		Aluno aluno4 = new Aluno("Ciclano",22);
		Professor prof1 = new Professor("Kleber","Redes");
		Professor prof2 = new Professor("Ana","POO");
		Seminario sem1 = new Seminario("Importância das redes de computadores");
		Seminario sem2 = new Seminario("Origem da Programaçãoa Orientada a Objetos");
		Local loc1 = new Local("Teatro UFG");
		Local loc2 = new Local("Teatro IFG");
		aluno1.setSeminario(sem1);
		aluno2.setSeminario(sem1);
		aluno3.setSeminario(sem2);
		aluno4.setSeminario(sem2);
		prof1.setSeminarios(new Seminario[]{sem1});
		prof2.setSeminarios(new Seminario[] {sem2});
		sem1.setAlunos(new Aluno[] {aluno1,aluno2});
		sem1.setLocal(loc1);
		sem2.setAlunos(new Aluno[] {aluno3,aluno4});
		sem2.setLocal(loc2);
		
		sem1.imprime();
		sem2.imprime();
		
		for(Aluno aluno : new Aluno[]{aluno1,aluno2,aluno3,aluno4}) {
			aluno.imprime();
		}
		
		prof1.imprime();
		prof2.imprime();
		
	}
}
