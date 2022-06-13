package br.edu.univas.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FileController {
	
	public void createPresenceList(int opt, String file, Scanner scan) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("C:\\Users\\Cliente\\Desktop\\"
					+ "P3-T2-TecPro\\" + createFileName(getDisciplineName(opt, file)) + ".txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		StringBuilder sb = new StringBuilder();
		
		String str = null;
		System.out.println("Por Favor, Digite o Nome dos Alunos Presentes:");
		System.out.println("Para Finalizar a Chamada, Pressione Enter no Campo Vazio");
		while(str != "") {
			str = scan.nextLine();
			
			if(!str.isBlank()) {
				sb.append(str);
				sb.append("\r\n");
			}
		}
		
		pw.write(sb.toString());
		pw.close();
	}
	
	public String getDisciplineName(int opt, String file) {
		
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
		// ñ deu tempo de pensar em outra coisa
		
		name = name.replace("ã", "a");
		name = name.replace("õ", "o");
		name = name.replace("ê", "e");
		
		name = name.replace("ª", "a");
		name = name.replace("º", "o");
		
		name = name.replace("á", "a");
		name = name.replace("é", "e");
		name = name.replace("í", "i");
		name = name.replace("ó", "o");
		name = name.replace("ú", "u");
		
		name = name.replace("ç", "c");
		
		return name;
	}
	
}
