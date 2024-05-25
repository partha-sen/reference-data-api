package com.pss.repository;

import com.pss.entity.StoreSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreSupplierRepository extends JpaRepository<StoreSupplier, Integer> {
}
