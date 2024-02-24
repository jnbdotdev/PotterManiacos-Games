package gamesimple;

import java.util.Scanner;

public class Espelho {

		public static void main(String []args)throws Exception {
			
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			Scanner leitor1 = new Scanner(System.in);
			char opcao;
			
			String frase = s.nextLine();
			String fraseInvertida = new StringBuilder(frase).reverse().toString();
			System.out.println("");
			System.out.println("");
		    System.out.println(fraseInvertida);
		    System.out.println("");
		    System.out.println("");
				
				System.out.println("=== DIGITE UM NUMERO PARA SELECIONAR UM GAME ===");	
				System.out.println("[1] Desmembrando");
				System.out.println("[2] Espelho");
				System.out.println("[3] Geminio");
				System.out.println("[4] Pontilhado");
				System.out.println("[5] Separador");
				System.out.println("[6] T9");
				System.out.println("[7] Finalizar");
				System.out.println("================================================");
				
				opcao = leitor1.next().charAt(0);
			      if(opcao == '1'){
					gamesimple.Main.main(args);
			}else if(opcao == '2'){
					gamesimple.Espelho.main(args);
			}else if(opcao == '3') {
					gamesimple.Geminio.main(args);
			}else if(opcao == '4') {
					gamesimple.Pontilhado.main(args);
			}else if(opcao == '5') {
					gamesimple.Separador.main(args);
			}else if(opcao == '6') {
					gamesimple.T9.main(args);
			}else if(opcao == '7') {
				System.out.println("Finalizado!");
				leitor1.close();
			}
				
			}
}
