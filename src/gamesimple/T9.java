package gamesimple;

import java.util.Scanner;

public class T9 {

	public static void main(String[] args) throws java.lang.Exception { 
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		Scanner leitor1 = new Scanner(System.in);
		char opcao;	
		String palavra = input.nextLine();
			
		palavra = palavra.replaceAll("a", "2");
		palavra = palavra.replaceAll("b", "2");
		palavra = palavra.replaceAll("c", "2");
		palavra = palavra.replaceAll("�", "2");
		palavra = palavra.replaceAll("d", "3");
		palavra = palavra.replaceAll("e", "3");
		palavra = palavra.replaceAll("f", "3");
		palavra = palavra.replaceAll("g", "4");
		palavra = palavra.replaceAll("h", "4");
		palavra = palavra.replaceAll("i", "4");
		palavra = palavra.replaceAll("j", "5");
		palavra = palavra.replaceAll("k", "5");
		palavra = palavra.replaceAll("l", "5");
		palavra = palavra.replaceAll("m", "6");
		palavra = palavra.replaceAll("n", "6");
		palavra = palavra.replaceAll("o", "6");
		palavra = palavra.replaceAll("p", "7");
		palavra = palavra.replaceAll("q", "7");
		palavra = palavra.replaceAll("r", "7");
		palavra = palavra.replaceAll("s", "7");
		palavra = palavra.replaceAll("t", "8");
		palavra = palavra.replaceAll("u", "8");
		palavra = palavra.replaceAll("v", "8");
		palavra = palavra.replaceAll("w", "9");
		palavra = palavra.replaceAll("x", "9");
		palavra = palavra.replaceAll("y", "9");
		palavra = palavra.replaceAll("z", "9");
		
		palavra = palavra.replaceAll("A", "2");
		palavra = palavra.replaceAll("B", "2");
		palavra = palavra.replaceAll("C", "2");
		palavra = palavra.replaceAll("D", "3");
		palavra = palavra.replaceAll("E", "3");
		palavra = palavra.replaceAll("F", "3");
		palavra = palavra.replaceAll("G", "4");
		palavra = palavra.replaceAll("H", "4");
		palavra = palavra.replaceAll("I", "4");
		palavra = palavra.replaceAll("J", "5");
		palavra = palavra.replaceAll("K", "5");
		palavra = palavra.replaceAll("L", "5");
		palavra = palavra.replaceAll("M", "6");
		palavra = palavra.replaceAll("N", "6");
		palavra = palavra.replaceAll("O", "6");
		palavra = palavra.replaceAll("P", "7");
		palavra = palavra.replaceAll("Q", "7");
		palavra = palavra.replaceAll("R", "7");
		palavra = palavra.replaceAll("S", "7");
		palavra = palavra.replaceAll("T", "8");
		palavra = palavra.replaceAll("U", "8");
		palavra = palavra.replaceAll("V", "8");
		palavra = palavra.replaceAll("W", "9");
		palavra = palavra.replaceAll("X", "9");
		palavra = palavra.replaceAll("Y", "9");
		palavra = palavra.replaceAll("Z", "9");
		
		palavra = palavra.replaceAll("�", "2");
		palavra = palavra.replaceAll("�", "2");
		palavra = palavra.replaceAll("�", "2");
		palavra = palavra.replaceAll("�", "2");
		palavra = palavra.replaceAll("�", "2");
		
		palavra = palavra.replaceAll("�", "2");
		palavra = palavra.replaceAll("�", "2");
		palavra = palavra.replaceAll("�", "2");
		palavra = palavra.replaceAll("�", "2");
		palavra = palavra.replaceAll("�", "2");
		
		palavra = palavra.replaceAll("�", "3");
		palavra = palavra.replaceAll("�", "3");
		palavra = palavra.replaceAll("�", "3");
		palavra = palavra.replaceAll("�", "3");
		
		palavra = palavra.replaceAll("�", "3");
		palavra = palavra.replaceAll("�", "3");
		palavra = palavra.replaceAll("�", "3");
		palavra = palavra.replaceAll("�", "3");
		
		palavra = palavra.replaceAll("�", "4");
		palavra = palavra.replaceAll("�", "4");
		palavra = palavra.replaceAll("�", "4");
		palavra = palavra.replaceAll("�", "4");
		
		palavra = palavra.replaceAll("�", "4");
		palavra = palavra.replaceAll("�", "4");
		palavra = palavra.replaceAll("�", "4");
		palavra = palavra.replaceAll("�", "4");
		
		palavra = palavra.replaceAll("�", "6");
		palavra = palavra.replaceAll("�", "6");
		palavra = palavra.replaceAll("�", "6");
		palavra = palavra.replaceAll("�", "6");
		palavra = palavra.replaceAll("�", "6");
		
		palavra = palavra.replaceAll("�", "6");
		palavra = palavra.replaceAll("�", "6");
		palavra = palavra.replaceAll("�", "6");
		palavra = palavra.replaceAll("�", "6");
		palavra = palavra.replaceAll("�", "6");
		
		palavra = palavra.replaceAll("�", "8");
		palavra = palavra.replaceAll("�", "8");
		palavra = palavra.replaceAll("�", "8");
		palavra = palavra.replaceAll("�", "8");
		
		palavra = palavra.replaceAll("�", "8");
		palavra = palavra.replaceAll("�", "8");
		palavra = palavra.replaceAll("�", "8");
		palavra = palavra.replaceAll("�", "8");
		
		palavra = palavra.replaceAll("_", " ");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(palavra);
		System.out.println("");
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
