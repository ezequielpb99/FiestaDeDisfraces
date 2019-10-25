package domain;

import java.util.Date;
import java.util.List;

public class Disfraz {
    private List<Caracteristicas> caracteristicas;
    private Date fechaDeConfeccion;
    private int puntos;
    private String nombre;

    public List<Caracteristicas> getCaracteristicas() {
        return caracteristicas;
    }
    public void setCaracteristicas(List<Caracteristicas> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    public Date getFechaDeConfeccion() {
        return fechaDeConfeccion;
    }
    public void setFechaDeConfeccion(Date fechaDeConfeccion) {
        this.fechaDeConfeccion = fechaDeConfeccion;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void obtenerPuntosDisfraz(Persona unaPersona){
       setPuntos(caracteristicas.stream().mapToInt(c -> c.sumarPuntos(unaPersona)).sum());
    }
}
