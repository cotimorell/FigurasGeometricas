/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author Pablo
 */
public class FueraDelPlanoException extends Exception {

    /**
     * Creates a new instance of <code>FueraDelPlanoException</code> without
     * detail message.
     */
    public FueraDelPlanoException() {
        
    }

    /**
     * Constructs an instance of <code>FueraDelPlanoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public FueraDelPlanoException(String msg) {
        super(msg);
    }
}
