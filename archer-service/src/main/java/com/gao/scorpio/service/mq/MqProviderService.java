package com.gao.scorpio.service.mq;


/**
 * @description
 * @author: gaobh
 * @date: 2018/4/26 14:23
 * @version: v1.0
 */
public interface MqProviderService {
    /**
     * 生产者发送消息
     * @param key
     * @param obj
     */
    void sendData(String key, Object obj);

}
