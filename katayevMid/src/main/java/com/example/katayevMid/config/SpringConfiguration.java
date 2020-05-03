package com.example.katayevMid.config;

import com.example.katayevMid.entity.Cake;
import com.example.katayevMid.entity.Tart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Configuration

public class SpringConfiguration {
    @Bean
    public List<Tart> tarts() throws SQLException, InterruptedException {
        List<Tart> res = new ArrayList<>();
        Tart temp = null;
        res.add((Tart) temp.bake("napoleon"));
        res.add((Tart) temp.bake("cheasecake"));
        res.add((Tart) temp.bake("redbarhat"));
        res.add((Tart) temp.bake("medovik"));
        return res;
    }

    @Bean
    public List<Cake> cakes() throws SQLException, InterruptedException {
        List<Cake> res = new ArrayList<>();
        Cake temp = null;
        res.add((Cake) temp.bake("kartoshka"));
        res.add((Cake) temp.bake("maffin"));
        return res;
    }
}
