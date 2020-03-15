package com.example.katayevMid.event;

import com.example.katayevMid.goods.Cake;
import com.example.katayevMid.goods.CakeShowcase;
import com.example.katayevMid.goods.Tart;
import com.example.katayevMid.goods.TartShowcase;
import org.springframework.context.ApplicationEvent;

import java.util.List;

public class CakeBakeEvent extends ApplicationEvent {

    private CakeShowcase cs;
    private List<Cake> cakes;


    public CakeBakeEvent(Object source, CakeShowcase cs, List<Cake> cakes) {
        super(source);
        this.cakes=cakes;
        this.cs=cs;
    }

    public void setCs(CakeShowcase cs) {
        this.cs = cs;
    }

    public CakeShowcase getCs() {
        return cs;
    }

    public List<Cake> getCakes() {
        return cakes;
    }
}
