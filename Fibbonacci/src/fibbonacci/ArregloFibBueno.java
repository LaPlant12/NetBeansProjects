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
public class ArregloFibBueno {
    private int [] fib;
    private int index;
    private int forma;
    private int newforma;
    
    public ArregloFibBueno(){
        index = 3;
        forma = 0;
        newforma = 2;
        
        fib = new int[2];
        fib[0] = 1;
        fib[1] = 2;
    }
    
    public void agregar(){
        if(forma == 0){
            fib[0] = fib[0] + fib[1];
            newforma = 1;
        }
        if(forma == 1){
            fib[1] = fib[0] + fib[1];
            newforma = 0;
        }
        
        forma = newforma;
        index++;
    }
    
    public int ultimoNum(){
        if(index % 2 == 0)
            return fib[0];
        else
            return fib[1];
    }
    
    public boolean comprobar(int lim){
        //da true si el número de dígitos coincide con lim (1000)
        
        String s = ultimoNum() + "";
        
        return s.length() == lim;
    }
    
    public int getIndex(){
        return index;
    }
            
}
