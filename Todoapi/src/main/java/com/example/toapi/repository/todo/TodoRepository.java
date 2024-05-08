package com.example.toapi.repository.todo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface TodoRepository {

    //GET ひとつだけ
    @Select("SELECT * FROM TODOLIST WHERE id = #{id}")
    Optional<TodoRecord> select(long id);

    //POST
    @Options(useGeneratedKeys = true, keyProperty = "id")//idが自動で割り振られる
    @Insert("INSERT INTO TODOLIST (userId,title,status,details) VALUES (#{userId},#{title},#{status},#{details})")
    void insert(TodoRecord record);
}
