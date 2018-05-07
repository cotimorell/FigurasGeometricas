/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 * Representa un triángulo en el plano
 * @author Pablo
 */
public abstract class Triangulos extends Figuras2D {
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulos (Posicion2D posicion, double lado1, double lado2, double lado3){ //constructor
        super (posicion, "Triangulo");
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    /**
     * 
     * @return la superficie
     */
        @Override
    public double CalcularSuperficie () { 
        double s = CalcularPerimetro() / 2; //semiperimetro//
        System.out.println("El perimetro es: " + CalcularPerimetro());
        System.out.println("El semiperimetro es:" + s);
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
    
    /**
     * 
     * @return el perímetro
     */
    @Override
    public double CalcularPerimetro () {
        return lado1 + lado2 + lado3;
    }
    
    /**
     * @return el lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * @return el lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * @return el lado3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * @param lado1 Establece el lado1
     * @throws figurasgeometricas.DimensionIncorrectaException
     */
    public void setLado1(double lado1) throws DimensionIncorrectaException{
        if (lado1 <= 0){
            throw new DimensionIncorrectaException();
        }
        this.lado1 = lado1;
    }

    /**
     * @param lado2 Establece el lado2
     * @throws figurasgeometricas.DimensionIncorrectaException
     */
    public void setLado2(double lado2) throws DimensionIncorrectaException{
        if (lado2 <= 0){
            throw new DimensionIncorrectaException();
        }
        this.lado2 = lado2;
    }

    /**
     * @param lado3 Establece el lado3
     */
    public void setLado3(double lado3) throws DimensionIncorrectaException {
        if (lado3 <= 0){
            throw new DimensionIncorrectaException();
        }
        this.lado3 = lado3;
    }
       
}
