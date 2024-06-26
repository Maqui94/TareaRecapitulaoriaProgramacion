package javabean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	static void menu(){
		System.out.println("¿Qué opción elige?");
		System.out.println("----------------------------");
		System.out.println("1. Coca Cola---------1,30 €");
		System.out.println("2. Fanta Naranja-----1,20 €");
		System.out.println("3. Fanta Limón-------1,20 €");
		System.out.println("4. Agua--------------1,00 €");
		System.out.println("----------------------------");
		System.out.println("5. Apagar máquina");
	}
	
	public static void main(String[] args) {
		List<Bebida>productosElegidos = new ArrayList<>(); 
		Scanner leer = new Scanner(System.in);
		int opcion;
		double total=0.0;
		Bebida CocaCola =new Bebida("Coca Cola", 1.30);
		Bebida FantaNaranja =new Bebida("Fanta Naranja", 1.20);
		Bebida FantaLimon =new Bebida("Fanta Limón", 1.20);
		Bebida Agua =new Bebida("Agua", 1.00);
		
		while (true){
			
			menu();
			
			opcion=leer.nextInt();
			
			if (opcion ==1) {
				productosElegidos.add(CocaCola);
				total = total + CocaCola.getPrecio();
			}
			else if (opcion ==2) {
				productosElegidos.add(FantaNaranja);
				total = total + FantaNaranja.getPrecio();
			}
			else if (opcion ==3) {
				productosElegidos.add(FantaLimon);
				total = total + FantaLimon.getPrecio();
			}
			else if (opcion ==4) {
				productosElegidos.add(Agua);
				total = total + Agua.getPrecio();
			}
			else if (opcion ==5) {
				break;
			}
			else {
				System.out.println("OPCION INCORRECTA");
			}
			
		} 
		System.out.println("HASTA PRONTO");
		System.out.println("INFORME DE VENTAS");
		for (Bebida producto : productosElegidos) {
			System.out.println("Servicio " + producto);
		}
		System.out.println("RECAUDACIÓN: " + total);
	}
	
}
