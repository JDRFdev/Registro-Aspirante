package model;

public class AspiranteDTO extends PersonaDTO {

	    private ProgramaDTO programaInteres;
		public AspiranteDTO() {}
		
		
		public AspiranteDTO(String identificacion, String nombres, String apellidos, String correo, String telefono,int id_programa,String programaInteres) {
			super(identificacion,  nombres,  apellidos,  correo,  telefono);
			this.programaInteres = new ProgramaDTO(id_programa,programaInteres);
		}


		public ProgramaDTO getProgramaInteres() {
			return programaInteres;
		}


		public void setProgramaInteres(ProgramaDTO programaInteres) {
			this.programaInteres = programaInteres;
		}
	
		
}
		
