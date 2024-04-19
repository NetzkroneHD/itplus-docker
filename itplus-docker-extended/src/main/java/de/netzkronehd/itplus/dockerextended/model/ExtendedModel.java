package de.netzkronehd.itplus.dockerextended.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ExtendedModel {

    @Id
    @SequenceGenerator(
            name = "extended_sequence",
            sequenceName = "extended_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "extended_sequence"
    )
    private int id;

    private String name;
    private String description;


}
