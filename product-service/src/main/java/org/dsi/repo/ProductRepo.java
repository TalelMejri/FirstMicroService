package org.dsi.repo;

import org.dsi.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<product,Long> {
 
}
