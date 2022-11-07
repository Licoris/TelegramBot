package com.example.spring_telegram_bot.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@FieldDefaults(makeFinal = true,level =  AccessLevel.PRIVATE)
@Getter
@Builder
@RedisHash("dictionary")
public class Dictionary {
    @Id
    String id;

    List<Word> wordList;
}
