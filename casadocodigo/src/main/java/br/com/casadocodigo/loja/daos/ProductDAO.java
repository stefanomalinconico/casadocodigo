package br.com.casadocodigo.loja.daos;

import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.casadocodigo.loja.models.Product;

@Repository
public class ProductDAO {
	
	@PersistenceContext
	private EntityManager manager;

	public void save(Product product) {
		manager.persist(product); gjhghg 
	}m.,mm, lkjlkjk
}