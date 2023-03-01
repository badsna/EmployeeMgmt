package com.example.employeemgmt.controller;


import com.example.employeemgmt.model.Teacher;
import com.example.employeemgmt.pojo.teacher.TeacherDetailRequestPojo;
import com.example.employeemgmt.service.teacherservice.TeacherServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/teacher")
@Validated
public class TeacherController {
private final TeacherServiceImpl teacherServiceImpl;

@Autowired
    public TeacherController(TeacherServiceImpl teacherServiceImpl) {
        this.teacherServiceImpl = teacherServiceImpl;
    }

    @GetMapping
    public List<Teacher> getTeacher(){
        return teacherServiceImpl.getTeachers();
    }

    @GetMapping("{teacherId}")
    public Optional<Teacher> getTeacherById(@PathVariable("TeacherId") Long teacher_id){
    return  teacherServiceImpl.getTeacherById(teacher_id);
    }

    @PostMapping
    public void saveTeacherDetails(@RequestBody TeacherDetailRequestPojo teacherDetailRequestPojo){
    teacherServiceImpl.saveTeacherDetails(teacherDetailRequestPojo);
    }
}
