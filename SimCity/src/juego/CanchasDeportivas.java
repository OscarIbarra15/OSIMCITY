package juego;

public class CanchasDeportivas 
{
    private String nombre = "";
    private String Ubicacion = "";
	
    public CanchasDeportivas(String nombre,String Ubicacion) 
    {
	super();
	this.nombre = nombre;
	this.Ubicacion = Ubicacion;
    }

    public void setNombre(String nombre) 
    {
    	this.nombre = nombre;
    }

    public String getNombre() 
    {
        return nombre;
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
