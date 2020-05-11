package u2ej2veterinaria;

import java.util.Scanner;

public class U2Ej2Veterinaria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cliente[] clte;

        System.out.print("Ingrese la cantidad de clientes: ");
        int cantClte = input.nextInt();

        clte = new Cliente[cantClte];

        int cantCantClts = 0;
        for (int i = 0; i < cantClte; i++) {
            System.out.print("Ingrese el número de cliente: ");
            int numClte = input.nextInt();

            System.out.print("Ingrese nombre del cliente:  ");
            input.nextLine();
            String nomClte = input.nextLine();

            System.out.print("Ingrese años de antigüedad: ");
            int antiguedad = input.nextInt();

            System.out.print("Ingrese nombre de la mascota: ");
            input.nextLine();
            String nomMascota = input.nextLine();
            
            System.out.println(" ");

            clte[i] = new Cliente(numClte, nomClte, antiguedad, nomMascota);

            cantCantClts++;
        }
        System.out.println("La cantidad de clientes es: " + cantCantClts);

        int cantAnt5 = 0;
        for (int i = 0; i < clte.length; i++) {
            System.out.println(clte[i]);

            if (clte[i].antiguedad >= 5) {
                cantAnt5++;
            }
        }
        System.out.println("Hay " + cantAnt5 + " clientes con antigüedad de 5 años o más");     
    }

}
