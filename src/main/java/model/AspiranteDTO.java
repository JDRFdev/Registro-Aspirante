package model;

public class AspiranteDTO {
		private String identificacion;
	    private String nombres;
	    private String apellidos;
	    private String correo;
	    private String telefono;
	    private String programaInteres;
		public AspiranteDTO() {}
		public AspiranteDTO(String identificacion, String nombres, String apellidos, String correo, String telefono,String programaInteres) {
			this.identificacion = identificacion;
			this.nombres = nombres;
			this.apellidos = apellidos;
			this.correo = correo;
			this.telefono = telefono;
			this.programaInteres = programaInteres;
		}
		public String getIdentificacion() {
			return identificacion;
		}
		public void setIdentificacion(String identificacion) {
			this.identificacion = identificacion;
		}
		public String getNombres() {
			return nombres;
		}
		public void setNombres(String nombres) {
			this.nombres = nombres;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getProgramaInteres() {
			return programaInteres;
		}
		public void setProgramaInteres(String programaInteres) {
			this.programaInteres = programaInteres;
		}
	    
}
