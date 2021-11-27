package com.alexbota.bookingscape.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(
        name = "users",
        uniqueConstraints = {
                @UniqueConstraint(name = "student_email_unique", columnNames = "email")
        }
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (
            name = "email",
            columnDefinition = "TEXT",
            nullable = false
    )
    private String email;
    @Column (
            name = "password",
            columnDefinition = "TEXT",
            nullable = false
    )
    private String password;
}