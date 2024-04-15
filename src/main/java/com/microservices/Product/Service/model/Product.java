package com.microservices.Product.Service.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Use AUTO instead of IDENTITY
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
}
