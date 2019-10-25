package domain;

public class Sexy implements Caracteristicas {

    @Override
    public int sumarPuntos(Persona unaPersona) {
        if (unaPersona.Sexy()){
            return 15;
        }
        else {
            return 2;
        }
    }
}
