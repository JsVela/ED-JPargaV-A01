/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jpargav.a01.pkg1;

/**
 *
 * @author JESUS PARGA VELA
 */
public class Escaleras {
     public static void bajar(int n){
        if(n>0){//Caso Base
            System.out.println("estas en el escalon "  + n );
            bajar(n-1);
            
             
        }else{
            System.out.println("ya acabaste de bajar la escalera");
        } 
    }
}
