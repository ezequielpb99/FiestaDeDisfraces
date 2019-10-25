package domain;

public class Caprichoso extends Persona {

    public Caprichoso(String nombre, int edad, Disfraz disfraz, Fiesta fiestaActual, Personalidad personalidad) {
        super(nombre,edad,disfraz,fiestaActual,personalidad);
    }

    @Override
    public boolean estaSatisfechoConElDisfraz(){
        if(disfraz.getPuntos() >= 10)
        {
            if ((disfraz.getNombre().length()/2)==0){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
