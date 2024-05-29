package com.pss.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "category")
public class Category {
    @Id
    private Integer id;
    private String category;
    @OneToMany(mappedBy = "category")
    private Set<SubCategory> productSubCategories ;

}
