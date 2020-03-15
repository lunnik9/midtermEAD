package com.example.katayevMid.goods;

import java.util.ArrayList;
import java.util.List;

public class CakeShowcase extends Showcase {
    List<Cake> cakes = new ArrayList<>();

    @Override
    public void add(Product product) {
        cakes.add((Cake) product);
    }
}
