/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class Plano {
    
        private ArrayList<FigurasGeometricas> figuras;
        private ArrayList<Circulos> circulos;
        private ArrayList<Rectangulo> rectangulos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Plano p = new Plano ();
        
        p.figuras.add(new Circulos(2));
        p.figuras.add(new Rectangulo(4,2));
        p.circulos.add(new Circulos(2));
        p.rectangulos.add(new Rectangulo(4,2));
        
    }
    
    public boolean SolapamientoCirculos (Circulos c1, Circulos c2){
        boolean solapamiento = false;
        if (c1.getPos().distancia(c2.getPos())<c1.getRadio()+c2.getRadio()){
            solapamiento=true;
        }
        return solapamiento;
    }
        
    public boolean SolapamientoRectangulos (Rectangulo r1, Rectangulo r2){
        boolean solapamiento = false;
        if (r1.getPos().distancia(r2.getPos())<(r1.getAncho()/2+r2.getAncho()/2)&&
                (r1.getPos().distancia(r2.getPos())<r1.getLargo()/2+r2.getLargo()/2)){
            solapamiento = true;   
        }
        return solapamiento;   
    }
    
    public boolean SolapamientoCirculoRectangulo (Circulos c, Rectangulo r){
        double xIzq = r.getPos().getX()-(r.getLargo()/2);
        double xDer = r.getPos().getX()+(r.getLargo()/2);
        double ySup = r.getPos().getY()+(r.getAncho()/2);
        double yInf = r.getPos().getY()-(r.getAncho()/2);
        double limSupCirc = c.getPos().getY()+c.getRadio();
        double limInfCirc = c.getPos().getY()-c.getRadio();
        double limIzqCirc = c.getPos().getX()-c.getRadio();
        double limDerCirc = c.getPos().getX()+c.getRadio();
        boolean solapamiento = false;
        if ((c.getPos().getX() >= xIzq && c.getPos().getX()<= xDer) && //corroboro que el circulo este entre los lados x del rectangulo
            (limSupCirc > yInf && limSupCirc < ySup || limInfCirc > yInf && limInfCirc < ySup)) { // corroboro que el limite superior o inferior del circulo se encuentre contenido dentro del rectangulo
            solapamiento = true;
        }else if ((c.getPos().getY()<= ySup && c.getPos().getY()>= yInf) && 
             (limIzqCirc < xDer && limIzqCirc > xIzq || limDerCirc < xDer && limDerCirc > xIzq)){
        }else if ((c.getPos().getY() > yInf && c.getPos().getY() < ySup) && 
                (c.getPos().getX() > xIzq && c.getPos().getX() < xDer)){   
        }
        return solapamiento;
    }
    
    private void ObtenerVerticesRectangulo (Rectangulo r) {
        ArrayList <Posicion2D> posiciones;
        posiciones = new ArrayList <> ();
        
    }
            
    
        
    public void ListarFiguras(){
        for(FigurasGeometricas f : figuras) {
            System.out.println(f);
        }
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
        

        



