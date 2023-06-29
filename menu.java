import java.util.Scanner;

public class menu extends login  {
    int saldo, cantidad = 0;
    Scanner teclado = new Scanner(System.in);

    public void cajero() {
        System.out.println("1. Consultar saldo.");
        System.out.println("2. Depositar");
        System.out.println("3. Retirar");
        System.out.println("4. Cerrar Sesion");
        System.out.print("Elije la operacion que desees: ");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1: 
                verSaldo();
            case 2:
                depositar();
            case 3:
                retirar();
            case 4: 
                System.out.println("Cerrando Sesion... ");
                iniciarSesion();
            default: 
                System.out.println("Debes elejir entre las 4 opciones.");
                cajero();
        }
    }

    public void depositar() {
        System.out.print("Cantidad a depositar: ");
        cantidad = teclado.nextInt();
        saldo = saldo + cantidad;
        System.out.println("Operacion finalizado con exito.");
        cajero();
    } 

    public void retirar(){
        System.out.print("Cantidad a retirar: ");
        cantidad = teclado.nextInt();

        if (saldo < cantidad) {
            System.out.println("No tienes saldo suficiente. ");
            cajero();
        } else if (cantidad < 0) {
            System.out.println("Debe ser cantidad positiva. ");
            cajero();
        }

        saldo = saldo - cantidad;
        System.out.println("Operacion finalizado con exito.");
        cajero();
    }    

    public void verSaldo() {
        System.out.println("Tu saldo es de " + saldo);
        cajero();
    }
}
