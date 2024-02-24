package gamesimple;

import java.util.Scanner;

public class uniao {

	public static void main(String[] args) throws Exception {
		Scanner leitor1 = new Scanner(System.in);
		char opcao1;
		
		System.out.println("=== DIGITE UM NUMERO PARA SELECIONAR UM GAME ===");	
		System.out.println("[1] Desmembrando");
		System.out.println("[2] Espelho");
		System.out.println("[3] Geminio");
		System.out.println("[4] Pontilhado");
		System.out.println("[5] Separador");
		System.out.println("[6] T9");
		System.out.println("[7] Finalizar");
		System.out.println("================================================");
		
		opcao1 = leitor1.next().charAt(0);
	      if(opcao1 == '1'){
			gamesimple.Main.main(args);
	}else if(opcao1 == '2'){
			gamesimple.Espelho.main(args);
	}else if(opcao1 == '3') {
			gamesimple.Geminio.main(args);
	}else if(opcao1 == '4') {
			gamesimple.Pontilhado.main(args);
	}else if(opcao1 == '5') {
			gamesimple.Separador.main(args);
	}else if(opcao1 == '6') {
			gamesimple.T9.main(args);
	}else if(opcao1 == '7') {
		System.out.println("Finalizado!");
		leitor1.close();
	}
		
	}

}
