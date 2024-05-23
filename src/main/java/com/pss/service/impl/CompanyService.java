package com.pss.service.impl;

import com.pss.mapper.ReferenceDataMapper;
import com.pss.model.ReferenceDataConstants;
import com.pss.model.ReferenceDataElement;
import com.pss.repository.CompanyRepository;
import com.pss.service.ReferenceDataService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service(ReferenceDataConstants.COMPANY)
public class CompanyService implements ReferenceDataService {

    private final CompanyRepository companyRepository;
    private final ReferenceDataMapper referenceDataMapper;

    public CompanyService(CompanyRepository companyRepository, ReferenceDataMapper referenceDataMapper) {
        this.companyRepository = companyRepository;
        this.referenceDataMapper = referenceDataMapper;
    }

    @Override
    public List<ReferenceDataElement> getReferenceData() {
        return companyRepository.findAll().stream()
                .map(referenceDataMapper::toReferenceDataElement)
                .collect(Collectors.toList());
    }
}
