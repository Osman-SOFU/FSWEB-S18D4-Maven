package com.workintech.s18d1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "burger", schema = "fsweb")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name = "price")
    private Double price;

    @Column (name = "is_Vegan")
    private boolean isVegan;

    @Enumerated(EnumType.STRING)
    @Column (name = "bread_Type")
    private BreadType breadType;

    @Column (name = "contents")
    private String contents;

    public void setIsVegan(boolean vegan) {
        isVegan = vegan;
    }

    public boolean getIsVegan() {
        return isVegan;
    }
}
