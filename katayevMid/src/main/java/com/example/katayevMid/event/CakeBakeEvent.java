package com.example.katayevMid.event;

import com.example.katayevMid.entity.Cake;
import com.example.katayevMid.entity.CakeShowcase;
import com.example.katayevMid.entity.Tart;
import com.example.katayevMid.entity.TartShowcase;
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
