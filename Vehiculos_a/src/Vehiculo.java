public class Vehiculo {
    
    private String marca;
    private int puertas;
    private String color;
    
    public Vehiculo() {
    }

    public Vehiculo(String marca, int puertas, String color) {
        this.marca = marca;
        this.puertas = puertas;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void infoVehiculo(){

        System.out.println("Marca: " + marca + "\nPuertas: " + puertas + "\nColor: " + color);
    }
    /*@Override
    public String toString(){
        return "VEHICULO [Marca: " + marca + "  Puertas: " + puertas + "  Color: " + color + "]";
    }*/
}
