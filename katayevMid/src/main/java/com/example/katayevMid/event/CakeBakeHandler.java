package com.example.katayevMid.event;

import com.example.katayevMid.goods.CakeShowcase;
import org.springframework.context.ApplicationListener;

public class CakeBakeHandler implements ApplicationListener<CakeBakeEvent> {
    @Override
    public void onApplicationEvent(CakeBakeEvent cakeBakeEvent) {
        CakeShowcase cs=cakeBakeEvent.getCs();
        for(int i=0;i<cakeBakeEvent.getCakes().size();i++){
            cs.add(cakeBakeEvent.getCakes().get(i));
        }
        cakeBakeEvent.setCs(cs);
    }

}
