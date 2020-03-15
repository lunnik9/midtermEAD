package com.example.katayevMid.goods;

import java.sql.SQLException;

public interface Product {
    Product bake(String name) throws InterruptedException, SQLException;
    Product GetProduct();
}
