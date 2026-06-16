import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellidos;
    private Pasaporte pasaporte;
    private Mascota mascota;

    //constructor
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        pasaporte = null;
        mascota = null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void sacarPasaporte(String numero, String nacionalidad, LocalDate fechaEmision, LocalDate fechaVencimiento){
        pasaporte= new Pasaporte(numero, nacionalidad, fechaEmision,fechaVencimiento);
    }

    public void tomarVuelo(String pais){
        if(pasaporte==null) {
            System.out.println(nombre + " " + apellidos + " no puede tomar el vuelo porque no tiene pasaporte.");
            return;
        }
        pasaporte.verificarVigencia();
        if(pasaporte.isEstaVigente()){
            System.out.println(nombre + " " + apellidos + " toma un vuelo a " + pais );
        }else{
            System.out.println(nombre + " " + apellidos + " no tiene su pasaporte vigente,no puede tomar el vuelo.");
        }
    }
    public void adoptarMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    public void jugar(){
        if(mascota==null){
            System.out.println(nombre + " no tiene mascosta para jugar");
        }else{
            System.out.println(nombre + " juega con su mascota llamada " + mascota.getNombre() + " que es un " + mascota.getEspecie());
        }
    }

    public void soldar(String metal, MaquinaSoldar maquinaSoldar){
        if(maquinaSoldar.soldar(metal)){
            System.out.println(nombre + " " + apellidos + " " + " solda el " + metal + " con la " + maquinaSoldar.getModelo());
        }else{
            System.out.println("La " + maquinaSoldar.getMarca() + " " + maquinaSoldar.getModelo() + " no puede soldar " + metal);
        }
    }
}
