
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class PRUEBA30Marzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre, Direccion;
        int telefono;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre");
            Nombre = teclado.nextLine();
        System.out.println("Ingrese Direccion");
            Direccion = teclado.nextLine();    
        System.out.println("Ingrese Número Telefonico");
            telefono = teclado.nextInt();    
        System.out.println("Nombre..."+Nombre);
        System.out.println("Dirección..."+Direccion);
        System.out.println("Numero Telefonico..."+telefono);
        
        
       System.out.println("Nombre: José Alejandro López Ramírez");
       System.out.println("Direccion: Huehuetenango Zona 8");
       System.out.println("Telefono: 55928636");
        
    }
    
}
