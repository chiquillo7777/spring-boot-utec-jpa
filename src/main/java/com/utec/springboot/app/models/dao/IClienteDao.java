package com.utec.springboot.app.models.dao;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.utec.springboot.app.models.entity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{
	
	
}
	