package hello;

@Path("/hello")
public class HelloService {
@GET
@Path({"/msg"})
public Response getMsg(@PathParam("msg") String msg) {  
    String output = "Jersey say : " + msg;  
    return Response.status(200).entity(output).build();  
}  
}
