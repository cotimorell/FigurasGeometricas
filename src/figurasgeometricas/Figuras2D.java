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
public abstract class Figuras2D extends FigurasGeometricas implements Movil{
    private Posicion2D pos;
    private static int nroOrden=0;
    private String id;
    
    public Figuras2D (Posicion2D posicion, String id){ //constructor
        nroOrden++;
        this.id = id + nroOrden; 
        pos = posicion;
    }
    
    
    abstract public double CalcularPerimetro ();
    
    protected abstract void CalcularExtremos() throws FueraDelPlanoException;
       
        
    
    private void VerificarSiEstaDentroDelPlano() throws FueraDelPlanoException{
        CalcularExtremos();        
    }
    
    /**
     * @return pos la posición de la figura
     */
    public Posicion2D getPos() {
        return pos;
    }

    /**
     * @param pos Establece la posición
     */
    public void setPos(Posicion2D pos) {
        this.pos = pos;
    }
    
    /**
     * Mueve la figura hacia arriba en el eje Y del plano
     * @param distancia 
     */
    @Override
    public void MoverArriba (double distancia) throws FueraDelPlanoException{
        Posicion2D posicionOriginal = getPos();
        try {
            Posicion2D nuevaPosicion = new Posicion2D (posicionOriginal.getX(), posicionOriginal.getY()+distancia);
            setPos(nuevaPosicion);
            VerificarSiEstaDentroDelPlano();
        }catch(FueraDelPlanoException Exepcion){
            setPos(posicionOriginal);
        }        
    }
    
    /**
     * Mueve la figura hacia abajo en el eje Y del plano
     * @param distancia 
     */
    @Override
    public void MoverAbajo (double distancia) throws FueraDelPlanoException{
        Posicion2D posicionOriginal = getPos();
        try {
            Posicion2D nuevaPosicion = new Posicion2D (posicionOriginal.getX(), posicionOriginal.getY()-distancia);
            setPos (nuevaPosicion);
            VerificarSiEstaDentroDelPlano();
        }catch (FueraDelPlanoException Excepcion){ 
            setPos (posicionOriginal);
        }
    }
    
    /**
     * Mueve la figura hacia la derecha en el plano X del plano 
     * @param distancia 
     */
    @Override
    public void MoverDerecha (double distancia) throws FueraDelPlanoException{
        Posicion2D posicionOriginal = getPos();
        try {
            Posicion2D nuevaPosicion = new Posicion2D (posicionOriginal.getY(), posicionOriginal.getX()+distancia);
            setPos (nuevaPosicion);
            VerificarSiEstaDentroDelPlano();
        }catch (FueraDelPlanoException Excepcion){
            setPos (posicionOriginal);
        }        
    }
    
    /**
     * Mueve la figura hacia la izquierda en el eje X del plano 
     * @param distancia 
     */
    @Override
    public void MoverIzquierda (double distancia) throws FueraDelPlanoException{
        Posicion2D posicionOriginal = getPos();
        try {
            Posicion2D nuevaPosicion = new Posicion2D (posicionOriginal.getY(), posicionOriginal.getX()+distancia);
            setPos (nuevaPosicion);
            VerificarSiEstaDentroDelPlano();
        }catch(FueraDelPlanoException Excepcion){
            setPos (posicionOriginal);
        }
    }
    
    /**
     * Mueve la figura en ambos ejes del plano según las distancias recibidad
     * @param distanciaX
     * @param distanciaY 
     */
    @Override
    public void Mover (double distanciaX, double distanciaY) throws FueraDelPlanoException{
        Posicion2D posicionOriginal = getPos();
        try{
            Posicion2D nuevaPosicion = new Posicion2D (posicionOriginal.getX()+distanciaX, posicionOriginal.getY()+distanciaY);
            setPos (nuevaPosicion);
            VerificarSiEstaDentroDelPlano();
        }catch (FueraDelPlanoException Excepcion){
            setPos (posicionOriginal);
        }     
    }
    
    /**
     * Mueve la figura de su posición actual a la otorgada por parámetro
     * @param posicion 
     */
    @Override
    public void Mover (Posicion2D posicion) throws FueraDelPlanoException{
        Posicion2D posicionOriginal = getPos();
        try{
            setPos (posicion);
            VerificarSiEstaDentroDelPlano ();
        }catch (FueraDelPlanoException Excepcion){
            setPos (posicionOriginal);
        }
    }    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    public String toString(){
        return id;
    }
}
