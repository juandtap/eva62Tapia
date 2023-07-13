package negocio;



import java.util.List;

import eva62tapia.datos.InmuebleDAO;
import eva62tapia.modelo.Inmueble;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionInmuebles {
	
	@Inject
	private InmuebleDAO inmuebleDAO;
	
	public void guardarCategoria(Inmueble inmueble) throws Exception{
		if (inmueble.getNombre().equalsIgnoreCase("")) {
			throw new Exception("Nombre inmueble vacio !");
		} else {
			if (inmuebleDAO.getById(inmueble.getId()) == null) {
				// nuevo
				try {
					System.out.println("nuevo inmueble");
					this.inmuebleDAO.insert(inmueble);
				} catch (Exception e) {
					throw new Exception("Error al insertar: "+e.getMessage());
				}
				
				
			} else {
				// actualizar
				try {
					System.out.println("actualizar inmueble: "+inmueble.getId());
					inmuebleDAO.update(inmueble);
				} catch (Exception e) {
					throw new Exception("Error al actualizar: "+e.getMessage());
				}
			}
		}
		
		
	}
	
	public List<Inmueble> listar(){
		return this.inmuebleDAO.getAll();
	}

}
