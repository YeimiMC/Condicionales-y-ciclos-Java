package CondicionalesYCiclos;

import java.util.Scanner;

public class CondicionalesHotel {

	public static void main(String[] args) {
	
		//Scanner
				Scanner scanner = new Scanner(System.in);

				// Servicios Adicionales
				System.out.println("<-- Servicios Adicionales -->");

				System.out.println("Total de servicios:");
				double totalServicio = scanner.nextDouble();
				System.out.println("Total de servicios adicionales:");
				double totalAdicional = scanner.nextDouble();

				if(totalServicio > 0){

					double precioFinal = totalServicio;

					if (totalAdicional > 0) {
						System.out.println("Usted adquirio servicios adicionales.\n"
								+ "Usted tendra un cargo adicional de $" + totalAdicional);
						precioFinal += totalAdicional;
					}
					else if (totalAdicional == 0){
						System.out.println("Sin servicios adicionales.");
					}
					else {
						System.out.println("Error en los los servicios adicionales.");
						totalAdicional = 0;
					}

					System.out.println("Precio del servicio:          $" + totalServicio);
					System.out.println("Precio de servicio adicional: $" + totalAdicional);
					System.out.println("Precio final:                 $" + precioFinal);

				}
				else {
					System.out.println("Error, no hay precio valido del servicio.");
				}


				// Temporada (dinamica)
				
				System.out.println("<-- Temporada (Dinamica) -->");

				System.out.println("Ingrese la temporada:\n"
						+ "1.- Primavera\n"
						+ "2.- Verano\n"
						+ "3.- Otoño\n"
						+ "4.- Invierno\n");

				int valorTemporada = scanner.nextInt();
				
				double descuento;

				switch (valorTemporada) {
					case 1 -> {
						descuento = 12;
					}
					case 2 -> {
						descuento = 7;
					}
					case 3 -> {
						descuento = 15;
					}
					case 4 -> {
						descuento = 5;
					}
					default -> descuento = 0;
				}
				
				System.out.println("El descuento es de: " + descuento + "%");
				
				// <-- Check-out Check-in -->
				System.out.println("<-- CheckIn - CheckOut -->");

				// Obtengo la hora del CheckIn
				System.out.println("Ingrese el horario del Check-In");
				String checkIn = scanner.next();
				// Obtengo la hora del CheckOut
				System.out.println("Ingrese el horario del Check-Out");
				String checkOut = scanner.next();
				
				System.out.println("El horario del CheckIn: " + checkIn);
				System.out.println("El horario del CheckOut: " + checkOut);

				// Roomservice
				System.out.println("<-- Room Service -->");

				System.out.println("""
						¿Quiere servicio a la habitacion?
						1.- Si
						2.- No""");

				int opcion = scanner.nextInt();

				if(opcion == 1){
					System.out.println("Enviando servicio la habitacion");
				}
				else if(opcion == 2){
					System.out.println("Sin cambios");
				}
				else {
					System.out.println("Opcion invalida");
				}

				// Huespedes extra
				System.out.println("<-- Huespedes extra -->");

				double precioPorHuespedAdicional = 123.1;

				System.out.println("Numero de huepedes:");
				int numeroHuepedes = scanner.nextInt();
				System.out.println("Numero de huepedes reales:");
				int numeroHuespedesReales = scanner.nextInt();

				if(numeroHuepedes < numeroHuespedesReales){
					double precioAdicional = (numeroHuespedesReales - numeroHuepedes) * precioPorHuespedAdicional;
					System.out.println("Sobrepaso el numero de huespedes.");
					System.out.println("Costo adicional de: $" + precioAdicional);
				}
				else {
					System.out.println("Reservacion sin comflictos.");
				}

				// cerrando el scanner
				scanner.close();

	}

}
