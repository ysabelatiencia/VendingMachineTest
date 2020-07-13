import java.util.List;
import java.util.ArrayList;

public class Compra {
    ArrayList<Detalle> detalles = new ArrayList();
    double total;
    double pago;


public void AgregarItem(Producto p, int cantidad){
    Detalle detalle = new Detalle(p, cantidad);
    this.total+=detalle.getTotal();
}

public void mostrarDetalles(){
    int index=0;
    for(Detalle detalle: this.detalles){
        index++;
        System.out.println(index+". "+detalle.getProducto().getName()+"  ---  "+detalle.getCantidad()+"  ---  "+detalle.getTotal());
    }

    System.out.print("El total de la compra es: "+this.total);
}

public void InsertarDinero(double dinero){
    this.pago+=dinero;
}

public boolean Pagar(){
    if(this.pago<this.total)
        {
            System.out.println("No ingresó el dinero suficiente");
            return  false;
        }
    if(!ComprarProductos())
        return false;
    System.out.println("Su devolución es: "+this.Devolucion());
    return true;
}


public double Devolucion(){
    return this.pago-this.total;
}

public boolean ComprarProductos(){
    for(Detalle detalle: this.detalles){
        if(!detalle.Comprar())
            return false;
    }
    return true;
}

public void  EliminarItems(){
    this.detalles.clear();
    this.total=0;
    this.pago=0;
}


}