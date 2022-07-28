package tran.business.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pk")
    private long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "inventory")
    private int inventory;
    @Column(name = "cost")
    private double cost;
}
