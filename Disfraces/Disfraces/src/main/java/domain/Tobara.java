package domain;


import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

public class Tobara implements Caracteristicas {
    private LocalDate fechaDeConfeccion;

    public LocalDate getFechaDeConfeccion() {
        return fechaDeConfeccion;
    }
    public void setFechaDeConfeccion(LocalDate fechaDeConfeccion) {
        this.fechaDeConfeccion = fechaDeConfeccion;
    }

    @Override
    public int sumarPuntos(Persona unaPersona) {
        if(Duration.between(fechaDeConfeccion, unaPersona.getFiestaActual().getFechaDeFiesta()).toDays() > 2){
            return 3;
        }
        else {
        return 5;
        }
    }
}
