package com.planosaude.planosaudesys.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planosaude.planosaudesys.servico.PessoaServico;


import com.planosaude.planosaudesys.entidades.Pessoa;

@RestController
@RequestMapping("/pessoa")
public class PessoaControlador {
	
	@Autowired
	private PessoaServico pessoaServico;
	
	@GetMapping
	public List<Pessoa> listarTodas(){
		
		return pessoaServico.listarTodos();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Pessoa>> buscarPorId(@PathVariable(name = "id") Long id){
		
		Optional<Pessoa> pessoa = pessoaServico.buscarPorId(id);
		
		return pessoa.isPresent() ? ResponseEntity.ok(pessoa) : ResponseEntity.notFound().build(); 
	}

}
