//Hereda los datos de personaje
public class Mago extends Personaje{
    public Mago (int id, String nombre, int nivel){
        super(id, nombre, nivel);
    }

    @Override
    public String realizarAccion(){
        return "Canaliza un rayo de energia astral desde el cielo";
    }
}
