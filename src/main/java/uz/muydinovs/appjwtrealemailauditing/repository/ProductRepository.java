package uz.muydinovs.appjwtrealemailauditing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.muydinovs.appjwtrealemailauditing.entity.Product;

import java.util.UUID;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product, UUID> {

}
