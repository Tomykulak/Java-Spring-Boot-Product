package tomykulak.services.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tomykulak.services.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
