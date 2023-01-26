package org.example.entity.one_to_many;

import jakarta.persistence.*;

/**
 * @author kurstan
 * @created at 26.01.2023 12:04
 */
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;
    @ManyToOne()                                   ///source table
    @JoinColumn(name = "author_id")
    private Author author;
}
