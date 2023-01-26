package org.example.entity.one_to_one;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author kurstan
 * @created at 26.01.2023 11:37
 */
@Entity
@Table(name = "countries")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int area;
    @OneToOne(cascade =
            {CascadeType.PERSIST,
             CascadeType.REMOVE,
             CascadeType.MERGE,
             CascadeType.REFRESH,
             CascadeType.DETACH})                                        ///source table
    @JoinColumn(name = "capital_id")
    private Capital capital;

    public Country(String name, int area ){
        this.name = name;
        this.area = area;

    }
}
