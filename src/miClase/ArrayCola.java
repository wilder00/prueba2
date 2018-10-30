/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miClase;

import javax.swing.JOptionPane;
import miInterfase.Cola;

/**
 *
 * @author alumno
 */
public class ArrayCola<E> implements Cola{
    
    private static final int TAMCOLA=50;
    
    private E[] arc;
    private int frenteC;
    private int finalC;

    public ArrayCola() {
        
        
        arc=(E[])new Object[TAMCOLA];
        frenteC=-1;
        finalC=-1;
    }
    public boolean colaVacia(){
        return(frenteC==-1&&finalC==-1);//debuelve verdadero si esto se cumple
    }
    
    public boolean colaLlena(){
        return((frenteC==0&& finalC==TAMCOLA-1)||(frenteC==finalC+1));//devuelve verdadero si esto se da
    }
    public void encolar(E x){
    if(colaLlena()==false){
        if(colaVacia()==true){
            frenteC=0;
            finalC=0;
        }else if(finalC==TAMCOLA-1){
            finalC=0;
        }else{
            finalC++;
        }
        arc[finalC]=x;
    }else{
        JOptionPane.showMessageDialog(null,"Cola llena");
    }
    
    }
    public E desencolar(){
    E elementoSacado=arc[frenteC];
    
    if(frenteC==finalC){
        frenteC=-1;
        finalC=-1;
    }else if(frenteC==TAMCOLA-1){
        frenteC=0;
    }else{
        frenteC++;
    }
    return elementoSacado;
    }
    
    public E frenteC(){
        return arc[frenteC];
    }
    
    //contenido de la cola sin modificacion
    public String mostrarColadeDatos(){
        String cad="";
        ArrayCola<E> cAux = new ArrayCola<E>();
        while(colaVacia()==false){
            E x = desencolar();
            cad=cad+x+" ";
            cAux.encolar(x);
        }
        while(cAux.colaLlena()==false){
            
        }
        
        return cad;
    }
    
    
}
