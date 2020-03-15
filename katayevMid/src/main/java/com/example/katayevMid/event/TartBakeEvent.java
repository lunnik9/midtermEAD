package com.example.katayevMid.event;

import com.example.katayevMid.goods.Tart;
import com.example.katayevMid.goods.TartShowcase;
import org.springframework.context.ApplicationEvent;

import java.util.List;

public class TartBakeEvent extends ApplicationEvent {
    private TartShowcase ts;
    private List<Tart> tarts;

    public TartShowcase getTs() {
        return ts;
    }

    public List<Tart> getTarts() {
        return tarts;
    }

    public TartBakeEvent(Object source, TartShowcase ts, List<Tart> tarts) {
        super(source);
        this.tarts=tarts;
        this.ts=ts;
    }

    public void setTs(TartShowcase ts) {
        this.ts = ts;
    }
}
