package com.alice.crm.commons.kafka;

import com.alice.crm.commons.kafka.entity.Message;
import com.alice.crm.utils.GetTimeUUID;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
@Slf4j
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final Gson gson = new GsonBuilder().create();

    /**
     * 发送消息的方法
     */
    public void send() {
        Message message = new Message();
        message.setId(Long.valueOf(GetTimeUUID.getGuid()));
        message.setMsg(UUID.randomUUID().toString());
        message.setSendTime(new Date());
        log.info("com.alice.crm.commons.kafka.KafkaSender.send");
        kafkaTemplate.send("message", gson.toJson(message));

    }
}
