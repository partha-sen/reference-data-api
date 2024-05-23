package com.pss.service.impl;

import com.pss.mapper.ReferenceDataMapper;
import com.pss.model.ReferenceDataConstants;
import com.pss.model.ReferenceDataElement;
import com.pss.repository.CategoryRepository;
import com.pss.service.ReferenceDataService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service(ReferenceDataConstants.CATEGORY)
public class CategoryService implements ReferenceDataService {

    private final CategoryRepository categoryRepository;
    private final ReferenceDataMapper referenceDataMapper;

    public CategoryService(CategoryRepository categoryRepository, ReferenceDataMapper referenceDataMapper) {
        this.categoryRepository = categoryRepository;
        this.referenceDataMapper = referenceDataMapper;
    }

    @Override
    public List<ReferenceDataElement> getReferenceData() {
        return categoryRepository.findAll().stream()
                .map(referenceDataMapper::toReferenceDataElement)
                .collect(Collectors.toList());
    }
}
