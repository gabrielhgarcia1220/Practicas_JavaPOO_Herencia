public class Auto extends Vehiculo{
    
    private String modelo;

    public Auto(String modelo) {
        this.modelo = modelo;
    }

    // CONSTRUCTOR con los atributos de la superclase y propias de la clase
    public Auto(String marca, int puertas, String color, String modelo) {
        super(marca, puertas, color);
        this.modelo = modelo;
    }

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

@Override
public void infoVehiculo(){
    System.out.println("Marca: " + this.getMarca() + "\nModelo: " + modelo + "\nPuertas: " + this.getPuertas() + "\nColor: " + this.getColor() + "\n");
}
/* 
// Método que muestra el nombre del vehículo y su tipo (Auto o Camioneta).
public String toString(){
    return "[El auto: " + this.getMarca() + "  Modelo: " + this.getModelo() + "  tiene: "+ this.getPuertas() + "  Color: " + this.getColor() + "]";
}*/

}
