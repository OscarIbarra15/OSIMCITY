package juego;

public class Ciudad 
{
    private String nombre = "";
    private Mapa MapaDeCiudad = new Mapa();

    public Ciudad(String nombre) 
    {
	super();
        this.nombre = nombre;
    }
    
    public void setNombre(String nombre) 
    {
	this.nombre = nombre;
    }

    public String getNombre() 
    {
    	return nombre;
    }

    public void setMapaDeCiudad(Mapa MapaDeCiudad) 
    {
    	this.MapaDeCiudad = MapaDeCiudad;
    }

    public Mapa getMapaDeCiudad() 
    {
    	return MapaDeCiudad;
    }
}
