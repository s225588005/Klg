package com.example.demo.controller;


import com.example.demo.entity.KnowledgeEntity;
import com.example.demo.formbean.knowledge;
import com.example.demo.repository.KnowledgeRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KnowledgeController {
    private final KnowledgeRepository knowledgeRepository;

    KnowledgeController(KnowledgeRepository knowledgeRepository) {
        this.knowledgeRepository = knowledgeRepository;
    }

    @GetMapping("/klg/create")
    List<knowledge> excuteBasicCreate(){

        KnowledgeEntity knowledgeEntity = new KnowledgeEntity();
        knowledgeEntity.setKlgName("klg" + RandomStringUtils.randomAlphabetic(4));
        knowledgeEntity.setKlgDescription("des" + RandomStringUtils.randomAlphabetic(4));
        knowledgeEntity.setHighlights("exp" + RandomStringUtils.randomAlphabetic(4));
        knowledgeEntity.setKlgCase("exa" + RandomStringUtils.randomAlphabetic(4));
        knowledgeEntity.setPreKlg("Pre" + RandomStringUtils.randomAlphabetic(4));
        knowledgeEntity.setTag("tag" + RandomStringUtils.randomAlphabetic(4));
        this.knowledgeRepository.save(knowledgeEntity);

        List<KnowledgeEntity> allKnowledge = this.knowledgeRepository.findAll();
        List<knowledge> knowledgeList = new ArrayList<>();
        allKnowledge.stream().forEach(item -> {
            knowledge q = new knowledge();
            BeanUtils.copyProperties(item, q);
            knowledgeList.add(q);
        });

        return knowledgeList;
    }

    @GetMapping("/klg/search/{id}")
    knowledge excuteBasicDelete(@PathVariable Integer id){
        KnowledgeEntity klgEntity = knowledgeRepository.getOne(id);
        knowledge klg = new knowledge();
        BeanUtils.copyProperties(klgEntity,klg);
        return klg;
    }

    @DeleteMapping("/klg/delete/{id}")
    List<knowledge> Delete(@PathVariable Integer id){
        KnowledgeEntity klgEntity = knowledgeRepository.getOne(id);
        knowledgeRepository.delete(klgEntity);

        List<KnowledgeEntity> allklg = this.knowledgeRepository.findAll();
        List<knowledge> knowledgeList = new ArrayList<>();
        allklg.stream().forEach(item -> {
            knowledge q = new knowledge();
            BeanUtils.copyProperties(item, q);
            knowledgeList.add(q);
        });
        return knowledgeList;
    }

}
