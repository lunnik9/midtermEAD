package com.example.katayevMid.entity;

import com.example.katayevMid.exceptions.CakeTartException;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class TartShowcase extends Showcase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @OneToMany(mappedBy = "cake_name", fetch = FetchType.LAZY)
    List<Tart> tarts = new ArrayList<>();

    @Override
    public void add(Product product) throws CakeTartException {
        if (product.getClass() != Cake.class) {
            throw new CakeTartException("product is not a cake");
        }
        tarts.add((Tart) product);
    }
}
