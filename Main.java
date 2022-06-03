package ArvoreTrabalho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Arvore arvore = new Arvore();
		
		while (true) {
			try {
				Scanner obj = new Scanner(System.in);
				String n = obj.nextLine();
				
				String[] dados = n.split(" ");
				int cont = 0;
				for (String dado : dados) {
					if(dado.equals("(")) {
						cont++;
					}else if(dado.equals(")")) {
						cont--;
					}
					if(cont<0) {
						break;
					}
				}
				
				if(cont == 0) {
					System.out.println("expressao valida");					
					No et = arvore.criarArvore(dados);
					System.out.println("Resultado  = " + et.calcular());
				}


			} catch (Exception e) {
			}
		}
	}

}
