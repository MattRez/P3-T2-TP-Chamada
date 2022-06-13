package br.edu.univas.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StartApp {
	
	/*
	Hora de fazer uma chamada!
	Crie um programa em Java que ir� ler um arquivo CSV. O conte�do do arquivo ser� o nome das
		disciplinas dispon�veis para fazer a chamada.
	Seu programa dever� saber de onde ler esse arquivo atrav�s de uma vari�vel de ambiente chamada:
		CSV_FILE.
	Seu programa dever� apresentar um menu como esse exemplo abaixo:
		:::CHAMADA:::
		1 - Disciplina A
		2 - Disciplina B
		3 - Disciplina C
		9 - Sair
	Quando o usu�rio selecionar a disciplina, ele dever� escrever o nome dos alunos presentes. Seu programa 
		dever� salvar o arquivo,no mesmo diret�rio que ele leu o arquivo CSV, utilizando o seguinte formato:
			disciplina_a_dd_mm_yyyy.txt
	Onde:
		� disciplina_a : � o nome da disciplina, porem toda em min�sculo e sem espa�o, sem caracter especial. //TODO
		� dd : � o dia da chamada (dia atual)
		� mm : � o m�s da chamada (m�s atual)
		� yyyy : � o ano da chamada (ano atual)
		Por exemplo: se estiver fazendo a chamada para a disciplina �T�cnicas de Programa��o 3� no dia 28 de
			fevereiro de 2022, o arquivo de sa�da dever� ficar com o seguinte nome:
		� tecnicas_de_programacao_3_28_02_2022.txt
	No arquivo dever� conter o nome de cada aluno presente em uma linha separado.
	*/
	
	public static void main(String[] args) throws Exception {
		
		String file = System.getenv("CSV_FILE");//"C:\\Users\\Cliente\\Desktop\\P3-T2-TecPro\\csv_file.csv";
		//printCsvFile(line, reader);
		
		Scanner scan = new Scanner(System.in);
		
		int opt = 0;
		do {
			printMenu(file);
			opt = readInt(scan);
			if(opt!=0) {
				createPresenceList(getDisciplineName(opt, file), scan);
			} else {
				System.out.println("Programa Finalizado :)");
			}
		} while(opt != 0);
		
		
		/*
		String file = "C:\\Users\\Cliente\\Desktop\\P3-T2-TecPro\\csv_file.csv";
		
		// System.getenv("CSV_FILE");
		String line = "";
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		printCsvFile(line, reader);
		*/
		scan.close();
	}
	
	public static void printMenu(String file) {
		System.out.println(":::CHAMADA:::");
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String line = "";
		try {
			while((line = reader.readLine()) != null) {
				String[] disciplines = line.split(",");
				
				for(int i=0; i<disciplines.length; i++) {// ainda � to acostumado com for each
					System.out.println((i+1) + " - " + disciplines[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("0 - Sair");
		System.out.println("Por Favor, Digite uma Op��o: ");
	}
	
	public static void printCsvFile(String line, BufferedReader reader) {
		try {
			while((line = reader.readLine()) != null) {
				
				String[] row = line.split(",");
				
				for(String index : row) {
					System.out.printf("%-10s", index);
				}
				System.out.println();
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void createPresenceList(String name, Scanner scan) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("C:\\Users\\Cliente\\Desktop\\"
					+ "P3-T2-TecPro\\" + createFileName(name) + ".txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		StringBuilder sb = new StringBuilder();
		
		String str = null;
		while(str != "") {
			str = scan.nextLine();
			
			if(!str.isBlank()) {// NOT Blank
				sb.append(str);
				sb.append("\r\n");
			} else {// Blank
				
			}
		}
		
		pw.write(sb.toString());
		pw.close();
	}
	
	private static String getDisciplineName(int opt, String file) {
		// TODO
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String line = "";
		try {
			while((line = reader.readLine()) != null) {
				String[] disciplines = line.split(",");
				
				for(int i=0; i<disciplines.length; i++) {
					if(i==opt) {
						return disciplines[i-1];
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
	private static String createFileName(String name) {
		name = name.toLowerCase();
		name = name.replaceAll("a-zA-Z0-9", "");
		name = replaceSpecChars(name);
		name = name.replace(" ", "_");
		name = name.concat("_" + addDate());
		return name;
	}
	
	private static String addDate() {
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MM_yyyy");
		return date.format(formatter);
	}
	
	private static String replaceSpecChars(String name){
		// � deu tempo de pensar em outra coisa
		
		name = name.replace("�", "a");
		name = name.replace("�", "o");
		name = name.replace("�", "e");
		
		name = name.replace("�", "a");
		name = name.replace("�", "o");
		
		name = name.replace("�", "a");
		name = name.replace("�", "e");
		name = name.replace("�", "i");
		name = name.replace("�", "o");
		name = name.replace("�", "u");
		
		name = name.replace("�", "c");
		
		return name;
	}
	
	private static int readInt(Scanner scan) {
		int num = 0;
		
		try {
			num = scan.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		
		scan.nextLine();
		return num;
	}
}
