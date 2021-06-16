package app;

import java.sql.Date;
import java.util.Scanner;

import app.model.Espacio;
import app.model.Habitacion;
import app.model.Personal;
import app.model.Sanitario;

public class MainApp {

	public static void main(String[] args) {
		Espacio espacio = new Espacio();
		Habitacion habitacion = new Habitacion();
		Personal personal = new Personal();
		Sanitario sanitario = new Sanitario();
		Scanner teclado = new Scanner(System.in);
		String options = "";
		
		espacio.setPort(3308);
		habitacion.setPort(3308);
		personal.setPort(3308);
		sanitario.setPort(3308);
		
		while(!options.equals("0")) {
			System.out.println("----Menú principal----");
			System.out.println("0) Salir");
			System.out.println("1) Gestionar Espacios");
			System.out.println("2) Gestionar Habitaciones");
			System.out.println("3) Gestionar Personal");
			System.out.println("4) Gestionar Sanitarios");
			
			options = teclado.next();
			
			if(options.equals("1")) {
				while(!options.equals("0")) {
					System.out.println("----Gestión de Espacios----");
					System.out.println("0) Volver");
					System.out.println("1) Añadir Espacio");
					System.out.println("2) Mostrar todos los espacios");
					System.out.println("3) Mostrar un espacio");
					System.out.println("4) Modificar un espacio");
					System.out.println("5) Eliminar un espacio");
					
					options = teclado.next();
					
					if(options.equals("1")) {
						int tiempoCesion, numeroPlantas, metrosCuadrados, cantidadHabitaciones;
						String accesibilidad, direccion, propietario;
						boolean tieneComedor, danComida, tieneInternet;
						
						try {
							System.out.println("tiempoCesion: ");
							tiempoCesion = teclado.nextInt();
							System.out.println("numeroPlantas: ");
							numeroPlantas = teclado.nextInt();
							System.out.println("metrosCuadrados: ");
							metrosCuadrados = teclado.nextInt();
							System.out.println("cantidadHabitaciones: ");
							cantidadHabitaciones = teclado.nextInt();
							System.out.println("accesibilidad: ");
							accesibilidad = teclado.next();
							System.out.println("direccion: ");
							direccion = teclado.next();
							System.out.println("propietario: ");
							propietario = teclado.next();
							System.out.println("tieneComedor(Sí: true, No: false): ");
							tieneComedor = teclado.nextBoolean();
							System.out.println("danComida(Sí: true, No: false): ");
							danComida = teclado.nextBoolean();
							System.out.println("tieneInternet(Sí: true, No: false): ");
							tieneInternet = teclado.nextBoolean();
							espacio.insert(tiempoCesion, numeroPlantas, metrosCuadrados, accesibilidad, direccion, propietario, cantidadHabitaciones, tieneComedor, danComida, tieneInternet);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}else if(options.equals("2")) {
						espacio.selectAll();
					}else if(options.equals("3")) {
						int id;
						
						try {
							System.out.println("id_espacio: ");
							id = teclado.nextInt();
							espacio.selectById(id);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}else if(options.equals("4")) {
						int tiempoCesion, numeroPlantas, metrosCuadrados, cantidadHabitaciones, id_espacio;
						String accesibilidad, direccion, propietario;
						boolean tieneComedor, danComida, tieneInternet;
						
						try {
							System.out.println("id_espacio: ");
							id_espacio = teclado.nextInt();
							System.out.println("tiempoCesion: ");
							tiempoCesion = teclado.nextInt();
							System.out.println("numeroPlantas: ");
							numeroPlantas = teclado.nextInt();
							System.out.println("metrosCuadrados: ");
							metrosCuadrados = teclado.nextInt();
							System.out.println("cantidadHabitaciones: ");
							cantidadHabitaciones = teclado.nextInt();
							System.out.println("accesibilidad: ");
							accesibilidad = teclado.next();
							System.out.println("direccion: ");
							direccion = teclado.next();
							System.out.println("propietario: ");
							propietario = teclado.next();
							System.out.println("tieneComedor(Sí: true, No: false): ");
							tieneComedor = teclado.nextBoolean();
							System.out.println("danComida(Sí: true, No: false): ");
							danComida = teclado.nextBoolean();
							System.out.println("tieneInternet(Sí: true, No: false): ");
							tieneInternet = teclado.nextBoolean();
							espacio.update(id_espacio, tiempoCesion, numeroPlantas, metrosCuadrados, accesibilidad, direccion, propietario, cantidadHabitaciones, tieneComedor, danComida, tieneInternet);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}else if(options.equals("5")) {
						int id;
						
						try {
							System.out.println("id_espacio: ");
							id = teclado.nextInt();
							espacio.delete(id);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}
				}
				options = "";
			}else if(options.equals("2")) {
				while(!options.equals("0")) {
					System.out.println("----Gestión de Habitaciones----");
					System.out.println("0) Volver");
					System.out.println("1) Añadir habitación");
					System.out.println("2) Mostrar todos los habitación");
					System.out.println("3) Mostrar una habitación");
					System.out.println("4) Modificar una habitación");
					System.out.println("5) Eliminar una habitación");
					
					options = teclado.next();
					
					if(options.equals("1")) {
						int id_espacio, metrosCuadrados, cantidadCamas;
						boolean tieneBano, plantaBaja;
						
						try {
							System.out.println("id_espacio: ");
							id_espacio = teclado.nextInt();
							System.out.println("metrosCuadrados: ");
							metrosCuadrados = teclado.nextInt();
							System.out.println("cantidadCamas: ");
							cantidadCamas = teclado.nextInt();
							System.out.println("tieneBano(Sí: true, No: false): ");
							tieneBano = teclado.nextBoolean();
							System.out.println("plantaBaja(Sí: true, No: false): ");
							plantaBaja = teclado.nextBoolean();
							habitacion.insert(metrosCuadrados, cantidadCamas, tieneBano, plantaBaja, id_espacio);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}else if(options.equals("2")) {
						habitacion.selectAll();
					}else if(options.equals("3")) {
						int id;
						
						try {
							System.out.println("id_habitacion: ");
							id = teclado.nextInt();
							habitacion.selectById(id);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}else if(options.equals("4")) {
						int id_espacio, metrosCuadrados, cantidadCamas, id_habitacion;
						boolean tieneBano, plantaBaja;
						
						try {
							System.out.println("id_habitacion: ");
							id_habitacion = teclado.nextInt();
							System.out.println("id_espacio: ");
							id_espacio = teclado.nextInt();
							System.out.println("metrosCuadrados: ");
							metrosCuadrados = teclado.nextInt();
							System.out.println("cantidadCamas: ");
							cantidadCamas = teclado.nextInt();
							System.out.println("tieneBano(Sí: true, No: false): ");
							tieneBano = teclado.nextBoolean();
							System.out.println("plantaBaja(Sí: true, No: false): ");
							plantaBaja = teclado.nextBoolean();
							habitacion.update(id_habitacion, metrosCuadrados, cantidadCamas, tieneBano, plantaBaja, id_espacio);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}else if(options.equals("5")) {
						int id;
						
						try {
							System.out.println("id_habitacion: ");
							id = teclado.nextInt();
							habitacion.delete(id);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}
				}
				options = "";
			}else if(options.equals("3")) {
				while(!options.equals("0")) {
					System.out.println("----Gestión del Personal----");
					System.out.println("0) Volver");
					System.out.println("1) Añadir un nuevo miembro");
					System.out.println("2) Mostrar todos los miembros");
					System.out.println("3) Mostrar un miembro");
					System.out.println("4) Modificar un miembro");
					System.out.println("5) Eliminar un miembro");
					
					options = teclado.next();
					
					if(options.equals("1")) {
						String dni, nombre, apellidos, funcion, fechaAlta, fechaBaja;
						int edad, tiempoEstancia, id_espacio;
						
						try {
							System.out.println("dni: ");
							dni = teclado.next();
							System.out.println("nombre: ");
							nombre = teclado.next();
							System.out.println("apellidos: ");
							apellidos = teclado.next();
							System.out.println("funcion: ");
							funcion = teclado.next();
							System.out.println("fechaAlta(yyyy-mm-dd): ");
							fechaAlta = teclado.next();
							System.out.println("fechaBaja(yyyy-mm-dd): ");
							fechaBaja = teclado.next();
							System.out.println("edad: ");
							edad = teclado.nextInt();
							System.out.println("tiempoEstancia: ");
							tiempoEstancia = teclado.nextInt();
							System.out.println("id_espacio: ");
							id_espacio = teclado.nextInt();
							personal.insert(dni, nombre, apellidos, edad, funcion, tiempoEstancia, fechaAlta, fechaBaja, id_espacio);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}else if(options.equals("2")) {
						personal.selectAll();
					}else if(options.equals("3")) {
						String dni;
						
						try {
							System.out.println("DNI: ");
							dni = teclado.next();
							personal.selectById(dni);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}else if(options.equals("4")) {
						String dni, nombre, apellidos, funcion, fechaAlta, fechaBaja;
						int edad, tiempoEstancia, id_espacio;
						
						try {
							System.out.println("dni: ");
							dni = teclado.next();
							System.out.println("nombre: ");
							nombre = teclado.next();
							System.out.println("apellidos: ");
							apellidos = teclado.next();
							System.out.println("funcion: ");
							funcion = teclado.next();
							System.out.println("fechaAlta(yyyy-mm-dd): ");
							fechaAlta = teclado.next();
							System.out.println("fechaBaja(yyyy-mm-dd): ");
							fechaBaja = teclado.next();
							System.out.println("edad: ");
							edad = teclado.nextInt();
							System.out.println("tiempoEstancia: ");
							tiempoEstancia = teclado.nextInt();
							System.out.println("id_espacio: ");
							id_espacio = teclado.nextInt();
							personal.update(dni, nombre, apellidos, edad, funcion, tiempoEstancia, fechaAlta, fechaBaja, id_espacio);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}else if(options.equals("5")) {
						String dni;
						
						try {
							System.out.println("DNI: ");
							dni = teclado.next();
							personal.delete(dni);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}
				}
				options = "";
			}else if(options.equals("4")) {
				while(!options.equals("0")) {
					System.out.println("----Gestión de Sanitarios----");
					System.out.println("0) Volver");
					System.out.println("1) Añadir un nuevo sanitario");
					System.out.println("2) Mostrar todos los sanitarios");
					System.out.println("3) Mostrar un sanitario");
					System.out.println("4) Modificar un sanitario");
					System.out.println("5) Eliminar un sanitario");
					
					options = teclado.next();
					
					if(options.equals("1")) {
						String dni, nombre, apellidos, titulacion, dondeTrabaja, fechaEntrada, fechaSalida;
						int edad, tiempoEstancia, id_espacio;
						
						try {
							System.out.println("dni: ");
							dni = teclado.next();
							System.out.println("nombre: ");
							nombre = teclado.next();
							System.out.println("apellidos: ");
							apellidos = teclado.next();
							System.out.println("titulacion: ");
							titulacion = teclado.next();
							System.out.println("dondeTrabaja: ");
							dondeTrabaja = teclado.next();
							System.out.println("fechaEntrada(yyyy-mm-dd): ");
							fechaEntrada = teclado.next();
							System.out.println("fechaSalida(yyyy-mm-dd): ");
							fechaSalida = teclado.next();
							System.out.println("edad: ");
							edad = teclado.nextInt();
							System.out.println("tiempoEstancia: ");
							tiempoEstancia = teclado.nextInt();
							System.out.println("id_espacio: ");
							id_espacio = teclado.nextInt();
							sanitario.insert(dni, nombre, apellidos, edad, titulacion, dondeTrabaja, tiempoEstancia, fechaEntrada, fechaSalida, id_espacio);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}else if(options.equals("2")) {
						sanitario.selectAll();
					}else if(options.equals("3")) {
						String dni;
						
						try {
							System.out.println("DNI: ");
							dni = teclado.next();
							sanitario.selectById(dni);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}else if(options.equals("4")) {
						String dni, nombre, apellidos, titulacion, dondeTrabaja, fechaEntrada, fechaSalida;
						int edad, tiempoEstancia, id_espacio;
						
						try {
							System.out.println("dni: ");
							dni = teclado.next();
							System.out.println("nombre: ");
							nombre = teclado.next();
							System.out.println("apellidos: ");
							apellidos = teclado.next();
							System.out.println("titulacion: ");
							titulacion = teclado.next();
							System.out.println("dondeTrabaja: ");
							dondeTrabaja = teclado.next();
							System.out.println("fechaEntrada(yyyy-mm-dd): ");
							fechaEntrada = teclado.next();
							System.out.println("fechaSalida(yyyy-mm-dd): ");
							fechaSalida = teclado.next();
							System.out.println("edad: ");
							edad = teclado.nextInt();
							System.out.println("tiempoEstancia: ");
							tiempoEstancia = teclado.nextInt();
							System.out.println("id_espacio: ");
							id_espacio = teclado.nextInt();
							sanitario.update(dni, nombre, apellidos, edad, titulacion, dondeTrabaja, tiempoEstancia, fechaEntrada, fechaSalida, id_espacio);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}else if(options.equals("5")) {
						String dni;
						
						try {
							System.out.println("DNI: ");
							dni = teclado.next();
							sanitario.delete(dni);
						}catch(Exception e) {
							e.printStackTrace();
						}
					}
				}
				options = "";
			}else if(options.equals("0")) {
				System.out.println("Saliendo del programa. Hasta luego.");
			}
		}
	}

}
