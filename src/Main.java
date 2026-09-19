//Creamos un Main

import java.util.ArrayList;

public class Main {
    
    private ArrayList<Personaje> personajes = new ArrayList<>();
    
    //Metodo para agregar al Guerrero
    public void agregarGuerrero(int id){
        listapersonajes.add(new Guerrero(id));
        System.out.println("Guerrero agregado correctamente.");
    }

    //Metodo para agregar a un Mago
    public void agregarMago(int id){
        listapersonajes.add(new Mago(id));
        System.out.println("Mago agregado correctamente.");
    }

    //Metodo para mostrar todos los personajes
    public void mostrarPersonaje(){
        if (personajes.isEmpty()){
            System.out.println("No hay personajes registrados.");
            return;
        }

        for(Personaje personaje : listapersonajes){
            personaje.mostrarInfo();
            personaje.mostrarAccion();
            System.out.println("-------------------");
        }
    }

    //Metodo para buscar un personaje por id
    public Personaje buscarPorId(int id){
        for(Personaje personaje : listapersonajes){
            if(personaje.getId() == id){
                return personaje;
            }
        }
        return null;
    }
}
