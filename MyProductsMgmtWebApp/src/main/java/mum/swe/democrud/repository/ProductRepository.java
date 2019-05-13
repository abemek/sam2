package mum.swe.democrud.repository;


import mum.swe.democrud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("productrepository")
public interface ProductRepository extends JpaRepository<Product,Long> {
}
