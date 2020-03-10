package pl.easybud.client.api;

import pl.easybud.client.dto.OrderDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

import static pl.easybud.client.api.ApiPaths.ORDERS;

@Path(ORDERS)
public interface OrdersResource {

  @GET
  @Path("/all")
  @Produces(MediaType.APPLICATION_JSON)
  List<OrderDTO> listOrders();
}
