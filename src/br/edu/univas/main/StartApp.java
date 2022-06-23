package br.edu.univas.main;

import java.util.ArrayList;

public class StartApp {
	
	/*
	1. Seu programa deve montar uma árvore genérica de peças de um produto.
		a) O produto é a raiz.
		b) As peças e componentes (compostos) são nós internos.
		c) As folhas são peças simples.
	2. Funções para manipulação da árvore:
		a) Cadastro de um produto (raiz)
		b) Cadastro de componentes (sub-peças) do produto
		c) Busca dos componentes que são folhas
		d) Cálculo do custo total do produto.
	3. Cada peça/componente deve ter as seguintes informações
		a) Nome
		b) Valor unitário (este valor deve ser calculado nos nós internos)
		c) Quantidade (de componentes para montar uma unidade do nó pai)
		d) Lista de componentes filhos, ou seja, as sub-peças.
	4. Ao iniciar, o programa deve ler as informações do teclado e montar uma árvore contendo todos as componentes.
	5. Ao final, o programa deve:
		a) Imprimir custo total do produto.
		b) Imprimir uma lista com todos os componentes “folha”.
	6. Não é permitido usar classes do Java para manipulação de árvores.
	7. É permitido usar classes de listas, filas e pilhas do Java.
	8. Anotar no arquivo Readme.md as suas decisões não especificadas nesta descrição.
	9. Utilizar no mínimo 3 níveis e no máximo 5 níveis na árvore
	*/
	
	public static void main(String[] args) {
		
		ArrayList<String> input = new ArrayList<>();
		
		/*
		String line = "";
		while((line = reader.readLine()) != null) {
				String[] disciplines = line.split(",");
				
				for(int i=0; i<disciplines.length; i++) {
					if(i==opt) {
						return disciplines[i-1];
					}
				}
			}
		*/
		
		for(String argument : input) {
			
		}
	}
	
	ArrayList<String> fileInput() {
		//TODO
		
		return null;
	}
}
