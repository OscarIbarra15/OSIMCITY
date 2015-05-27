package juego;

public class Casa 
{
    private String nombre = "";
    private int cuartos = 0;
	
    public void Hospital(String nombre,int cuartos) 
    { 
	this.nombre = nombre;
	this.cuartos = cuartos;
    }

    public void setNombre(String nombre) 
    {
	this.nombre = nombre;
    }

    public String getNombre() 
    {
        return nombre;
    }
	
    public void setCuartos(String Cuartos, int cuartos) 
    {
	this.cuartos = cuartos;
    }

    public int getCuartos() 
    {
	return cuartos;
    }
}
