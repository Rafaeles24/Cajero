import java.util.Scanner;

public class login {
    int usuario [] = {12345678, 87654321};
    int password [] = {4321, 1234};
    String nombre [] = {"Juan Carlos", "Enrique Quispe"};
    int VerUsuario = 0, VerPassword = 0;
    boolean verificar1 = false, verificar2 = false;
    Scanner teclado = new Scanner(System.in);

    public void iniciarSesion() {
        for (int x = 0; x < 3; x++) {
            System.out.print("DNI usuario: ");
            this.VerUsuario = teclado.nextInt();
            System.out.print("Contraseña: ");
            this.VerPassword = teclado.nextInt();

            for(int i = 0; i < usuario.length; i++) {
                if (this.VerUsuario == this.usuario[i]) {
                    this.verificar1 = true;
                    int y = i; 
                    if (this.VerPassword == this.password[y]) {
                        this.verificar2 = true;
                        System.out.println("Bienvenido " + nombre[y]);
                        break;
                    }        
                } 
            }

            if (this.verificar1 == true && this.verificar2 == true) {
                break;
            }

            if (this.verificar1 == false) {
                System.out.println("DNI usuario no existe, Intentalo nuevamente.");
            } else if (this.verificar2 == false) {
                System.out.println("La contraseña es incorrecta, Intentelo nuevamente.");
            }

            if (x == 2) {
                System.out.println("Has alcanzado el numero maximo de intentos, el programa se cerrara.");
                System.exit(0);
            }
        }
    }
}