import java.util.Scanner;

import util.Conversao;
public class Main {

	public static void main(String[] args) {
		Conversao conv = new Conversao();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?");
		 conv.CotacaoDolar   = sc.nextDouble();
		 
		System.out.print("How many dollars will be bought?");
         conv.Quantidade  = sc.nextDouble();
         
		System.out.printf("Amount to be paid in reais = %.2f%n ", conv.Preco());
	}

}
