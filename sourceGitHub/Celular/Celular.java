public class Celular {

    // Atributos
    public String marca;
    public String color;

    private String modelo;
    private String sistemaOperativo;

    protected int numeroCelular;
    protected int numeroSerie;

    String numeroIMEI;

    public Celular(String marca, String color, String modelo, String sistemaOperativo, int numeroCelular, int numeroSerie, String numeroIMEI) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.numeroCelular = numeroCelular;
        this.numeroSerie = numeroSerie;
        this.numeroIMEI = numeroIMEI;
    }

    // Métodos
    public void llamar() {
        // ...
    }

    public void enviarMensaje() {
        // ...
    }

    private void tomarFoto() {
        // ...
    }

    protected void apagar() {
        // ...
    }

}