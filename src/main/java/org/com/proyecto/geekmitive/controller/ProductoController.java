package org.com.proyecto.geekmitive.controller;

import org.com.proyecto.geekmitive.entity.Producto;
import org.com.proyecto.geekmitive.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/geekmitive")
public class ProductoController {

    @Autowired
    ProductoRepository productoRepository;

    @CrossOrigin(maxAge = 3600)
    @GetMapping("/productos/getAll")
    public List<Producto> getAllProductos(){
        return productoRepository.findAll();
    }

    @GetMapping("/productos/getById/{id}")
    public Optional<Producto> getProductoById(@PathVariable Long id){
        return productoRepository.findById(id);
    }

    @PostMapping("/productos/saveProductos")
    public ResponseEntity<Void> saveProductos (@RequestBody List<Producto> productos){
        productoRepository.saveAll(productos);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
