package com.example.katayevMid.event;

import com.example.katayevMid.entity.CakeShowcase;
import com.example.katayevMid.exceptions.CakeTartException;
import org.springframework.context.ApplicationListener;

public class CakeBakeHandler implements ApplicationListener<CakeBakeEvent> {
    @Override
    public void onApplicationEvent(CakeBakeEvent cakeBakeEvent) {
        CakeShowcase cs=cakeBakeEvent.getCs();
        for(int i=0;i<cakeBakeEvent.getCakes().size();i++) {
            try {
                cs.add(cakeBakeEvent.getCakes().get(i));
            } catch (CakeTartException e) {
                e.printStackTrace();
            }
        }
        cakeBakeEvent.setCs(cs);
    }

}
