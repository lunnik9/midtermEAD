package com.example.katayevMid.entity;

import java.sql.SQLException;

public interface Product {
    Product bake(String name) throws InterruptedException, SQLException;
    Product GetProduct();
}
