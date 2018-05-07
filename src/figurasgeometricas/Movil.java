/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 * Representa las acciones que se pueden aplicar sobre un objeto
 * @author Pablo
 */
public interface Movil {
    public void MoverArriba (double distancia) throws FueraDelPlanoException;
    public void MoverAbajo (double distancia) throws FueraDelPlanoException;
    public void MoverDerecha (double distancia) throws FueraDelPlanoException;
    public void MoverIzquierda (double distancia) throws FueraDelPlanoException;
    public void Mover (double distanciaX, double distanciaY) throws FueraDelPlanoException;
    public void Mover (Posicion2D posicion) throws FueraDelPlanoException;
    
}

