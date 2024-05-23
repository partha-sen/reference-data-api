package com.pss.service.impl;

import com.pss.mapper.ReferenceDataMapper;
import com.pss.model.ReferenceDataConstants;
import com.pss.model.ReferenceDataElement;
import com.pss.repository.SubCategoryRepository;
import com.pss.service.ReferenceDataService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service(ReferenceDataConstants.SUB_CATEGORY)
public class SubCategoryService implements ReferenceDataService {

    private final SubCategoryRepository subCategoryRepository;
    private final ReferenceDataMapper referenceDataMapper;

    public SubCategoryService(SubCategoryRepository subCategoryRepository, ReferenceDataMapper referenceDataMapper) {
        this.subCategoryRepository = subCategoryRepository;
        this.referenceDataMapper = referenceDataMapper;
    }

    @Override
    public List<ReferenceDataElement> getReferenceData() {
        return subCategoryRepository.findAll().stream()
                .map(referenceDataMapper::toReferenceDataElement)
                .collect(Collectors.toList());
    }
}
