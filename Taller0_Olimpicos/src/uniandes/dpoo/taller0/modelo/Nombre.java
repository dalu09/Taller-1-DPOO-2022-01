package uniandes.dpoo.taller0.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Nombre {
	private String nombre;
	private List<Atleta> atletas;
	public Nombre(String nombre)
	{
		this.nombre = nombre;
		atletas = new ArrayList<Atleta>();
	}
	
	public String darNombre()
	{
		return nombre;
	}
	
	public void agregarAtleta(Atleta nuevoAtleta)
	{
		atletas.add(nuevoAtleta);
	}
	
	public List<Map<String, Object>> consultarAtletas()
	{
		List<Map<String, Object>> resultado = new ArrayList<Map<String, Object>>();
		for (Atleta unAtleta : atletas)
		{
			List<Map<String, Object>> participacionesAtleta = unAtleta.consultarParticipacionesAtleta();
			resultado.addAll(participacionesAtleta);
		}
		return resultado;
	}
}
