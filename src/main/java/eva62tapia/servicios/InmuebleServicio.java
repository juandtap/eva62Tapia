package eva62tapia.servicios;

import java.util.List;

import eva62tapia.modelo.Inmueble;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import negocio.GestionInmuebles;

@Path("")
public class InmuebleServicio {
	@Inject
	GestionInmuebles gestionInmuebles;
	
	@GET
	@Path("inmuebles")
	@Produces("application/json")
	public List<Inmueble> getAll(){
		return gestionInmuebles.listar();
	}
	
	@POST
	@Path("nuevoinmueble")
	@Produces("application/json")
	@Consumes("application/json")
	public Response saveInmueble(Inmueble inmueble) {
		try {
			gestionInmuebles.guardarCategoria(inmueble);
			return Response.status(Response.Status.OK).entity(inmueble).build();
		} catch (Exception e) {
			System.out.println("error: "+e.getMessage());
			return null;
		}
	}
}
