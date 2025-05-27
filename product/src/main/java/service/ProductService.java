package service;

import requestDTO.ProductRequestDTO;

public interface ProductService {
    void addProduct(ProductRequestDTO prd);

    ProductRequestDTO getProductById(int id);
}
