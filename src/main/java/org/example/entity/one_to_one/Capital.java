package org.example.entity.one_to_one;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author kurstan
 * @created at 26.01.2023 11:38
 */
@Entity
@Table (name = "capitals")
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "country")
public class Capital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int population;
    @OneToOne(mappedBy = "capital", cascade =
            {CascadeType.PERSIST,
            CascadeType.REFRESH,
            CascadeType.MERGE,
            CascadeType.DETACH},fetch = FetchType.LAZY)                        ///target table
    private Country country;

    public Capital(String name, int population) {
        this.name = name;
        this.population = population;
    }
}
