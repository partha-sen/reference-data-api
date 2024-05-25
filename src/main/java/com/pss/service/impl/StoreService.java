package com.pss.service.impl;

import com.pss.mapper.ReferenceDataMapper;
import com.pss.model.ReferenceDataConstants;
import com.pss.model.ReferenceDataElement;
import com.pss.repository.StoreRepository;
import com.pss.service.ReferenceDataService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service(ReferenceDataConstants.STORE)
public class StoreService implements ReferenceDataService {

    private final StoreRepository storeRepository;
    private final ReferenceDataMapper referenceDataMapper;

    public StoreService(StoreRepository storeRepository, ReferenceDataMapper referenceDataMapper) {
        this.storeRepository = storeRepository;
        this.referenceDataMapper = referenceDataMapper;
    }

    @Override
    public List<ReferenceDataElement> getReferenceData() {
        return storeRepository.findAll().stream()
                .map(referenceDataMapper::toReferenceDataElement)
                .collect(Collectors.toList());
    }
}
