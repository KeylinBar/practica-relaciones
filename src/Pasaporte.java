import java.time.LocalDate;

public class Pasaporte {
    private String numero;
    private String nacionalidad;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private boolean estaVigente;

    public Pasaporte(String numero, String nacionalidad, LocalDate fechaEmision,
                     LocalDate fechaVencimiento) {
        this.numero = numero;
        this.nacionalidad = nacionalidad;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        estaVigente= true;
    }
    public String getNumero() {
        return numero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public boolean isEstaVigente() {
        return estaVigente;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void verificarVigencia(){
        estaVigente = fechaVencimiento.isAfter(LocalDate.now());
    }
}
