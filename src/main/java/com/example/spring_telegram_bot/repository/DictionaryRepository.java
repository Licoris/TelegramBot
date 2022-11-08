package com.example.spring_telegram_bot.repository;

import com.example.spring_telegram_bot.model.Dictionary;
import org.springframework.data.repository.CrudRepository;

public interface DictionaryRepository extends CrudRepository<Dictionary, String> {
}
