//Clase padre

public class Personaje {
    private int id;
    private String nombre;
    private int nivel;

    //Constructor
    public Personaje(int id, String nombre, int nivel){
        this.id = id;
        this.String = nombre;
        this.int = nivel;
    }

    //Getters
    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public int getNivel(){
        return nivel;
    }

    //MostrarInfo
    public void mostrarInfo(){
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Nivel: " + nivel);
    }

    

}
