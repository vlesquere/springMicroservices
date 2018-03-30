package fr.vls.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import fr.vls.model.EmployeeInfo;
import fr.vls.service.EmployeeServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RefreshScope
@RestController
public class EmployeeInfoController {

    @Autowired
    EmployeeServiceProxy proxyService;

    @HystrixCommand(fallbackMethod = "emergency")
    @RequestMapping("/dashboard/feign/{myself}")
    public EmployeeInfo findme(@PathVariable Long myself) {
        return proxyService.findById(myself);
    }

    @RequestMapping("/dashboard/feign/peers")
    public Collection<EmployeeInfo> findPeers() {
        return proxyService.findAll();
    }

    public EmployeeInfo emergency(Long myself) {
        EmployeeInfo infos = new EmployeeInfo();
        infos.setEmployeeId(9999l);
        infos.setName("Doe");
        infos.setDesignation("in case of emergency");
        return infos;
    }
}
