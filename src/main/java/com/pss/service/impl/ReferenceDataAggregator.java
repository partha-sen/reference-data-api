package com.pss.service.impl;

import com.pss.model.ReferenceData;
import com.pss.service.ReferenceDataAggregatorService;
import com.pss.service.ReferenceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class ReferenceDataAggregator implements ReferenceDataAggregatorService {

    private final Map<String, ReferenceDataService> referenceDataMap;

    public ReferenceDataAggregator(@Autowired Map<String, ReferenceDataService> referenceDataMap) {
        this.referenceDataMap = referenceDataMap;
    }

    @Override
    public Set<String> getCodes() {
        return referenceDataMap.keySet();
    }

    @Override
    public List<ReferenceData> getReferenceDataByCode(String[] codes) {
        return Arrays.stream(codes)
                .map(e->new ReferenceData(e, referenceDataMap.get(e).getReferenceData()))
                .toList();
    }

    @Override
    public List<ReferenceData> getAllReferenceData() {
        return referenceDataMap.entrySet().stream()
                .map(e->new ReferenceData(e.getKey(), e.getValue().getReferenceData()))
                .toList();
    }
}
