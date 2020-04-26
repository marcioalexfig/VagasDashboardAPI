package br.com.marcioalexfig.vagasdashboard.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import br.com.marcioalexfig.vagasdashboard.dto.CargoDTO;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping("/cargos")
	public List<CargoDTO> listarCargos(){
		//TODO - List<CargoDTO> cargos =
		return null;
	}
	
	@RequestMapping("/sites")
	public List<CargoDTO> listarSites(){
		//TODO - List<SiteDTO> sites =
		return null;
	}
	

}
