package com.example.spring_telegram_bot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("word")
public class Word {

    @Id
    private String word;

    private Set<String> mistakes;
}
