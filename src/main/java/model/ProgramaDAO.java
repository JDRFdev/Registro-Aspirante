package model;

import java.util.ArrayList;
import java.util.List;

public class ProgramaDAO {
    private static List<ProgramaDTO> programas = new ArrayList<>();
    
    
	public ProgramaDAO() {
		 if (programas.isEmpty()) {
	            programas.add(new ProgramaDTO(1,"Ingeniería de Sistemas"));
	            programas.add(new ProgramaDTO(2,"Ingeniería Industrial"));
	            programas.add(new ProgramaDTO(3,"Matemática"));
	            programas.add(new ProgramaDTO(4,"Administración de empresas"));
	            programas.add(new ProgramaDTO(5,"Derecho"));
	            programas.add(new ProgramaDTO(6,"Ingeniería Temática"));
	        }
	}

    static public List<ProgramaDTO> obtenerProgramasOfertados() {
        return programas;
    }

}
