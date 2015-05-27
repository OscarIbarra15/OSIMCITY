package juego;

public class Parque 
{
    private String Nombre = "";
    private String Ubicacion = "";
	
    public Parque(String nombre,String Ubicacion) 
    {
    	super();
    	this.Nombre = nombre;
    	this.Ubicacion = Ubicacion;
    }

    public void setNombre(String nombre) 
    {
    	this.Nombre = nombre;
    }

    public String getNombre() 
    {
    	return Nombre;
    }
	
    public void setUbicacion(String Ubicacion) 
    {
    	this.Ubicacion = Ubicacion;
    }
    
    public String getUbicacion() 
    {
    	return Ubicacion;
    }
}
