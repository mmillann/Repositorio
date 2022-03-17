/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prpoligono;

/**
 *
 * @author Usuario
 */
public class cuadrado extends PrPoligono{
    
    private String tipo;
    
    public cuadrado()
    {
        super();
        this.tipo="";
    }
    public cuadrado(double x)
    {
        super(x,"cuadrado");
        this.tipo="Cuadrado";
    }
    public cuadrado(cuadrado t)
    {
        super(t);
        this.tipo="Cuadrado";
    }
     public double CalcularArea()
    {
     return (getBase()*getAltura());
    }  
    
     public void MostrarTipo()
     {
         System.out.println("El objeto es un " + tipo);
     }
     
}


