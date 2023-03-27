package com.example.demo.repository;

import com.example.demo.entity.KnowledgeEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface KnowledgeRepository extends JpaRepository<KnowledgeEntity, Integer> {
}

