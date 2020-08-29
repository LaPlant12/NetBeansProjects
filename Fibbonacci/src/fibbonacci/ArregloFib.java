/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibbonacci;

/**
 *
 * @author laplant
 */
public class ArregloFib {
    
    private int [] fib;
    private int [] fib2;
    
    public ArregloFib(){
        fib = new int[2];
        fib[0] = 1;
        fib[1] = 1;
    }
    
    public void agregar(){
       fib2 = fib;
       
       fib = new int[fib2.length + 1];
       int l = fib.length;
       
        for (int i = 0; i < fib2.length; i++){
            fib[i] = fib2[i];
        }
        
        fib[l - 1] = fib[l-2] + fib[l-3];
    }
    
    public String mostrar(){
        String s = "";
        
        for (int i = 0; i < fib.length; i++) {
            s = s + i + ") " + + fib[i] + " \n";
        }
        
        return s;
    }
    
    public boolean comprobar(int lim){
        //da true si el número de dígitos coincide con lim (1000)
        
        String s = fib[fib.length - 1] + "";
        
        return s.length() == lim;
    }
    
    public int getLength(){
        return fib.length;
    }
    
    public int getUltimaPosicion(){
        return fib[fib.length - 1];
    }
}
