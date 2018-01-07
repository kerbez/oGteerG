package com.example.pro.controller;

import com.example.pro.mapper.WordMapper;
import com.example.pro.model.Word;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/word")
public class WordResource {

    private WordMapper wordMapper;

    public WordResource(WordMapper wordMapper) {
        this.wordMapper = wordMapper;
    }

    @GetMapping("/all")
    public List<Word> getAll(){
        return wordMapper.findAll();
    }
/*
    @GetMapping("/update")
    private List<Word> update() {

        Word word = new Word();
        word.setWord("");

        wordMapper.insert(word);

        return wordMapper.findAll();
    }*/
}
