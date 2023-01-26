package org.example.entity.many_to_many;

import jakarta.persistence.*;

import java.util.List;

/**
 * @author kurstan
 * @created at 26.01.2023 12:44
 */
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    protected String course;

//    @ManyToMany(mappedBy = "students")
    @ManyToMany(mappedBy = "students")
    private List<Instructor> instructors;
}
