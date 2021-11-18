package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Pedir numero
	* Leer numero
	* SI (num==0)
	* FINSI
	* Calcular inverso
	* Imprimir inverso*/
        Scanner scan=new Scanner(System.in);
		float numero=0;
		float inverso=0;
		System.out.println("Introduzca el número del que quiere obtener el inverso");
		numero=scan.nextFloat();
		if (numero==0){
			System.out.println("El 0 no tiene inverso");
		}
		else {
			inverso = 1 / numero;
			System.out.println("El inverso es" + " " + inverso);
		}
    }
}
