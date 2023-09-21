public class Auto extends Vehiculo{
    
    private String modelo; // Atributo propio de la clase

    //  CONSTRUCTOR de la clase
    public Auto(String modelo) {
        this.modelo = modelo;
    }

    // CONSTRUCTOR con los atributos de la superclase y la propia clase
    public Auto(String marca, String color, int puertas, String modelo) {
        super(marca, color, puertas);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString(){
        return ">> Marca: " + this.getMarca() + "\n>> Modelo: " + modelo + "\n>> Puertas: " + this.getPuertas() + "\n>> Color: " + this.getColor();
    }
}
