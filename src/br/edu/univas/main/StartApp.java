package br.edu.univas.main;

import br.edu.univas.vo.Disciplina;

public class StartApp {
	
	// 03/05/22
	
	/*
	Estudar:
		CSV
		Vari�vel de Ambiente
	*/
	
	/*
	Hora de fazer uma chamada!
	Crie um programa em Java que ir� ler um arquivo CSV. O conte�do do arquivo ser� o nome das
		disciplinas dispon�veis para fazer a chamada.
	Seu programa dever� saber de onde ler esse arquivo atrav�s de uma vari�vel de ambiente chamada:
		CSV_FILE.
	Seu programa dever� apresentar um menu como esse exemplo abaixo:
		:::CHAMADA:::
		1 � Disciplina A
		2 � Disciplina B
		3 � Disciplina C
		9 � Sair
	Quando o usu�rio selecionar a disciplina, ele dever� escrever o nome dos alunos presentes. Seu programa 
		dever� salvar o arquivo,no mesmo diret�rio que ele leu o arquivo CSV, utilizando o seguinte formato:
			disciplina_a_dd_mm_yyyy.txt
	Onde:
		� disciplina_a : � o nome da disciplina, porem toda em min�sculo e sem espa�o, sem caracter especial.
		� dd : � o dia da chamada (dia atual)
		� mm : � o m�s da chamada (m�s atual)
		� yyyy : � o ano da chamada (ano atual)
		Por exemplo: se estiver fazendo a chamada para a disciplina �T�cnicas de Programa��o 3� no dia 28 de
			fevereiro de 2022, o arquivo de sa�da dever� ficar com o seguinte nome:
		� tecnicas_de_programacao_3_28_02_2022.txt
	No arquivo dever� conter o nome de cada aluno presente em uma linha separado. 
	*/
	
	public static void main(String[] args) {
		// TODO
		printMenu();
		
	}

	private static void printMenu() {
		// TODO
		System.out.println(":::CHAMADA:::");
		System.out.println("1 - Disciplina A");
		System.out.println("2 - Disciplina B");
		System.out.println("3 - Disciplina C");
		System.out.println("9 - Sair");
		
	}
}