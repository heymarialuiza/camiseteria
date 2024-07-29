package com.demo.camiseteria.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "members")
@Entity
public class MembersEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_member", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long idClient;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cpfcnpj", nullable = false, unique = true)
    private Long cpfCnpj;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private Long phone;

    @Column(name = "size")
    private String size;

    @Column(name = "socialmedia")
    private String socialMedia;

    @Column(name = "admin", nullable = false)
    private Boolean admin;

    @Column(name = "createddate", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "modifieddate", nullable = false)
    private LocalDateTime modifiedDate;

    @PrePersist
    protected void onCreate() {
        this.createdDate = LocalDateTime.now();
        this.modifiedDate = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.modifiedDate = LocalDateTime.now();
    }
}
