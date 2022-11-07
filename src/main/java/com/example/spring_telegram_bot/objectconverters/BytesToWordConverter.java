package com.example.spring_telegram_bot.objectconverters;

import com.example.spring_telegram_bot.model.Word;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import javax.annotation.Nullable;

public class BytesToWordConverter implements Converter<byte[], Word> {
    private final Jackson2JsonRedisSerializer<Word> serializer;

    public BytesToWordConverter() {
        this.serializer = new Jackson2JsonRedisSerializer<>(Word.class);
    }

    @Override
    public Word convert(@Nullable byte[] value) {
        return serializer.deserialize(value);
    }
}
