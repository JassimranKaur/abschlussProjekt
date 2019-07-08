/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.notenblatt;

/**
 *
 * @author 5im15jakaur
 */
public class EigeneException extends Exception {

    /**
     * Creates a new instance of <code>EigeneException</code> without detail
     * message.
     */
    public EigeneException() {
        super();
    }

    /**
     * Constructs an instance of <code>EigeneException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public EigeneException(String msg) {
        super(msg);
    }
}
