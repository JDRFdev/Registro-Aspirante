package controller;

import java.io.Serializable;
import java.util.List;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import model.AspiranteDTO;
import model.ProgramaDTO;
import service.AspiranteService;

@Named("aspiranteBean")
@ViewScoped
public class AspiranteBean implements Serializable {

	private static final long serialVersionUID = -154542517548252213L;
	private final AspiranteService service=new AspiranteService();
	private AspiranteDTO nuevoAspirante=new AspiranteDTO();
	private int idProgramaSeleccionado;	public void registrar() {
		for (ProgramaDTO programa : service.obtenerProgramas()) {
			if(idProgramaSeleccionado==programa.getId()) {
				nuevoAspirante.setProgramaInteres(programa);
				break;
			}
		}
		this.service.registrar(nuevoAspirante);
		 this.nuevoAspirante = new AspiranteDTO();
		 this.idProgramaSeleccionado=0;
	} 
	public List<AspiranteDTO> obtenerAspirantes(){
		return this.service.obtenerAspirantes();
	}
	public List<ProgramaDTO> obtenerProgramas(){
		return this.service.obtenerProgramas();
	}
	public AspiranteDTO getNuevoAspirante() {
		return nuevoAspirante;
	}
	public int getIdProgramaSeleccionado() {
		return idProgramaSeleccionado;
	}
	public void setIdProgramaSeleccionado(int idProgramaSeleccionado) {
		this.idProgramaSeleccionado = idProgramaSeleccionado;
	}

}
