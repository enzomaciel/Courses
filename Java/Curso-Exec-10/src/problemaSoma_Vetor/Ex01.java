package problemaSoma_Vetor;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = ler.nextInt();
		
		double[] vect = new double[n];
		double sum =0;
		
		for(int i=0; i<n ; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = ler.nextDouble();
		}
		System.out.print("VALORES =");
		for(int i=0;i<n;i++) {
			System.out.print(" " + vect[i]);
			sum += vect[i];
		}
		System.out.println("");
		System.out.println("SOMA =  " + sum);
		System.out.println("MEDIA = "+ (sum/n));
	}

}
