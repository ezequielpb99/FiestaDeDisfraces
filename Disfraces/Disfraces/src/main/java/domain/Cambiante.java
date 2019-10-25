package domain;

public class Cambiante implements Personalidad {
    private Personalidad personalidad;

    @Override
    public boolean esSexy(Persona unaPersona) {
        return this.personalidad.esSexy(unaPersona);
    }
}
