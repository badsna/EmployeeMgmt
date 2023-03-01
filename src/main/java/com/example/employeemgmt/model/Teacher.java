package com.example.employeemgmt.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "teacher", uniqueConstraints = {@UniqueConstraint(columnNames ="email",name="Unique_teacher_email" )})
public class Teacher {
    @Id
    @SequenceGenerator(name = "teacher_sequence",
            sequenceName = "teacher_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator ="teacher_sequence"
    )
    @Column(name = "teacher_id")
    private Long teacher_id;

    @Column(name = "teacher_name")
    private String teacher_name;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "phone")
    private Long phone;

    @Column(name ="email")

    private String email;

    @Column(name = "address")
    private String address;
}
