/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.util.Scanner;


public class Dado {
    
    public static void Menu(){
     System.out.println("1.- para jugar \n"+"2.- si no desea jugar");
     Scanner entra =new Scanner(System.in);
     int num=entra.nextInt();
     switch(num){
         case 1:
             if (sumaDado()==7){
                 System.out.println("Usted a ganado");
             }else{
                 System.out.println("No gando, diga intentando");
             }
             Menu();
         case 2:
             System.out.println("Gracias por jugar");
             break;
         default :
             System.out.println("ingrese un valor valido 1 0 2");
             Menu();
     }
             
    }
    public static int sumaDado(){
        try{
             Datos dado1 = new Datos();
            Datos dado2= new Datos();
            dado1.setCaraDado(dado1.generarDado());
            dado2.setCaraDado(dado1.generarDado());
            int suma= dado1.getCaraDado()+ dado2.getCaraDado();
            return suma;
        }catch(Exception e){
            return 0;
            
        }
    }
    
}
