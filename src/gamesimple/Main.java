package gamesimple;

import java.util.Scanner;

public class Main {

	public static void main(String[] palavras) throws Exception{

		boolean continuar = true;
		char opcao;
		char opcao1;
		Scanner entrada= new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		Scanner leitor = new Scanner(System.in);
		
	while(continuar) {	
		String palavra = input.nextLine();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		while (!palavra.isEmpty()) {
		palavra = palavra.replaceAll("_", " ");
		System.out.println(palavra);
		if (!palavra.isEmpty()) palavra = palavra.substring (1); 
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Digite 'p' para parar: ");
        opcao = entrada.next().charAt(0);
        if(opcao=='p'){
        continuar=false;
        System.out.println("Finalizado");
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
		
		opcao1 = leitor.next().charAt(0);
	      if(opcao1 == '1'){
			gamesimple.Main.main(palavras);
	}else if(opcao1 == '2'){
			gamesimple.Espelho.main(palavras);
	}else if(opcao1 == '3') {
			gamesimple.Geminio.main(palavras);
	}else if(opcao1 == '4') {
			gamesimple.Pontilhado.main(palavras);
	}else if(opcao1 == '5') {
			gamesimple.Separador.main(palavras);
	}else if(opcao1 == '6') {
			gamesimple.T9.main(palavras);
	}else if(opcao1 == '7') {
		System.out.println("Finalizado!");
		
		leitor.close();
	}
       
        
        
        input.close();
        entrada.close();
        leitor.close();
         	
      }
	}
  }
}
		
			
		


