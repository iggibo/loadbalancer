package com.test.loadBalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoadBalancerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoadBalancerApplication.class, args);
        loadBalance();
    }

    private static void loadBalance() {
        doGetServer(new RoundRobin(), 20);
    }

    private static void doGetServer(LoadBalance loadBalance, int queryTimes) {
        for (int i = 0; i < queryTimes; i++) {
            String serverId = loadBalance.getServer(String.valueOf(i));
            System.out.printf("[%s] index:%s,%s%n", loadBalance.getClass().getSimpleName(), i, serverId);
        }
    }
}
