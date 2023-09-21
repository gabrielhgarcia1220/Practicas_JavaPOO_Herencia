public class Vehiculo {
    
    private String marca;
    private String color;
    private int puertas;
    
    // CONSTRUCTORES
    public Vehiculo() {
    }

    public Vehiculo(String marca, String color, int puertas) {
        this.marca = marca;
        this.color = color;
        this.puertas = puertas;
    }

    //GETTERS & SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString(){
        return "[Marca: " + marca + "\nPuertas: " + puertas+ "\nColor: " + color + "]";
    }
}
