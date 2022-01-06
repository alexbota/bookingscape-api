package com.alexbota.bookingscape.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(
        name = "rooms"
)
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    @ToString.Exclude
    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
            name = "user_id",
            nullable = false,
            foreignKey = @ForeignKey(
                    name = "fk_rooms_users_id"
            )
    )
    private User user;
}
