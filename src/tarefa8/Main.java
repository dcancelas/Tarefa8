package tarefa8;

import java.util.Scanner;

/**
 * @author dcancelas
 */
public class Main {

    public static void main(String[] args) {

        Integer[][] array1 = {{5,2,9,6},{7,2,1,4}};

        System.out.println("Valor mínimo: " + Operacions.valorMinimo(array1));
        System.out.println("Valor máximo: " + Operacions.valorMaximo(array1));

        System.out.print("Introduzca un valor a buscar: ");
        Integer valor = new Scanner(System.in).nextInt();
        Operacions.buscarValor(array1, valor);

        System.out.print("Introduzca un valor a eliminar: ");
        valor = new Scanner(System.in).nextInt();
        Operacions.borrarValor(array1, valor);
        //Conmprobamos se o valor eliminouse do array
        Operacions.buscarValor(array1, valor);
    }
}
