package com.example.spring_telegram_bot.objectconverters;

import com.example.spring_telegram_bot.model.Word;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import javax.annotation.Nullable;

public class WordToBytesConverter implements Converter<Word, byte[]> {
    private final Jackson2JsonRedisSerializer<Word> serializer;

    public WordToBytesConverter() {
        serializer = new Jackson2JsonRedisSerializer<>(Word.class);
    }

    @Override
    public byte[] convert(@Nullable Word value) {
        return serializer.serialize(value);
    }
}
