package domain;

public class Taciturno implements Personalidad {

    @Override
    public boolean esSexy(Persona unaPersona) {
        return unaPersona.getEdad() < 30;
    }
}
