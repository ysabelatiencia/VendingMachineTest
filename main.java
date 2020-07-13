import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        VendingMachine machine=new VendingMachine();
        machine.AgregarProducto(new Producto(1,"Dulce 1", 0.50, 10));
        machine.AgregarProducto(new Producto(2,"Dulce 2", 0.70, 10));
        machine.AgregarProducto(new Producto(3,"Jugo", 1.50, 5));
        machine.AgregarProducto(new Producto(4,"Cola", 1.25, 7));

        System.out.println("Productos disponibles");
        machine.showProducts();
        Compra compra=new Compra();
        Scanner in = new Scanner(System.in);
        int opc=0;
        boolean p=true;
        while(opc!=-1){
            p=true;
            int producto=0;
            int cantidad=0;
            while(p){
                System.out.println("Ingrese el número del producto: ");
                try{
                    producto = in.nextInt();
                    p=false;
                }
                catch(Exception e){
                    System.out.println("El valor ingresado es incorrecto, ingrese nuevamente");
                }
            }
            p=true;
            while(p){
                System.out.println("Ingrese la cantidad del producto: ");
                try{
                    cantidad = in.nextInt();
                    p=false;
                }
                catch(Exception e){
                    System.out.println("El valor ingresado es incorrecto, ingrese nuevamente");
                }
            }
            try{
                compra.AgregarItem(machine.getProducto(producto), cantidad);
                System.out.println("*****Si dese continuar su compra presione 0, caso contrario -1");
                opc=in.nextInt();
            }
            catch(Exception e){
                System.out.println("Ha ocurrido un error, ingrese nuevamente");
            }
        }

    System.out.println("***DETALLES***");
    compra.mostrarDetalles();

    System.out.println("***Insertar dinero***");
    p=true;
    double dinero=0;
    opc=0;
    while(opc!=-1){
        p=true;
        while(p){
                System.out.println("Ingrese el dinero: ");
                try{
                    dinero = in.nextDouble();
                    p=false;
                }
                catch(Exception e){
                    System.out.println("El valor ingresado es incorrecto, ingrese nuevamente");
                }
            }
            compra.InsertarDinero(dinero);
            System.out.println("Si desea insertar + monedas presione 0, caso contrario -1");
            opc=in.nextInt();
    }

    System.out.print("***PAGO***");
    compra.Pagar();
    System.out.println("Ha realizado su compra");


    

	}

}
