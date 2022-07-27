package tran.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tran.business.models.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {

}
