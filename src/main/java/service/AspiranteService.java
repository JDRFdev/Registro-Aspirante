package service;

import java.util.List;

import model.AspiranteDAO;
import model.AspiranteDTO;
import model.ProgramaDAO;
import model.ProgramaDTO;

public class AspiranteService {

	private AspiranteDAO repositorioAspirantes;
	private ProgramaDAO repositorioProgramas;
	public AspiranteService() {
		this.repositorioAspirantes=new AspiranteDAO();
		this.repositorioProgramas=new ProgramaDAO();
	}
	public void registrar(AspiranteDTO aspirante) {
		this.repositorioAspirantes.registrarAspirante(aspirante);
	} 
	public List<AspiranteDTO> obtenerAspirantes(){
		return this.repositorioAspirantes.obtenerTodos();
	}
	public List<ProgramaDTO> obtenerProgramas(){
		return this.repositorioProgramas.obtenerProgramasOfertados();
	}
}
