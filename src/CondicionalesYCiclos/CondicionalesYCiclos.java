package CondicionalesYCiclos;

import java.util.Scanner;

public class CondicionalesYCiclos {

	public static void main(String[] args) {
		/*
		
		final int edad = 31; //que estra variable es constante, ya que tiene un valor final
		
		edad = 55;
		
		System.out.println("La edad es: " + edad);
		*/
		
		/*
		 * Condicionales
		 * if
		 * else
		 * else if
		 * switch
		 * 
		 */
		
		System.out.println("Programa para calcular la hora");
		
		//El equivalente al prompt en JS se llama Scanner
		
		
		//En java se crea un nuevo objeto Scanner, se llama hora y este será un nuevo objeto de la clase Scanner, que tiene los argumentos para guardar la información que le pase como entrada
		Scanner valorIngresado = new Scanner(System.in); //es un input (la entrada)
		
		System.out.println("Por favor ingresa un ahora en un formato de 24 horas");
		
		//En JS poníamos: var valorIngresado = prompt("mensaje"); en una sola línea (declaro variable, asigno el prompt y la info del prompt la guardo en esa variable)
		int hora = valorIngresado.nextInt(); //Usar la información del objeto
		
		//  int hora = 13; Cuando declaramos una variable
		
		if(hora >= 0 && hora <= 23) {//si es una hora válida
			System.out.println("Hora ingresada correctamente");
			if(hora >= 7 && hora <= 11) {
				System.out.println("Buenos días estrellitas");
			} else if (hora >= 12 && hora <= 18) {
				System.out.println("Buenas tardes ya, qué bárbaro");
			} else if(hora >= 19 && hora < 24) {
				System.out.println("Buenas noches, a mimir");
			} else {
				System.out.println("Es de madrugada, no es bueno desvelarse");
			}
		}else {
			System.out.println("Hora mal ingresada");
		} //cierre del if general
		
		valorIngresado.close(); //se debe cerrar el escáner cada vez que se use, para que se cierre el objeto y evitarun desborde de memoria.
		
		
		/* Condicionales switch */
		
		int opcion = 1;
		
		switch  (opcion) {
		
			case 1:
			System.out.println("Bienvenido al servicio de reservas"); //Logica de negocio para la funcion de las reservas
			//funcionReservas();
			break;
			
			case 2:
				System.out.println("Bienvenido al servicio de check-in");
				//funcionCheckIn();
				break;
				
			case 3:
				System.out.println("Bienvenido al servicio de check-out ");
				//funcionCheckOut();
				break;
				
			default:
				System.out.println("Opción inválida");
			break;
		} //Cierre del switch
		
		
		/*Ejemplo del switch anidado
		
		int entradadDeDato = 5;
		
		switch (entradaDeDato) {
		case 1:
			switch(otraOpcion) {
			case 1:
				System.out.println();
				break;
			case 2:
				System.out.println();
				break;
				default:
					System.out.println("Opcion inválida");
			}
		}
		*/
		
		
		
		}//cierre del método main
			
}
