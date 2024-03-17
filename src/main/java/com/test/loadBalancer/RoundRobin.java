package com.test.loadBalancer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RoundRobin implements LoadBalance {
    @Override
    public String getServer(String clientIp) {
        if (null == clientIp) {
            return "";
        }
        Set<String> servers = IpPool.ipMap.keySet();
        List<String> serverList = new ArrayList<>(servers);
        return serverList.get(Integer.parseInt(clientIp) % serverList.size());
    }
}
