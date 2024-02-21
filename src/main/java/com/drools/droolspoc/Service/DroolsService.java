package com.drools.droolspoc.Service;

import com.drools.droolspoc.Model.OrderDiscount;
import com.drools.droolspoc.Model.OrderRequest;
import com.drools.droolspoc.Model.RateRequest;

public interface DroolsService {
    
    OrderDiscount getOrderDiscount(OrderRequest orderRequest);

    String getInterestRate(RateRequest rateRequest);
}