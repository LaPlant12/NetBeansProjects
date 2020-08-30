
package fibbonacci;

/**
 *
 * @author laplant
 */
public class Fibbonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objetivo: encontrar el primer termino de la secuencia de fibonnaci
        // que contenga 1000 dígitos
        
        ArregloFibBueno secuencia = new ArregloFibBueno();
        
        while(!secuencia.comprobar(1000)){
            secuencia.agregar();
        }
        
        System.out.println(secuencia.getIndex() + ") " + secuencia.ultimoNum());
    }
    
}
