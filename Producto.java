public class Producto {
    private String name;
    private double price;
    private int stock;
    public int ID;

public Producto(int ID, String name, double price, int stock){
    this.name=name;
    this.ID=ID;
    this.price=price;
    this.stock=stock;
}
public String getName(){
    return this.name;
}

public double getPrice(){
    return this.price;
}

public int getStock(){
    return this.stock;
}

public double CalcularPrecioTotal(int cantidad){
    return this.price*cantidad;
}

public boolean ComprarProducto(int cantidad){
    if (this.stock-cantidad <0){
        return false;
    }
    this.stock--;
    this.verifyProduct();
    return true;
}

public void verifyProduct(){
    if(stock<=0){
        //CallOperator
    }
}

public void surtir(int cantidad){
    this.stock+=cantidad;
}
}


