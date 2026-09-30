public class Asiento {
    private String codigo;
    private boolean ocupado;

    // Constructor
    public Asiento(String codigo) {
        this.codigo = codigo;
        this.ocupado = false; // Por defecto, el asiento está libre
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    // Método
    public void ocupar() {
        if (ocupado) {
            System.out.println("El asiento " + codigo + " ya está ocupado.");
        } else {
            ocupado = true;
            System.out.println("El asiento " + codigo + " ha sido ocupado.");
        }
    }

    public void liberar() {
        ocupado = false;
        System.out.println("Asiento " + codigo + " liberado.");
    }
    
    public void mostrarEstado() {
        System.out.println("Asiento " + codigo + ": " + (ocupado ? "ocupado" : "libre"));
    }
}