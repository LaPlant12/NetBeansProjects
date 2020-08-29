
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
        
        ArregloFib secuencia = new ArregloFib();
        
        while(!secuencia.comprobar(100)){
            secuencia.agregar();
        }
        
        System.out.println("La primera posición que tiene 1000 dígitos es: \n" + secuencia.getLength() + ") " + secuencia.getUltimaPosicion());
    }
    
}
