package org.example.entity.many_to_many;

import jakarta.persistence.*;

import java.util.List;

/**
 * @author kurstan
 * @created at 26.01.2023 12:44
 */@Entity
@Table(name = "instructors")
public class Instructor {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    private String lesson;

//    @ManyToMany
//    @JoinTable(name = "instructors_students",
//    joinColumns = @JoinColumn(name = "instructor_id"),
//    inverseJoinColumns = @JoinColumn(name = "student_id"))
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Student> students;
}
