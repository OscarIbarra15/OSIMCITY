package juego;
import java.util.Vector;

public class Interseccion 
{
    private String nombre = "";
    private int x = 0;
    private int y = 0;
    private Vector<Calle> calles = new Vector<Calle>();

    public Interseccion(String nombre, int x, int y) 
    {
    	super();
	this.nombre = nombre;
	this.x = x;
	this.y = y;
    }

    public String getNombre() 
    {
	return nombre;
    }

    public void setName(String nombre) 
    {
    	this.nombre = nombre;
    }

    public Vector<Calle> getCalles() 
    {
	return calles;
    }

    public void setCalles(Vector<Calle> calles) 
    {
	this.calles = calles;
    }

    public int getX() 
    {
    	return x;
    }

    public void setX(int x) 
    {
    	this.x = x;
    }

    public int getY() 
    {
    	return y;
    }

    public void setY(int y) 
    {
    	this.y = y;
    }
    
    @Override
    public String toString() 
    {
    	return "Interseccion [nombre=" + nombre + ", x=" + x + ", y=" + y + "]";
    }
}
