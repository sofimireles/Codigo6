package com.revisionDeCodigo;

import java.util.Scanner;

public class Codigo6 {
	//Se agrego metotdo main para que corriera el codigo 
	public static void main (String[] args) {
	//Se agrego new	
	int[] n = new int[20];

	//Se corrigio la sintaxis a i++
    for (int i = 0; i < 20; i++) {
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " ");
    }
    
    //Se añadio un Scanner para que el usuario introduzca numeros 
    Scanner s = new Scanner(System.in);
    System.out.println("\n¿Qué números quiere resaltar? ");
    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    int opcion = Integer.parseInt(s.nextLine());

    int multiplo = (opcion == 1) ? 5 : 7;

    for(int e : n) {
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
    } else {
        System.out.print(e + " ");
      }
    }
    s.close();
  }
}

