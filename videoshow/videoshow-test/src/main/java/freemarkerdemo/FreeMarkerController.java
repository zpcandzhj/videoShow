package freemarkerdemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@SpringBootApplication
@Configuration//可以忽略此注解@SpringBootApplication已经包含
@ComponentScan(basePackages = "freemarkerdemo") //配置扫描包
public class FreeMarkerController {

    @RequestMapping("/helloFreemarker")
    public String helloFreemarker(Map<String, Object> result) {
        System.out.println("freemarker Controller");
        result.put("name", "周鹏程");
        result.put("sex", 1);
        List<String> userlist = new ArrayList<>();
        userlist.add("刘阳");
        userlist.add("衡俊");
        userlist.add("徐涛");
        result.put("userList",userlist);
        return "free";
    }

    public static void main(String[] args) {
        SpringApplication.run(FreeMarkerController.class, args);
    }
}
