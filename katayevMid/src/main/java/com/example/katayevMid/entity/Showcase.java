package com.example.katayevMid.entity;

import com.example.katayevMid.exceptions.CakeTartException;

import java.util.ArrayList;
import java.util.List;

public abstract class Showcase {

    public abstract void add(Product product) throws CakeTartException;
}
