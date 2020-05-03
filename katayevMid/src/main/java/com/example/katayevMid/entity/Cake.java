package com.example.katayevMid.entity;

import com.example.katayevMid.db.MyConnection;
import lombok.Getter;
import lombok.Setter;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.persistence.*;

@Entity
@Getter
@Setter
public class Cake implements Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;


    private String name;
    private int timeToBake;
    private int price;

    private Cake(String name, int timeToBake, int price) {
        this.name = name;
        this.timeToBake = timeToBake;
        this.price = price;
    }

    @Override
    public Product bake(String name) throws InterruptedException, SQLException {
        MyConnection con = new MyConnection("localhost:5432");
        ResultSet res = con.GetSmth("SELECT price,time_to_bake FROM cakes where name=" + name);

        int ttb = res.getInt("time_to_bake");
        int price = res.getInt("price");

        Thread.sleep(timeToBake);

        System.out.println("cake was prepared successfully");


        return new Cake(name, ttb, price);
    }

    @Override
    public Product GetProduct() {
        return this;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cook_id", insertable = false)
    private Cook cook;
}
