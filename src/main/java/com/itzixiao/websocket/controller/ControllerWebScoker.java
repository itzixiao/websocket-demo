package com.itzixiao.websocket.controller;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述:WebSocket
 * @author  zixiao
 * @date  2022-05-01 20:00:00
 */
@Controller
public class ControllerWebScoker {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/websocket/{name}")
    public String webSocket(@PathVariable String name,Model model){
        try{
            logger.info("跳转到websocket的页面上");
            model.addAttribute("username",name);
            return "index";
        }
        catch (Exception e){
            logger.info("跳转到websocket的页面上发生异常，异常信息是："+e.getMessage());
            return "error";
        }
    }
}