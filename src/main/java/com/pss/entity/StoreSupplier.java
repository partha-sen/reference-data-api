package com.pss.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "store_supplier")
public class StoreSupplier {
    @Id
    Integer id;
    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
    Store store;

    @ManyToOne
    @JoinColumn(name = "supplier_id", nullable = false)
    Supplier supplier;
}
