import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaquinaSoldar {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    private String marca;
    private String modelo;
    private int potencia;
    private String[] metalesSoldar;

    //metodos
    //constructor
    public MaquinaSoldar(String marca, String modelo, int potencia,
                         byte cantidadMetaleSoldar) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        metalesSoldar = new String[cantidadMetaleSoldar];
    }

    //getter
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public String[] getMetalesSoldar() {
        return metalesSoldar;
    }

    //setter
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void definirMetales() throws Exception {
        for (int c = 0; c < metalesSoldar.length; c++) {
            System.out.println("Ingrese el metal numero " + (c + 1) + ":");
            metalesSoldar[c] = entrada.readLine();
        }
    }
    public boolean soldar(String metal){
        return Arrays.asList(metalesSoldar).contains(metal);
    }
}
