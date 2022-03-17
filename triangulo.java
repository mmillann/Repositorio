
package prpoligono;

public class triangulo extends PrPoligono{
    private String tipo;
    
    public triangulo()
    {
        super();
        this.tipo="";
    }
    public triangulo(double b, double h)
    {
        super(b,h,"Triangulo");
        this.tipo="Triangulo";
    }
    public triangulo(double x)
    {
        super(x,"Triangulo");
        this.tipo="Triangulo";
    }
    public triangulo(triangulo t)
    {
        super(t);
        this.tipo="Triangulo";
    }
     public double CalcularArea()
    {
     return (getBase()*getAltura())/2;
    }  
    
     public void MostrarTipo()
     {
         System.out.println("El objeto es un " + tipo);
     }
     
}
