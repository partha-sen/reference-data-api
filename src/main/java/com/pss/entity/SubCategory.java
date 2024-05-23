package com.pss.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "sub_categories")
public class SubCategory {
    @Id
    private Integer id;
    private String subCategory;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
    @OneToMany(mappedBy = "subCategory")
    Set<Brand> brands;

}
