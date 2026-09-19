//Hereda los datos de personaje 
public class Guerrero extends Personaje{
    public Guerrero (int id){
        //Llamamos al constructor de la clase padre
        super(id, personaje: "Guerrero");
    }

    @override
    public void mostrarAccion(){
        System.out.println("Atraviesa al enemigo con su lanza de acero sagrado");
    }
}
