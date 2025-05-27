package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    public String get() {
        return "hello";
    }

}
