package com.pss.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "supplier")
public class Supplier {
    @Id
    Integer id;
    String name;
    @OneToMany(mappedBy = "supplier")
    Set<StoreSupplier> storeSupplier;
}
