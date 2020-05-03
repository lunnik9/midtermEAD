package com.example.katayevMid.entity;

import com.example.katayevMid.exceptions.CakeTartException;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.TypeMismatchException;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class CakeShowcase extends Showcase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @OneToMany(mappedBy = "cake_name", fetch = FetchType.LAZY)
    List<Cake> cakes = new ArrayList<>();

    @Override
    public void add(Product product) throws CakeTartException {
        if (product.getClass() != Cake.class) {
            throw new CakeTartException("product is not a cake");
        }
        cakes.add((Cake) product);
    }
}
