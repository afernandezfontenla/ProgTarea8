/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa_8;

import java.util.Scanner;

/**
 *
 * @author afernandezfontenla
 */
public class Tarefa_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[][] array1 = {{5, 2, 9, 6}, {7, 2, 1, 4}};

        System.out.println("Valor mínimo: " + Métodos.valorMinimo(array1));
        System.out.println("Valor máximo: " + Métodos.valorMaximo(array1));
        System.out.print("Introduzca un valor a buscar: ");
        Integer valor = new Scanner(System.in).nextInt();
        Métodos.buscarValor(array1, valor);
        System.out.print("Introduzca un valor a eliminar: ");
        valor = new Scanner(System.in).nextInt();
        Métodos.borrarValor(array1, valor);
        Métodos.buscarValor(array1, valor);
    }
}
