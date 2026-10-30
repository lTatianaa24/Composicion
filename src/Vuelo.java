public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int capacidadMaxima;
    private Asiento [] asientos; /*Variable asientos, es un arreglo tipo Asiento [] */

    // Constructor
    public Vuelo(){
        asientos = new Asiento[0];
    }

  
    public Vuelo(String numero, String origen, String destino, int capacidadMaxima) { //La creacion de los asientos dentro de la clase Vuelo 
                                                                                       // Asiento, sea un nuevo arreglo con tamaño, segun lo que valga la capacidad maxima
        this.numero = numero; //Las partes se crean dentro del todo, en este caso (Vuelo)
        this.origen = origen;
        this.destino = destino;
        this.capacidadMaxima = capacidadMaxima;
       
        asientos = new Asiento[capacidadMaxima]; // Inicializa el arreglo de asientos con la capacidad máxima del vuelo
        for (int i = 0; i < capacidadMaxima; i++) { //Contador en 1
            asientos[i] = new Asiento("A" + (i + 1)); // Asientos en posicion i
                                                      // Se creo los objetos de tipo asiento  
        }
    }

    // Getters
    public String getNumero() {
        return numero;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Asiento[] getAsientos() {
        return asientos;
    }

    // Métodos
    public void mostrarInfo () {
        System.out.println("---- Vuelo " + numero + " ----");
        System.out.println("Ruta: " + origen + " -> " + destino);
        System.out.println("Capacidad: " + capacidadMaxima + " asientos");
    }

    //Muestra el estado de cada asiento
    public void mostrarAsientos() {
        System.out.println("Estado de los asientos - Vuelo " + numero + ":");
        for (Asiento a : asientos) { // for-each para recorrer el arreglo de asientos
                                     // Para una variable que se llama a de tipo asiento en el arreglo asientos, que va a correr asientos
            a.mostrarEstado();
        }
    }

    // Busca un asiento por código y lo ocupa
    public void embarcar(String codigoAsiento) {
        for (Asiento a : asientos) { // Para la variable a en asientos o sobre asientos
            if (a.getCodigo().equals(codigoAsiento)) { // Método equals: igual a algo, en este caso el codigo del asiento
                a.ocupar();
                return; // Tiene return aún teniendo void, para que no siga buscando el asiento y salga del método (rompe el bucle y el método)
            }
        }
        System.out.println("Asiento " + codigoAsiento + " no encontrado en vuelo " + numero + ".");
    }

    // Busca un asiento por código y lo libera
    public void desembarcar(String codigoAsiento) {
        for (Asiento a : asientos) {
            if (a.getCodigo().equals(codigoAsiento)) {
                a.liberar();
                return;
            }
        }
        System.out.println("Asiento " + codigoAsiento + " no encontrado en vuelo " + numero + ".");
    }
}
