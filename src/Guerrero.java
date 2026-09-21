//Hereda los datos de personaje 
public class Guerrero extends Personaje{
    public Guerrero (int id, String nombre, int nivel){
        //Llamamos al constructor de la clase padre
        super(id, nombre, nivel);
    }

    @Override
    public String realizarAccion(){
        return "Atraviesa al enemigo con su lanza de acero sagrado";
    }
}
