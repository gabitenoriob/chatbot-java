package com.chatbotjava.domain.ports;

import com.chatbotjava.domain.models.Champions;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {
    List<Champions> findAll();
    Optional<Champions> findById(Long id);
}
