package hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("msg")
public class HelloService {

	public HelloService() {
		System.out.println("Success");
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/printmessage")
	public String printMsg() 
	{
		String output = "My first program";
		return output;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/printyourmessage/{msg}")
	public String getMsg(@PathParam("msg") String msg) 
	{
		String output = "My written message provided in link : " + msg;
		return output;
	}
}
