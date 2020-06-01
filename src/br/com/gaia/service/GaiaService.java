package br.com.gaia.service;

import java.util.List;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import br.com.gaia.model.Gaia;

public class GaiaService {
	
	private static WebTarget resource = ClientBuilder.newBuilder().build().target("https://gaia-discover-api.herokuapp.com/api/locations/discover/local");
	
	public List<Gaia> getGaia(String address, String local) {
		return resource.queryParam("address", address).queryParam("local", local).request(MediaType.APPLICATION_JSON).get(new GenericType<List<Gaia>>() {});
	}

}