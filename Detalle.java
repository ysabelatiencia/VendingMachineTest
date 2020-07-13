public class Detalle {
    private Producto producto;
    private int quantity;
    private double total_price;

public Detalle(Producto producto, int cantidad){
    this.producto=producto;
    this.quantity=cantidad;
    this.total_price=producto.CalcularPrecioTotal(cantidad);
}

public boolean Comprar(){
    return this.producto.ComprarProducto(quantity);
}


public Producto getProducto(){
    return this.producto;
}

public int getCantidad(){
    return this.quantity;
}

public double getTotal(){
    return this.total_price;
}
}