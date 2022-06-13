package br.edu.univas.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileController {
	
	public static void main(String[] args) {
		
		try {
			
			
			
			
		} catch (Exception e) {
			
		} finally {
			
		}
		
	}
	
	private void createTxtFile() {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("C:\\Users\\Cliente\\Desktop\\"
					+ "P3-T2-TecPro\\book_table.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		
		sb.append("sl_no");
		sb.append(",");
		sb.append("book name");
		sb.append(",");
		sb.append("category");
		sb.append("\r\n");
		
		sb.append("sl_no 1");
		sb.append(",");
		sb.append("book name 1");
		sb.append(",");
		sb.append("category 1");
		sb.append("\r\n");
		
		sb.append("sl_no 2");
		sb.append(",");
		sb.append("book name 2");
		sb.append(",");
		sb.append("category 2");
		sb.append("\r\n");
		
		pw.write(sb.toString());
		pw.close();
	}
}
