package com.drools.droolspoc.ServiceImpl;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drools.droolspoc.Model.OrderDiscount;
import com.drools.droolspoc.Model.OrderRequest;
import com.drools.droolspoc.Model.RateRequest;
import com.drools.droolspoc.Service.DroolsService;

@Service
public class DroolsServiceImpl implements DroolsService{

    @Autowired
    private KieContainer kieContainer;

    @Override
    public OrderDiscount getOrderDiscount(OrderRequest orderRequest) {
        OrderDiscount orderDiscount = new OrderDiscount();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("orderDiscount", orderDiscount);
        kieSession.insert(orderRequest);
        kieSession.fireAllRules();
        kieSession.dispose();
        return orderDiscount;
    }

    @Override
    public String getInterestRate(RateRequest rateRequest) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(rateRequest);
        kieSession.fireAllRules();
        kieSession.dispose();
        System.out.println(rateRequest.toString());
        return "The interest rate for this application is " + rateRequest.getInterestRate();
    }
}