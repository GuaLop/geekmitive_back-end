package org.com.proyecto.geekmitive.repository;

import org.com.proyecto.geekmitive.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
