package com.unionman.springbootsecurityauth2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Rong.Jia
 * @description: server 配置
 * @date 2019/02/19 15:24:22
 */
@Component
public class ServerConfig implements ApplicationListener<WebServerInitializedEvent> {

    @Value("${server.host}")
    private String ip;

    private int serverPort;

    public String getUrl() {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "http://" + ip + ":" + this.serverPort;
    }

    public int getPort() {
        return this.serverPort;
    }

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        this.serverPort = event.getWebServer().getPort();
    }

}
