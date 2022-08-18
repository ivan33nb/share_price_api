package ru.yandex.ivan_vaysman.share_price_api.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "locale")
    private String locale;
    @Column(name = "email_verified")
    private boolean email_verified;
}
