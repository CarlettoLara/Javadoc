package Clases;
/**
 * Representa un coche con varias características.
 * @author Carlos
 * @version 1.0
 * @since 2024
 */
public class Coche {
    private int numRuedas;
    private String marca;
    private String color;
    int kmRecorridos;
    private int capacidadDeposito;
    String titular;
    private int gasolinaRestante;


    /**
     * Constructor de la clase Coche.
     * @param numRuedasInicial Número de ruedas del coche.
     * @param depositoInicial Capacidad del depósito de gasolina.
     * @param colorInicial Color del coche.
     */

    public Coche(int numRuedasInicial, int depositoInicial, String colorInicial) {
        //Constructores es la manera de construir un objeto
        numRuedas = numRuedasInicial;
        capacidadDeposito = depositoInicial;
        color = colorInicial;
        marca = "Hacendado";
        gasolinaRestante = (capacidadDeposito / 2);
        titular = "Marcelo";



    }
    /**
     * Constructor alternativo con marca específica.
     * @param marcaInicial Marca del coche.
     * @param numRuedasInicial Número de ruedas.
     * @param depositoInicial Capacidad del depósito.
     * @param colorInicial Color del coche.
     */
    public Coche(String marcaInicial, int numRuedasInicial, int depositoInicial, String colorInicial) {
        marca = marcaInicial;
        //numRuedas = numRuedasInicial;
        capacidadDeposito = depositoInicial;
        color = colorInicial;
        gasolinaRestante = (capacidadDeposito / 2);

    }
    /**
     * Simula la circulación del coche y altera atributos.
     * @param velocidad Velocidad a la que circula el coche.
     */
    public void circular(int velocidad){

        //segun el algoritmo, altera los atributos de kmRecorridos y gasolinaRestante
        kmRecorridos += velocidad * 0.3;
        gasolinaRestante -= velocidad * 1.2;



    }
    /**
     * Imprime los datos del coche.
     */
    public void imprimirCoche(){

        System.out.println("*** INFO DE COCHE ***");
        System.out.println("El coche de " + titular);
        System.out.println("Marca " + marca);
        //System.out.println("Numero de ruedas " + numRuedas);
        System.out.println("Color " + color);
        System.out.println("Gasolina restante " + gasolinaRestante);
        System.out.println("Capacidad de deposito " + capacidadDeposito);
        System.out.println("Km recorridos " + kmRecorridos);
        System.out.println();


    }public String getMarca(){
        return marca;
    }
    public int getKmRecorridos(){
        return kmRecorridos;


    } public  int getGasolinaRestante(){
        return  gasolinaRestante;
    }

    public int getCapacidadDeposito(){
        return capacidadDeposito;
    }

    public String getColor(){
        return color;
    }
    public void setKmRecorridos(int kmRecorridosNuevo){
        kmRecorridos = kmRecorridosNuevo;

    }public void setCapacidadDeposito(int capacidadDepositoNuevo){
        capacidadDeposito = capacidadDepositoNuevo;
    }
    public  void setColor(String colorNuevo){
        color = colorNuevo;

    }
    public void setGasolinaRestante(int gasolinaRestanteNueva){
        gasolinaRestante = gasolinaRestanteNueva;
    }

    public void setMarca(String marcaNueva) {
        marca = marcaNueva;
    }
}

