package org.nsrfarms.repository;

import org.nsrfarms.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
