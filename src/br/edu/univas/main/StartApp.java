package br.edu.univas.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StartApp {
	
	// 03/05/22
	
	/*
	Estudar:
		CSV File 
		Variável de Ambiente
	*/
	
	/*
	Hora de fazer uma chamada!
	Crie um programa em Java que irá ler um arquivo CSV. O conteúdo do arquivo será o nome das
		disciplinas disponíveis para fazer a chamada.
	Seu programa deverá saber de onde ler esse arquivo através de uma variável de ambiente chamada:
		CSV_FILE.
	Seu programa deverá apresentar um menu como esse exemplo abaixo:
		:::CHAMADA:::
		1 - Disciplina A
		2 - Disciplina B
		3 - Disciplina C
		9 - Sair
	Quando o usuário selecionar a disciplina, ele deverá escrever o nome dos alunos presentes. Seu programa 
		deverá salvar o arquivo,no mesmo diretório que ele leu o arquivo CSV, utilizando o seguinte formato:
			disciplina_a_dd_mm_yyyy.txt
	Onde:
		• disciplina_a : é o nome da disciplina, porem toda em minúsculo e sem espaço, sem caracter especial.
		• dd : é o dia da chamada (dia atual)
		• mm : é o mês da chamada (mês atual)
		• yyyy : é o ano da chamada (ano atual)
		Por exemplo: se estiver fazendo a chamada para a disciplina “Técnicas de Programação 3” no dia 28 de
			fevereiro de 2022, o arquivo de saída deverá ficar com o seguinte nome:
		• tecnicas_de_programacao_3_28_02_2022.txt
	No arquivo deverá conter o nome de cada aluno presente em uma linha separado. 
	*/
	
	public static void main(String[] args) {
		String path = "C:\\Users\\labunivas06\\Desktop\\MatR - P3\\students.csv";
		String line = "";
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader(path));
			while((line = reader.readLine()) != null) {
				
				String[] row = line.split(",");
				
				for(String index : row) {
					System.out.printf("%-10s", index);
				}
				System.out.println();
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
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