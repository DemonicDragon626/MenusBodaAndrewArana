public class Menu {
    private String Comida;
    private int Cantidad;

    public Menu(String Comida, int Cantidad){
        this.Cantidad = Cantidad;
        this.Comida = Comida;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

     void setComida(String comida) {
        Comida = comida;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public String getComida() {
        return Comida;
    }
    public String toString() {
        return "Comida: " + Comida + ", Cantidad: " + Cantidad;
    }
}
