package domain;

public class Personaje {
    private int puntosPersonaje;
    private String nombrePersonaje;

    public int getPuntosPersonaje() {
        return puntosPersonaje;
    }
    public void setPuntosPersonaje(int puntosPersonaje) {
        this.puntosPersonaje = puntosPersonaje;
    }
    public String getNombrePersonaje() {
        return nombrePersonaje;
    }
    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public Personaje(int puntosPersonaje, String nombrePersonaje) {
        this.puntosPersonaje = puntosPersonaje;
        this.nombrePersonaje = nombrePersonaje;
    }
}
