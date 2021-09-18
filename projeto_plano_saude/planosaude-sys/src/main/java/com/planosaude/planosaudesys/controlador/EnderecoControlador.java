package com.planosaude.planosaudesys.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planosaude.planosaudesys.servico.EnderecoServico;

import com.planosaude.planosaudesys.entidades.Endereco;

@RestController
@RequestMapping("/endereco")
public class EnderecoControlador {
	
	@Autowired
	private EnderecoServico enderecoServico;
	
	@GetMapping
	public List<Endereco> listarTodas(){
		
		return enderecoServico.listarTodos();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Endereco>> buscarPorId(@PathVariable(name = "id") Long id){
		
		Optional<Endereco> endereco = enderecoServico.buscarPorId(id);
		
		return endereco.isPresent() ? ResponseEntity.ok(endereco) : ResponseEntity.notFound().build(); 
	}

}
