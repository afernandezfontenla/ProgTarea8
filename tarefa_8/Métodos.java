/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa_8;

/**
 *
 * @author afernandezfontenla
 */
public class Métodos {

    public static Integer valorMinimo(Integer[][] array) {
        int minimo = array[0][0];
        for (int i = 0; i < array.length; i++) {
            int ValorMinimo = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] < ValorMinimo) {
                    ValorMinimo = array[i][j];
                }
            }
            
            if (ValorMinimo < minimo) {
                minimo = ValorMinimo;
            }
            
        }
        return minimo;
    }

    public static Integer valorMaximo(Integer[][] array) {
        int ValorMáximo = array[0][0];
        for (int i = 0; i < array.length; i++) {
            int maximoFila = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > maximoFila) {
                    maximoFila = array[i][j];
                }
            }
            
            if (maximoFila > ValorMáximo) {
                ValorMáximo = maximoFila;
            }
        }
        
        return ValorMáximo;
    }

    public static void buscarValor(Integer[][] array, Integer valor) {
        loop:
        {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] != null) {
                        if (array[i][j].equals(valor)) {
                            System.out.println("Fila: " + i + "\nPosición: " + j);
                            break loop;
                        }
                    }
                }
            }
            System.out.println("-1");
        }
    }

    public static void borrarValor(Integer[][] array, Integer valor) {
        loop:
        {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] != null) {
                        if (array[i][j].equals(valor)) {
                            array[i][j] = null;
                            System.out.println(valor);
                            break loop;
                        }
                    }
                }
            }
            System.out.println("null");
        }
    }
}
