package com.example.spring_telegram_bot.model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@Getter
@Builder
@RedisHash("dictionary")
public class Dictionary {

    @Id
    private String id;

    private List<Word> wordList;
}
