package com.example.katayevMid.goods;

import java.util.ArrayList;
import java.util.List;

public class TartShowcase extends Showcase {

    List<Tart> tarts = new ArrayList<>();

    @Override
    public void add(Product product) {
        tarts.add((Tart) product);
    }
}
