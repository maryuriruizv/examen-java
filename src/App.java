/*
EXAMEN FINAL - JAVA POO

Autor: Maryuri Ruiz 
Fecha: 18 de septiembre de 2026

Enunciado: 
    Una academia de videojuegos necesita un programa para registrar personajes. Todos comparten un
    identificador, un nombre y un nivel, pero cada tipo realiza una acción diferente. El sistema debe guardar los
    objetos en una sola colección, mostrarlos y buscar uno por su identificador.
*/

import java.util.Scanner;

public class App {
    public static void main(String[]args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        do{
            try{
                System.out.println("=====MENU PERSONAJES=====");
                System.out.println("1. Registrar Personajes");
                System.out.println("2. Mostrar Personajes");
                System.out.println("3. Buscar Personajes por ID");
                System.out.println("4. Salir");
                System.out.println("SELECCIONE UNA OPCION POR FAVOR:");

                Opcion = sc.nexInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese ID del personaje: ");
                        int id = sc.nextInt();
    
                        System.out.println("Ingrese nombre del personaje: ");
                        String nombre = sc.next(); 
    
                        System.out.println("Ingrese nivel del personaje: ");
                         int nivel = sc.nextInt();

                        // Validaciones: id > 0, nombre no vacío y nivel entre 1 y 100
                        if (id > 0 && !nombre.isEmpty() && nivel >= 1 && nivel <= 100) {
                        if (tipo == 1) {
                            personajes.add(new Guerrero(id)); // Ajusta los parámetros del constructor si tu clase recibe nombre y nivel
                            System.out.println("¡Guerrero registrado exitosamente!");
                        } else if (tipo == 2) {
                            personajes.add(new Mago(id)); // Ajusta los parámetros del constructor si tu clase recibe nombre y nivel
                            System.out.println("¡Mago registrado exitosamente!");
                        } else {
                            System.out.println("Tipo de personaje inválido. No se registró el objeto.");
                        }
                        } else {
                        System.out.println("Error de validación: El ID debe ser mayor a 0, el nombre no puede estar vacío y el nivel debe estar entre 1 y 100.");
                        }
                        break;

                    case 2:
                        System.out.println("Mostrando Personajes");
                        ArrayList<Personaje> listaPersonajes = new ArrayList<>();

                        if( 
                            //Recorrer el ArrayList
                            for(Personaje p: listaPersonajes){
                            //LLamamos mostrarInfo y relizar Accion
                            p.mostrarInfo();
                            p.realizarAccion();
                            }

                        )else{
                            (listaPersonajes.isEmpty());
                            //Si la lista esta vacia, mostrar un mensaje claro 
                            System.out.println("No hay ningun Personaje registrado");
                        }
                        break;

                    case 3:
                        // ID del usuario
                        int idBuscado = 5; 

                        // Variable para saber si lo encontramos o no
                        Personaje personajeEncontrado = null;

                        // Busqueda secuencial
                        for (Personaje p : listaPersonajes) {
                        if (p.getId() == idBuscado) { // Comparamos el ID de cada personaje
                        personajeEncontrado = p;  // Lo guardamos
                        break;                    //Se detiene al encontrar la primera coincidencia
                        }
                        }

                        //fuera del bucle
                        if (personajeEncontrado != null) {
                        //Si existe, mostrar su información y la acción que realiza
                        personajeEncontrado.mostrarInfo();
                        personajeEncontrado.realizarAccion();
                        } else {
                        //Si no existe, mostrar el mensaje exacto solicitado
                        System.out.println("Personaje no encontrado");
                        }
                        break;

                    case 4:
                        System.out.println("Saliendo del programa.");
                        break;
                        
                    default: 
                        System.out.println("Opcion invalida. intente nuevamente.");      
                }

            } catch(Exception e){
                System.out.println("Error: Ingreso invalido. Debe escribir un numero.");
                sc.nextLine();//Limpiar el buffer para evitar bucle infinito
            }

        }while (opcion !=  4);

        sc.close();
    }
}
