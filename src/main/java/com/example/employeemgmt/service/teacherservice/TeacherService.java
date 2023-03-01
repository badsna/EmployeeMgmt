package com.example.employeemgmt.service.teacherservice;

import com.example.employeemgmt.model.Teacher;
import com.example.employeemgmt.pojo.teacher.TeacherDetailRequestPojo;

import java.util.List;
import java.util.Optional;

public interface TeacherService {
List<Teacher> getTeachers();
    public Optional<Teacher> getTeacherById(Long teacher_id);
    public void saveTeacherDetails(TeacherDetailRequestPojo teacherDetailRequestPojo);
}
