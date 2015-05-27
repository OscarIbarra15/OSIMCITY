package juego;

public class Calle 
{
    private String nombre = "";
    private Interseccion inicio = null;
    private Interseccion fin = null;

    public Calle(String nombre, Interseccion inicio, Interseccion fin) 
    {
    	super();
    	this.nombre = nombre;
    	this.inicio = inicio;
    	this.fin = fin;
    }

    public String getNombre() 
    {
    	return nombre;
    }

    public void setNombre(String nombre) 
    {
    	this.nombre = nombre;
    }

    public Interseccion getInicio() 
    {
    	return inicio;
    }

    public void setInicio(Interseccion inicio) 
    {
    	this.inicio = inicio;
    }
    
    public Interseccion getFin() 
    {
    	return fin;
    }

    public void setFin(Interseccion fin) 
    {
    	this.fin = fin;
    }

    @Override
    public String toString() 
    {
    	return "Calle [nombre=" + nombre + ", inicio=" + inicio + ", fin=" + fin + "]";
    }
    
}
