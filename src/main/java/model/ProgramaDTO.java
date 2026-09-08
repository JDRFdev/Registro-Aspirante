package model;

public class ProgramaDTO {
 private int id;
 private String nombre;
 
 public ProgramaDTO() {
 }
 
 public ProgramaDTO(int id,String nombre) {
	this.nombre = nombre;
	this.id=id;
}

 public String getNombre() {
	return nombre;
 }

 public void setNombre(String nombre) {
	this.nombre = nombre;
 }

 public int getId() {
	return id;
 }

 public void setId(int id) {
	this.id = id;
 }
 
}
