package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import requestDTO.ProductRequestDTO;
import service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;


    @PostMapping("/add")
    public ResponseEntity addProduct(@RequestBody ProductRequestDTO prd) {
        productService.addProduct(prd);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/getProduct/{id}")
    public ResponseEntity getProductById( @PathVariable(name="id") int id) {
        productService.getProductById(id);
        return new ResponseEntity<>(HttpStatus.found);
    }

}
