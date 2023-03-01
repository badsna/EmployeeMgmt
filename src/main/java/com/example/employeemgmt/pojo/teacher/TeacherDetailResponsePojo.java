package com.example.employeemgmt.pojo.teacher;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Service
public class TeacherDetailResponsePojo {
    private Long teacher_id;
    private String teacher_name;
    private LocalDate dob;
    private Long phone;
    private String email;
    private String address;
}
 //hello k hudaxa yetso yo
