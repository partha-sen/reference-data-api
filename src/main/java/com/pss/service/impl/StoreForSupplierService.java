package com.pss.service.impl;

import com.pss.mapper.ReferenceDataMapper;
import com.pss.model.ReferenceDataConstants;
import com.pss.model.ReferenceDataElement;
import com.pss.repository.StoreSupplierRepository;
import com.pss.service.ReferenceDataService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service(ReferenceDataConstants.STORES_FOR_SUPPLIER)
public class StoreForSupplierService implements ReferenceDataService {

    private final StoreSupplierRepository storeSupplierRepository;
    private final ReferenceDataMapper referenceDataMapper;

    public StoreForSupplierService(StoreSupplierRepository storeSupplierRepository, ReferenceDataMapper referenceDataMapper) {
        this.storeSupplierRepository = storeSupplierRepository;
        this.referenceDataMapper = referenceDataMapper;
    }

    @Override
    public List<ReferenceDataElement> getReferenceData() {
        return storeSupplierRepository.findAll().stream()
                .map(referenceDataMapper::toReferenceDataElementForSupplier)
                .collect(Collectors.toList());
    }
}
