package entity;

import enums.ProductCategory;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    long productId;
    String ProductName;
    double price;
    int availableQuantity;
    @Enumerated(EnumType.STRING)
    ProductCategory category;

}
