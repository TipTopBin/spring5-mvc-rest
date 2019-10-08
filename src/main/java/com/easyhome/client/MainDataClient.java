package com.easyhome.client;

import com.easyhome.client.model.UserData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "maindata")
public interface MainDataClient {
    @RequestMapping("/test/user")
    UserData getUser();
}
