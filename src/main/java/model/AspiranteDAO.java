package model;
import java.util.List;
import java.util.ArrayList;
public class AspiranteDAO {
	private static List<AspiranteDTO> listaAspirantes = new ArrayList<>();

    public AspiranteDAO() {}


    public void registrarAspirante(AspiranteDTO aspirante) {
        listaAspirantes.add(aspirante);
    }

    static public List<AspiranteDTO> obtenerTodos() {
        return listaAspirantes;
    }

}
