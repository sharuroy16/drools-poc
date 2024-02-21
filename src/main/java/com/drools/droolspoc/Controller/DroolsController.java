package com.drools.droolspoc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drools.droolspoc.Model.OrderDiscount;
import com.drools.droolspoc.Model.OrderRequest;
import com.drools.droolspoc.Model.RateRequest;
import com.drools.droolspoc.Service.DroolsService;

@RestController
@RequestMapping("api/v1/drools")
public class DroolsController {
    
    @Autowired
    private DroolsService droolsService;

    @PostMapping(path = "/getOrderDiscount")
    public OrderDiscount getOrderDiscount(@RequestBody OrderRequest orderRequest){
        return droolsService.getOrderDiscount(orderRequest);
    }
}
