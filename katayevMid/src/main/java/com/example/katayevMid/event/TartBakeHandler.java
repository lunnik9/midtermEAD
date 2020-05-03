package com.example.katayevMid.event;

import com.example.katayevMid.entity.CakeShowcase;
import com.example.katayevMid.entity.TartShowcase;
import com.example.katayevMid.exceptions.CakeTartException;
import org.springframework.context.ApplicationListener;

public class TartBakeHandler implements ApplicationListener<TartBakeEvent> {
    @Override
    public void onApplicationEvent(TartBakeEvent tartBakeEvent) {
        TartShowcase ts=tartBakeEvent.getTs();
        for(int i=0;i<tartBakeEvent.getTarts().size();i++) {
            if (tartBakeEvent.getTarts().get(i).isBurned()) {
                continue;
            }
            try {
                ts.add(tartBakeEvent.getTarts().get(i));
            } catch (CakeTartException e) {
                e.printStackTrace();
            }
        }
        tartBakeEvent.setTs(ts);
    }
}
