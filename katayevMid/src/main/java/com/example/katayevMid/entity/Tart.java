package com.example.katayevMid.entity;

import com.example.katayevMid.db.MyConnection;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

@Entity
@Getter
@Setter
public class Tart implements Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;
    private int timeToBake;
    private int price;
    private boolean isBurned;

    private boolean burn(int price) {

        while (price > 500) {
            price -= 500;
            int rand=(int)Math.random()*1000;
            if (rand>800){
                this.isBurned=true;
                return true;
            }
        }
        this.isBurned=false;
        return false;
    }

    private Tart(String name, int timeToBake, int price) {
        this.name = name;
        this.timeToBake = timeToBake;
        this.price = price;
    }

    public boolean isBurned(){
        return isBurned;
    }

    @Override
    public Product bake(String name) throws InterruptedException, SQLException {
        MyConnection con = new MyConnection("localhost:5432");
        ResultSet res = con.GetSmth("SELECT price,time_to_bake FROM cakes where name=" + name);

        int ttb = res.getInt("time_to_bake");
        int price = res.getInt("price");

        Thread.sleep(timeToBake);
        if (burn(price)){
            System.out.println("tart was burned");
            return null;
        }

        System.out.println("tart was prepared successfully");

        return new Tart(name, ttb, price);
    }

    @Override
    public Product GetProduct() {
        return this;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cook_id", insertable = false)
    private Cook cook;
}
