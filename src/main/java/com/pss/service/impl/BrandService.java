package com.pss.service.impl;

import com.pss.mapper.ReferenceDataMapper;
import com.pss.model.ReferenceDataConstants;
import com.pss.model.ReferenceDataElement;
import com.pss.repository.BrandRepository;
import com.pss.service.ReferenceDataService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service(ReferenceDataConstants.BRAND)
public class BrandService implements ReferenceDataService {

    private final BrandRepository brandRepository;
    private final ReferenceDataMapper referenceDataMapper;

    public BrandService(BrandRepository brandRepository, ReferenceDataMapper referenceDataMapper) {
        this.brandRepository = brandRepository;
        this.referenceDataMapper = referenceDataMapper;
    }

    @Override
    public List<ReferenceDataElement> getReferenceData() {
        return brandRepository.findAll().stream()
                .map(referenceDataMapper::toReferenceDataElement)
                .collect(Collectors.toList());
    }
}
