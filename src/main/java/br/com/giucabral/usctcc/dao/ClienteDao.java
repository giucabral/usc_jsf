package br.com.giucabral.usctcc.dao;

import java.util.List;

import br.com.giucabral.usctcc.model.Cliente;

public interface ClienteDao {

	void save(Cliente cliente);
    
    List<Cliente> findAll();
          
    Cliente findById(Integer id);
     
    void update(Cliente cliente);
	
}
