package juego;
import java.util.Vector;
public class Mapa 
{
    private Vector<Calle> calles = new Vector<Calle>();
    private Vector<Interseccion> intersecciones = new Vector<Interseccion>();

    public Mapa() 
    {
    	super();
    }

    public Vector<Calle> getcalles() 
    {
    	return calles;
    }

    public void setCalles(Vector<Calle> calles) 
    {
    	this.calles = calles;
    }

    public Vector<Interseccion> getIntersecciones() 
    {
    	return intersecciones;
    }

    public void setIntersecciones(Vector<Interseccion> intersecciones) 
    {
    	this.intersecciones = intersecciones;
    }

    @Override
    public String toString() 
    {
    	return "Mapa [calles=" + calles + ", intersecciones=" + intersecciones
    			+ "]";
    }
}
