package com.example.katayevMid.entity;

import io.swagger.annotations.ApiOperation;

import java.sql.SQLException;

public interface Product {
    @ApiOperation(value = "replaces constructor")
    Product bake(String name) throws InterruptedException, SQLException;

    Product GetProduct();
}
