package com.pss.service.impl;

import com.pss.mapper.ReferenceDataMapper;
import com.pss.model.ReferenceDataConstants;
import com.pss.model.ReferenceDataElement;
import com.pss.repository.SupplierRepository;
import com.pss.service.ReferenceDataService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service(ReferenceDataConstants.SUPPLIER)
public class SupplierService implements ReferenceDataService {

    private final SupplierRepository supplierRepository;
    private final ReferenceDataMapper referenceDataMapper;

    public SupplierService(SupplierRepository supplierRepository, ReferenceDataMapper referenceDataMapper) {
        this.supplierRepository = supplierRepository;
        this.referenceDataMapper = referenceDataMapper;
    }

    @Override
    public List<ReferenceDataElement> getReferenceData() {
        return supplierRepository.findAll().stream()
                .map(referenceDataMapper::toReferenceDataElement)
                .collect(Collectors.toList());
    }
}
