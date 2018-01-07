package com.example.pro.mapper;

import com.example.pro.model.Word;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface WordMapper {

    @Select("select * from words")
    List<Word> findAll();


    @Insert("insert into words(word) values(#{word})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
            before = false, resultType = Integer.class)
    void insert(Word word);
}
