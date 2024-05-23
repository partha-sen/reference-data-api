package com.pss.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "brand")
public class Brand {
    @Id
    private Integer id;
    private String brandName;

    @ManyToOne
    @JoinColumn(name = "sub_category_id", nullable = false)
    SubCategory subCategory;

    @ManyToOne
    @JoinColumn(name = "company_code")
    Company company;

}
