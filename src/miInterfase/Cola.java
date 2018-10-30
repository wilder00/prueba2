/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miInterfase;

/**
 *
 * @author alumno
 
 */
public interface Cola<E>{
    void encolar(E x);
    E desencolar();
    E frenteC();
    boolean colaVacia();
    boolean colaLlena();
}
