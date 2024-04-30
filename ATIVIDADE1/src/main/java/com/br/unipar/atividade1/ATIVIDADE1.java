/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.br.unipar.atividade1;

import java.util.Scanner;

/**
 *
 * @author 00232262
 */
public class ATIVIDADE1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Insira a quantidade de elementos: ");
        int n = scanner.nextInt();

        
        int[] array = new int[n];
        System.out.println("Insira os números:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        
        bubbleSort(array);

        
        System.out.println("Números ordenados:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        
        System.out.print("Insira o número a ser pesquisado: ");
        int searchNum = scanner.nextInt();

        
        int position = linearSearch(array, searchNum);

        
        if (position != -1) {
            System.out.println("O número " + searchNum + " está presente na posição " + (position + 1) + " da lista ordenada.");
        } else {
            System.out.println("O número " + searchNum + " não está presente na lista.");
        }
    }

    
    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    
    private static int linearSearch(int[] array, int searchNum) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNum) {
                return i; 
            }
        }
        return -1; 
    }
}