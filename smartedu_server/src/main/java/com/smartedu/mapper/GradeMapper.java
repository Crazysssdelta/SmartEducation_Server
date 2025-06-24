package com.smartedu.mapper;

import com.smartedu.entity.Grade;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GradeMapper {

    List<Grade> getAllGrades();


    Grade selectById(Long id);


}
