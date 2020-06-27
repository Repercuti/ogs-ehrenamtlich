package de.children.agplanner.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "wuensche")
public class Wunsch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
}
