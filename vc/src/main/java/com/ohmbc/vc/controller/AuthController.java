package com.ohmbc.vc.controller;


import javax.ws.rs.*;
import javax.ws.rs.core.*;


@Path("/v2")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AuthController {

	
	
	@GET
	public Response authenticate(@HeaderParam("authorization") String token) {
		return Response.ok("token="+token).build();
	}
}







/*public class ClienteRest {
    
    private final String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkYXZpZGJyaW9uZXMifQ.74o-HxtdCtSv4HD6ADn7TgLv2qUDdESR5J_kk8FdGTo43psguoL6Pi37ktuPlJSrRXhkUFIQvxaN0pX4cLvsww";
    
    @GetMapping("/all")
    public ModelAndView devolvertodos(){
        ModelAndView mav = new ModelAndView("template");
        
        RestTemplate rest = new RestTemplate();
        
        HttpHeaders headers = new HttpHeaders();
        
        headers.add("Authorization", token);
        
        HttpEntity entity = new HttpEntity(headers);
        
        ResponseEntity<Nota[]> notasEntity = rest.exchange("http://localhost:8090/v1/notas",HttpMethod.GET,entity, Nota[].class);
        
        Nota[] notas = notasEntity.getBody();
        
        mav.addObject("notas",notas);
        return mav;
    }
    
}*/