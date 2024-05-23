package com.pss.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "company")
public class Company {
    @Id
    private String code;
    private String companyName;

    @OneToMany(mappedBy = "company")
    Set<Brand> brands;
}
