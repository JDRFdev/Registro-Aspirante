package controller;

import java.io.Serializable;
import java.util.List;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import model.AspiranteDTO;
import service.AspiranteService;

@Named("aspiranteBean")
@ViewScoped
public class AspiranteBean implements Serializable {

	private static final long serialVersionUID = -154542517548252213L;
	private final AspiranteService service=new AspiranteService();
	private AspiranteDTO nuevoAspirante=new AspiranteDTO();
	
	public void registrar() {
		this.service.registrar(nuevoAspirante);
	} 
	public List<AspiranteDTO> obtenerAspirantes(){
		return this.service.obtenerAspirantes();
	}
	public List<String> obtenerProgramas(){
		return this.service.obtenerProgramas();
	}
	public AspiranteDTO getNuevoAspirante() {
		return nuevoAspirante;
	}

	
}
