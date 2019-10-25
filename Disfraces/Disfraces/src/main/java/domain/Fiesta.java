package domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Fiesta {
    private List<Persona> invitados;
    private LocalDate fechaDeFiesta;

    public List<Persona> getInvitados() {
        return invitados;
    }
    public void setInvitados(List<Persona> invitados) {
        this.invitados = invitados;
    }
    public LocalDate getFechaDeFiesta() {
        return fechaDeFiesta;
    }
    public void setFechaDeFiesta(LocalDate fechaDeFiesta) {
        this.fechaDeFiesta = fechaDeFiesta;
    }


}
