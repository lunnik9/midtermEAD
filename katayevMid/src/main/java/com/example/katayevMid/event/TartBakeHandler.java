package com.example.katayevMid.event;

import com.example.katayevMid.goods.CakeShowcase;
import com.example.katayevMid.goods.TartShowcase;
import org.springframework.context.ApplicationListener;

public class TartBakeHandler implements ApplicationListener<TartBakeEvent> {
    @Override
    public void onApplicationEvent(TartBakeEvent tartBakeEvent) {
        TartShowcase ts=tartBakeEvent.getTs();
        for(int i=0;i<tartBakeEvent.getTarts().size();i++){
            if (tartBakeEvent.getTarts().get(i).isBurned()){
                continue;
            }
            ts.add(tartBakeEvent.getTarts().get(i));
        }
        tartBakeEvent.setTs(ts);
    }
}
