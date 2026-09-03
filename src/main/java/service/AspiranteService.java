package service;

import java.util.List;

import model.AspiranteDAO;
import model.AspiranteDTO;

public class AspiranteService {

	private AspiranteDAO repositorioAspirantes;
	
	public AspiranteService() {
		this.repositorioAspirantes=new AspiranteDAO();
	}
	public void registrar(AspiranteDTO aspirante) {
		this.repositorioAspirantes.registrarAspirante(aspirante);
	} 
	public List<AspiranteDTO> obtenerAspirantes(){
		return this.repositorioAspirantes.obtenerTodos();
	}
	public List<String> obtenerProgramas(){
		return this.repositorioAspirantes.obtenerProgramasOfertados();
	}
}
