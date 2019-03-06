package cn.smileyan.movie.controller.common;

import cn.smileyan.movie.service.common.OaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class OaController {
    @Autowired
    private OaService oaService;

    @RequestMapping("/")
    private Map<String,String> hello(String oaId){
        Map<String,String> map = new HashMap<>(1);
        map.put("user",oaService.getById(oaId)+"");
        return map;
    }
}
