package com.jealcode.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.jealcode.app.models.entity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{


}
