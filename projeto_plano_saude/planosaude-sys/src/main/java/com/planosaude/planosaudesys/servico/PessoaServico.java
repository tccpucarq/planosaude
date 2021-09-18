package com.planosaude.planosaudesys.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planosaude.planosaudesys.entidades.Pessoa;
import com.planosaude.planosaudesys.repositorio.PessoaRepositorio;

@Service
public class PessoaServico {
	
	@Autowired
	private PessoaRepositorio pessoaRepositorio;
	
	public List<Pessoa> listarTodos(){
		return pessoaRepositorio.findAll();
	}
	
	public Optional<Pessoa> buscarPorId(Long id){
		
		return pessoaRepositorio.findById(id);
	}

}
