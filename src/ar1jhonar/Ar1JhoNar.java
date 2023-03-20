package ar1jhonar;

import java.util.*;
import java.lang.Math;

public class Ar1JhoNar {

    public static void main(String[] args) {

        /* EJERCICIO 1
        Hacer un programa que cree un array de dos filas y 5 columnas. En la primera fila se 
        introducen 5 números que se pidan por teclado y la segunda fila se inicializa a 0. 
        Posteriormente se introduce en la segunda fila el cubo de la primera y se muestra el 
        resultado por pantalla.        
         
        Scanner sc=new Scanner (System.in);
        
        int cubo[][] = new int[2][5];
        //primero metemos los numeros aleatorios
        for (int i = 0; i < cubo[1].length; i++) {
            System.out.print("Inserte un número: ");
            cubo[0][i]=sc.nextInt();
        }
        //rellenamos de 0 la segunda fila
        Arrays.fill(cubo[1],0);
        //metemos el cubo del numero 
         for (int i = 0; i < cubo[1].length; i++) {
            cubo[1][i]=(int) Math.pow(cubo[0][i],3);
        }
        //mostramos por pantalla
         for (int i = 0; i < cubo[1].length; i++) {
            System.out.println(cubo[0][i]+" elevado a 3 es: "+cubo[1][i]);
        }
         */
        //EJERCICIO 2
        /*
        Hacer un programa que indique los caracteres y número de veces que aparece cada 
        uno, en un texto pasado por argumento. Para ello tendremos dos arrays 
        unidimensionales. El primero llamado car va a contener los caracteres del texto sin 
        repetir. El segundo es un array de enteros con la misma longitud que el primero, en el 
        que llevamos el número de veces que aparece el carácter. 
         */
        String palabra = "Caballo";
        int cont = 0;
        boolean repe = false;
        char car[] = new char[palabra.length()];
        int ent[] = new int[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            
            for (int j = 0; j < palabra.length(); j++) {
                if (palabra.charAt(i) == car[j]) {
                    repe = true;
                   
                }
                
            }

            if (repe == false) {
               
                car[i] = palabra.charAt(i);
                 
            }
           repe=false;
             
        }
        for (int i = 0; i < palabra.length(); i++) {
            System.err.println(car[i]);
        }
        //recorremos los arrays para contar duplicados
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < palabra.length(); j++) {
                if (car[i] == car[j]) {
                    cont += 1;
                    ent[i] = cont;
                }
            }
            cont = 0;
        }
        /*para quitar los caracteres parecidos
        for (int i=0; i < palabra.length();i++) {
            for (int j=0; j < palabra.length();j++) {
                if (car[i]==car[j]) {                   
                   car[i]=palabra.charAt(i);
                }      
         }*/

    }

}
