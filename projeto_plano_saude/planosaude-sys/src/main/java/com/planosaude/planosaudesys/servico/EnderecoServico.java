package com.planosaude.planosaudesys.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planosaude.planosaudesys.entidades.Endereco;
import com.planosaude.planosaudesys.repositorio.EnderecoRepositorio;

@Service
public class EnderecoServico {
	
	@Autowired
	private EnderecoRepositorio enderecoRepositorio;
	
	public List<Endereco> listarTodos(){
		return enderecoRepositorio.findAll();
	}
	
	public Optional<Endereco> buscarPorId(Long id){
		
		return enderecoRepositorio.findById(id);
	}

}
