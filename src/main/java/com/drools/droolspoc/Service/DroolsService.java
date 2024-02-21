package com.drools.droolspoc.Service;

import com.drools.droolspoc.Model.OrderDiscount;
import com.drools.droolspoc.Model.OrderRequest;

public interface DroolsService {
    
    OrderDiscount getOrderDiscount(OrderRequest orderRequest);
}
