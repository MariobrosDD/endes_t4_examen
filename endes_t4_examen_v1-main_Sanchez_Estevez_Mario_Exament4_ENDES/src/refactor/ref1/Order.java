package refactor.ref1;

public class Order {

    private String nombreItem;
    private int cantidad;
    private double precio;
    private String nombreCustomer;

    public Order(String nombreItem, int cantidad, double precio, String nombreCustomer) {
        this.nombreItem = nombreItem;
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombreCustomer = nombreCustomer;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreCustomer() {
        return nombreCustomer;
    }

    public void setNombreCustomer(String nombreCustomer) {
        this.nombreCustomer = nombreCustomer;
    }
}


