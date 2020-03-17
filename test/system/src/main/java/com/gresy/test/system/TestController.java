package com.gresy.test.system;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/port")
    public Map<String, String> test(HttpServletRequest request) {
        Map<String, String> map = new HashMap();
        System.out.println(">>>>>>>>>>> port:" + request.getServerPort());
        map.put("result", "success");
        map.put("port", request.getServerPort() + "");
        return map;
    }
}
