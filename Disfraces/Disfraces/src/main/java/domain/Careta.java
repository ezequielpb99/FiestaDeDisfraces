package domain;

public class Careta implements Caracteristicas {
    private Personaje personajeCareta;

    public Personaje getPersonajeCareta() {
        return personajeCareta;
    }
    public void setPersonajeCareta(Personaje personajeCareta) {
        this.personajeCareta = personajeCareta;
    }

    @Override
    public int sumarPuntos(Persona unaPersona) {
        return personajeCareta.getPuntosPersonaje();
    }
}
