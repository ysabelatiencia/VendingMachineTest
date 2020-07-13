import java.util.ArrayList;

public class VendingMachine {
    ArrayList<Producto> productos=new ArrayList<>();
    


public void showProducts(){
    int index=0;
    for(Producto producto: this.productos){
        index++;
        System.out.println(producto.ID+". "+producto.getName()+"  -  $"+producto.getPrice());
    }
}

public boolean EliminarProducto(Producto producto){
    return productos.remove(producto);
}

public boolean AgregarProducto(Producto producto){
    return productos.add(producto);
}

public Producto getProducto(int id){
    for(Producto p: productos){
        if(p.ID == id)
            return p;
    }
    return null;
}




}