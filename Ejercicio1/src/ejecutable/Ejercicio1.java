package ejecutable;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numeroLeido=0; int sumaPares=0; int impares=0; int ceros=0; int pares=0;double media=0;
		Scanner leer=new Scanner(System.in);
		System.out.println("Necesito un número, si es negativo finalizaremos");
		numeroLeido=leer.nextInt();
		while (numeroLeido>=0) {
		if(numeroLeido >=0) {
			if (numeroLeido %2==0 && numeroLeido !=0) {
				sumaPares+=numeroLeido;
				pares++;
			}
			else if (numeroLeido %2 !=0) {
				impares++;
			}
			else if (numeroLeido ==0) {
				ceros++;
			}			
		}
		numeroLeido=leer.nextInt();			
		}
		System.out.println("FIN");		
		System.out.println("Numero de impares " + impares);
		System.out.println("Suma pares " + sumaPares);
		System.out.println("Numero de ceros "+ceros);
			
		}
	
	}	

	


