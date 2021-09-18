package com.planosaude.planosaudesys.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.planosaude.planosaudesys.entidades.Pessoa;

public interface PessoaRepositorio extends JpaRepository<Pessoa, Long>{
	
	

}
