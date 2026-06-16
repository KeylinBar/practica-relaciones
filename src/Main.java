import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        Persona persona1 = new Persona("Keylin", "Castillo");

        persona1.sacarPasaporte("8382349", "Costarricense",
                LocalDate.of(2024,10,5),LocalDate.of(2034,10,5));
        persona1.tomarVuelo("Mexico");

        Persona persona2 = new Persona("Pepe", "Perez");
        persona2.sacarPasaporte("3u32932892", "Costarricense",
                LocalDate.of(2013, 5, 10), LocalDate.of(2023, 5, 10));
        persona2.tomarVuelo("Canada");


        Mascota mascota = new Mascota("Paco", "Perro", 5);
        persona1.adoptarMascota(mascota);
        persona1.jugar();

        persona2.adoptarMascota(mascota);
        persona2.jugar();

        MaquinaSoldar maquinaSoldar = new MaquinaSoldar("Miller Electric", "M1353", 7000,(byte)3);
        maquinaSoldar.definirMetales();

        persona1.soldar("hierro", maquinaSoldar);
        persona1.soldar("acero", maquinaSoldar);
    }
}