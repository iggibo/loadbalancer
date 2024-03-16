package com.test.loadBalancer;

public interface LoadBalance {
    String getServer(String clientIp);
}
