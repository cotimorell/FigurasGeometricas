/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Representa el plano con el eje de cordenadas donde se ubicarán las figuras
 * @author Pablo
 */
public class Plano {
    
        private ArrayList<Figuras2D> figuras;
        private ArrayList<Circulos> circulos;
        private ArrayList<Rectangulo> rectangulos;
    
    public Plano () {
        figuras = new ArrayList <> ();
        circulos = new ArrayList <> ();
        rectangulos = new ArrayList <> ();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Plano p = new Plano ();
        p.Inicializar();
        
        
        
       
        /*try {
            p.rectangulos.get(0).Mover(1000, 1000);
        }
        catch (FueraDelPlanoException Excepcion){
        }*/
    }
    public void Inicializar(){
        try{
            System.out.println("I hate java");
            AddCirculo(new Circulos(new Posicion2D(4,2),5));
            AddRectangulo(new Rectangulo(4,2,new Posicion2D(8,6)));
            AddCirculo(new Circulos(new Posicion2D(13,9),2));
            AddRectangulo(new Rectangulo(29,14, new Posicion2D(58,36)));
            ListarFigurasPorPerimetro ();

        }catch(FueraDelPlanoException e){
            System.out.println("Se ha producido un error");
        }
    }
    
    public void AddCirculo (Circulos c){
        figuras.add(c);
        circulos.add(c);
    }
    
    public void AddRectangulo (Rectangulo r){
        figuras.add(r);
        rectangulos.add(r);
    }
    /**
     * Se calcula la distancia entre los radios de 2 circulos y se verifica si se encuentran solapadas
     * @param c1
     * @param c2
     * @return 
     */
    public boolean SolapamientoCirculos (Circulos c1, Circulos c2){
        boolean solapamiento = false;
        if (c1.getPos().distancia(c2.getPos())<c1.getRadio()+c2.getRadio()){
            solapamiento=true;
        }
        return solapamiento;
    }
    
    /**
     * Se calcula la distancia entre los centros de 2 rectángilos tanto del eje X 
     * como del Y y se verifica si se encuentran solapados
     * @param r1
     * @param r2
     * @return 
     */
    public boolean SolapamientoRectangulos (Rectangulo r1, Rectangulo r2){
        boolean solapamiento = false;
        if (r1.getPos().distancia(r2.getPos())<(r1.getAncho()/2+r2.getAncho()/2)&&
                (r1.getPos().distancia(r2.getPos())<r1.getLargo()/2+r2.getLargo()/2)){
            solapamiento = true;   
        }
        return solapamiento;   
    }
    
    /**
     * Primero corroboro que el centro del circulo este contenido entre los lados x del rectangulo 
     * y que su limite superior o inferior dentro de los lados Y del rectangulo
     * Luego, 
     * @param c
     * @param r
     * @return 
     */    
    public boolean SolapamientoCirculoRectangulo (Circulos c, Rectangulo r) throws FueraDelPlanoException{
        double xIzq = r.getPos().getX()-(r.getLargo()/2);
        double xDer = r.getPos().getX()+(r.getLargo()/2);
        double ySup = r.getPos().getY()+(r.getAncho()/2);
        double yInf = r.getPos().getY()-(r.getAncho()/2);
        double limSupCirc = c.getPos().getY()+c.getRadio();
        double limInfCirc = c.getPos().getY()-c.getRadio();
        double limIzqCirc = c.getPos().getX()-c.getRadio();
        double limDerCirc = c.getPos().getX()+c.getRadio();
        boolean solapamiento = false;
        if ((c.getPos().getX() >= xIzq && c.getPos().getX()<= xDer) && //
            (limSupCirc > yInf && limSupCirc < ySup || limInfCirc > yInf && limInfCirc < ySup)) { // 
            solapamiento = true;
        }else if ((c.getPos().getY()<= ySup && c.getPos().getY()>= yInf) && //corroboro que el centro del circulo se encuentre entre los lados y del rectangulo
             (limIzqCirc < xDer && limIzqCirc > xIzq || limDerCirc < xDer && limDerCirc > xIzq)){ // corroboro que alguno del los limites del circulo esté contenido dentro de los lados x del rectangulo
            solapamiento = true;
        }else if ((c.getPos().getY() > yInf && c.getPos().getY() < ySup) && //corroboro que el centro del circulo se encuentre 
                (c.getPos().getX() > xIzq && c.getPos().getX() < xDer)){   //contenido dentro del rectangulo
            solapamiento = true;
        }else if (ObtenerVerticeMasCercanoACirculo(c, ObtenerVerticesRectangulo(r)).distancia(c.getPos())<=c.getRadio()){
            solapamiento = true;
        }
        
        return solapamiento;
    }
    
    private Posicion2D ObtenerVerticeMasCercanoACirculo(Circulos c, ArrayList <Posicion2D> posiciones){
        Posicion2D verticeMasCercano = posiciones.get(0);
        for (Posicion2D posicion: posiciones){
            if (posicion.distancia(c.getPos()) < verticeMasCercano.distancia(c.getPos())){
                verticeMasCercano = posicion;
            }
        }
        return verticeMasCercano;
    }
    
    private ArrayList <Posicion2D> ObtenerVerticesRectangulo (Rectangulo r) throws FueraDelPlanoException{
        ArrayList <Posicion2D> posiciones;
        posiciones = new ArrayList <> ();
        double x1 = r.getPos().getX()-r.getLargo()/2;//posiciones x izquierdas
        double x2 = r.getPos().getX()+r.getLargo()/2;//posiciones x derechas
        double y1 = r.getPos().getY()-r.getAncho()/2;//posiciones y inferiores
        double y2 = r.getPos().getY()+r.getAncho()/2;//posiciones y superiores
        Posicion2D vertSupIzq = new Posicion2D(x1, y2);
        Posicion2D vertSupDer = new Posicion2D(x2, y2);
        Posicion2D vertInfDer = new Posicion2D(x1, y1);
        Posicion2D vertInfIzq = new Posicion2D(x2, y1);
        posiciones.add(vertSupIzq);
        posiciones.add(vertSupDer);
        posiciones.add(vertInfDer);
        posiciones.add(vertInfIzq);
        return posiciones;
    }
    
    public List OrdenarPorSuperficie(){
        TreeMap <String,Figuras2D> treeSup = new TreeMap<> ();
        for (Figuras2D f: figuras){
            treeSup.put(f.CalcularSuperficie()+f.getId(),f);            
        }
        return new ArrayList <Figuras2D>(treeSup.values());
    }
    
    public List OrdenarPorPerimetro (){
        TreeMap <String, Figuras2D> treePer = new TreeMap<> ();
        for (Figuras2D f: figuras){
            treePer.put(f.CalcularPerimetro()+f.getId(), f);
        }
        return new ArrayList<Figuras2D>(treePer.values());
    }
    
    public void ListarFiguras(){
        for(Figuras2D f : figuras){
            System.out.println(f);
        }
    }
    
    public void ListarFigurasPorPerimetro (){
        System.out.println("El orden de las figuras por perimetro es:" + OrdenarPorPerimetro());
    }
    
    public void ListarFigurasPorSuperficie (){
        System.out.println("El orden de las figuras por superficie es:" + OrdenarPorSuperficie());
    }
    
    public void ListarCirculos(){
        for(Circulos c : circulos) {
            System.out.println(c);
        }
    }
    
    public void ListarRectangulos(){
        for(Rectangulo r : rectangulos) {
            System.out.println(r);
        }
    }
}
        

        



