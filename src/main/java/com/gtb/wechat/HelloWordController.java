package com.gtb.wechat;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Log
@Controller
public class HelloWordController {


    @Value("${WECHAT_ACTIVITY_VISIT_COUNT}")
    private Integer WECHAT_ACTIVITY_VISIT_COUNT;

    @RequestMapping("/hello")
    @ResponseBody
    public Integer showAccessTimes() {
        log.info("showAccessTimes:" + WECHAT_ACTIVITY_VISIT_COUNT);

        return WECHAT_ACTIVITY_VISIT_COUNT;
    }



}