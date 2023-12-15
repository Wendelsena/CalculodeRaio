import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double R, A;
		System.out.println("Digite o raio do cirulo:");
		
		Scanner sc = new Scanner(System.in);
		
		R = sc.nextDouble();	
		A = 3.14159 * Math.pow(R, 2.0);
		
		System.out.println("O valor do Área é: " + A);
		
		sc.close();
		

	}

}
