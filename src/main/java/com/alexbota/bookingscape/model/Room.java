package com.alexbota.bookingscape.model;

import javax.persistence.*;

@Entity
@Table(
        name = "rooms"
)
public class Room {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (
            name = "name",
            columnDefinition = "TEXT",
            nullable = false
    )
    private String name;
    @Column (
            name = "type",
            columnDefinition = "TEXT",
            nullable = false
    )
    private String type;
    @Column (
            name = "description",
            columnDefinition = "TEXT"
    )
    private String description;
    @Column (
            name = "size",
            columnDefinition = "FLOAT",
            nullable = false
    )
    private float size;
    @Column (
            name = "guests",
            columnDefinition = "INT",
            nullable = false
    )
    private int guests;
    @Column (
            name = "single_beds",
            columnDefinition = "INT",
            nullable = false
    )
    private int single_beds;
    @Column (
            name = "twin_beds",
            columnDefinition = "INT",
            nullable = false
    )
    private int twin_beds;
    @Column (
            name = "country",
            columnDefinition = "TEXT",
            nullable = false
    )
    private String country;
    @Column (
            name = "street",
            columnDefinition = "TEXT",
            nullable = false
    )
    private String street;
    @Column (
            name = "post_code",
            columnDefinition = "INT",
            nullable = false
    )
    private int post_code;
    @Column (
            name = "city",
            columnDefinition = "TEXT",
            nullable = false
    )
    private String city;
}
