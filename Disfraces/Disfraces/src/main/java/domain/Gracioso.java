package domain;

public class Gracioso implements Caracteristicas {
    private int nivelDeGracia;

    public int getNivelDeGracia() {
        return nivelDeGracia;
    }
    public void setNivelDeGracia(int nivelDeGracia) {
        this.nivelDeGracia = nivelDeGracia;
    }

    @Override
    public int sumarPuntos(Persona unaPersona){
        if(unaPersona.getEdad() > 50){
            return nivelDeGracia* 3;
        }
        return nivelDeGracia;
    }
}
