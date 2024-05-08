package com.example.toapi.repository.sample;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface SampleRepository {

    @Select("SELECT * FROM TODOLIST")
    SampleRecord select();

}
