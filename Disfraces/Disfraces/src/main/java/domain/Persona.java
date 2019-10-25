package domain;

public abstract class Persona {
    protected String nombre;
    protected int edad;
    protected Disfraz disfraz;
    protected Fiesta fiestaActual;
    protected Personalidad personalidad;



    public Fiesta getFiestaActual() {
        return fiestaActual;
    }
    public void setFiestaActual(Fiesta fiestaActual) {
        this.fiestaActual = fiestaActual;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Disfraz getDisfraz() {
        return disfraz;
    }
    public void setDisfraz(Disfraz disfraz) {
        this.disfraz = disfraz;
    }
    public Personalidad getPersonalidad() {
        return personalidad;
    }
    public void setPersonalidad(Personalidad personalidad) {
        this.personalidad = personalidad;
    }

    public Persona(String nombre, int edad, Disfraz disfraz, Fiesta fiestaActual, Personalidad personalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.disfraz = disfraz;
        this.fiestaActual = fiestaActual;
        this.personalidad = personalidad;
    }

    public boolean Sexy(){
        return personalidad.esSexy(this);
    }

    public int obtenerTotalDePuntos(){
        return disfraz.getPuntos();
    }

    public boolean estaSatisfechoConElDisfraz(){
        return false;
    }
}
