package br.edu.univas.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.edu.univas.controller.FileController;

public class StartApp {
	
	public static void main(String[] args) throws Exception {
		
		String file = System.getenv("CSV_FILE");//"C:\\Users\\Cliente\\Desktop\\P3-T2-TecPro\\csv_file.csv";
		
		Scanner scan = new Scanner(System.in);
		FileController fileCtrl = new FileController();
		
		int opt = 0;
		do {
			printMenu(file);
			opt = readInt(scan);
			if(opt!=0) {
				fileCtrl.createPresenceList(opt, file, scan);
			} else {
				System.out.println("Programa Finalizado :)");
			}
		} while(opt != 0);
		
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
				
				for(int i=0; i<disciplines.length; i++) {// ainda ñ to acostumado com for each
					System.out.println((i+1) + " - " + disciplines[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("0 - Sair");
		System.out.println("Por Favor, Digite uma Opção: ");
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
