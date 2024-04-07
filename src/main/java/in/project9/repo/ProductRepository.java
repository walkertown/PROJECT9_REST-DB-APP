package in.project9.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.project9.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}