package com.example.katayevMid.dao;

import com.example.katayevMid.config.SpringConfiguration;
import com.example.katayevMid.event.CakeBakeEvent;
import com.example.katayevMid.event.TartBakeEvent;
import com.example.katayevMid.goods.CakeShowcase;
import com.example.katayevMid.goods.Showcase;
import com.example.katayevMid.goods.TartShowcase;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class ShowcaseDao implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher pub;
    private SpringConfiguration confing;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.pub = applicationEventPublisher;
    }

    public void fillTarts(TartShowcase showcase) throws SQLException, InterruptedException {
        pub.publishEvent(new TartBakeEvent(this,showcase,this.confing.tarts()));
    }

    public void fillCakes(CakeShowcase showcase) throws SQLException, InterruptedException {
        pub.publishEvent(new CakeBakeEvent(this,showcase,this.confing.cakes()));
    }

}
