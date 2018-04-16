package fr.vls.service;

import fr.vls.model.EmployeeInfo;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@FeignClient(name = "EmployeeSearch")
@RibbonClient(name = "EmployeeSearch") //client side load balancer
public interface EmployeeServiceProxy {

    @RequestMapping("/employee/find/{id}")
    EmployeeInfo findById(@PathVariable(value = "id") Long id);

    @RequestMapping("/employee/findall")
    Collection<EmployeeInfo> findAll();

}
