package com.yufan.testRedis;

import com.alibaba.fastjson.JSONObject;
import com.yufan.utils.Constants;
import org.apache.log4j.Logger;

import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: lirf
 * @time: 2021/5/11
 */
public class ClearRedis {

    private Logger LOG = Logger.getLogger(ClearRedis.class);

    private static volatile ClearRedis clearRedis;

    private ClearRedis() {

    }

    public static ClearRedis getInstance() {
        if (null == clearRedis) {
            synchronized (ClearRedis.class) {
                if (null == clearRedis) {
                    clearRedis = new ClearRedis();
                }
            }
        }
        return clearRedis;
    }

    public void clearRedisMinutes() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                startClearRedisMap();
            }
        }, 1, 5, TimeUnit.MINUTES);//TimeUnit.MINUTES 分
    }

    /**
     * 清楚已过期的数据
     */
    private void startClearRedisMap() {
        LOG.info("------------startClearRedisMap-----------");
        long nowTime = System.currentTimeMillis();//分钟
        Map<String, JSONObject> loginMapsToken = LoginCache.loginMapsToken;
        initMap(loginMapsToken, nowTime);
        Map<String, JSONObject> loginMapsUserId = LoginCache.loginMapsUserId;
        initMap(loginMapsUserId, nowTime);
    }

    private void initMap(Map<String, JSONObject> maps, long nowTime) {
        for (Map.Entry<String, JSONObject> map : maps.entrySet()) {
            String key = map.getKey();
            JSONObject value = map.getValue();
            long passTime = value.getLongValue("tokenPassTime");
            if (Constants.LOGIN_TOKEN_PASS_TIME - ((nowTime - passTime) / 1000 / 60) < 0) {
                // 已过期
                LoginCache.loginMapsToken.remove(key);
                LOG.info("-------remove-----key=" + key);
            }
        }
    }
}
