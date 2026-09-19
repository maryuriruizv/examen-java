//Hereda los datos de personaje
public class Mago extends Personaje{
    public Mago (int id){
        super(id, personaje: "Mago");
    }

    @override
    public void mostrarAccion(){
        System.out.println("Canaliza un rayo de energia astral desde el cielo");
    }
}
