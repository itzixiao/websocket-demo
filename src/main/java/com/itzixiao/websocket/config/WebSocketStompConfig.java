package com.itzixiao.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * 功能描述:websocket的配置
 * @author  zixiao
 * @date  2022-05-01 20:00:00
 */
@Configuration
public class WebSocketStompConfig{
    @Bean
    public ServerEndpointExporter serverEndpointExporter()
    {
        return new ServerEndpointExporter();
    }
}