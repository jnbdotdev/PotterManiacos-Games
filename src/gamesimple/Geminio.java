package gamesimple;

import java.util.Scanner;

public class Geminio {

	
	public static void main(String[] args) throws java.lang.Exception {
        
		@SuppressWarnings({ "resource", "unused" })
		Scanner enter = new Scanner(System.in);
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        @SuppressWarnings("resource")
		Scanner leitor1 = new Scanner(System.in);
    	char opcao1;
        String palavra = s.nextLine();
        
        int i;

        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (i = 0; i < palavra.length(); i++) {
            char a = palavra.charAt(i);
            System.out.print(""+ a + a);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("\n=== DIGITE UM NUMERO PARA SELECIONAR UM GAME ===");	
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

	}
 
        
	}
	
}


