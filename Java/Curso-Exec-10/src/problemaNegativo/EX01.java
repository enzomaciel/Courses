package problemaNegativo;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = ler.nextInt();
		int[] vect = new int[n];
		if(n<=10) {
			for(int i=0; i<n; i++) {
				System.out.print("Digite um numero: ");
				vect[i] = ler.nextInt();
			}
			System.out.println("Numeros negativos");
			for(int i=0; i<n; i++) {
				if(vect[i]<0) {
					System.out.println(vect[i]);
				}
			}
		}else {
			System.out.println("Memoria não suporta mais de 10 numeros");
		}
		ler.close();
	}

}
