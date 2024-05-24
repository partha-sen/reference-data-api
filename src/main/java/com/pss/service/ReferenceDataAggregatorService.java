package com.pss.service;

import com.pss.model.ReferenceData;

import java.util.List;
import java.util.Set;

public interface ReferenceDataAggregatorService {
    Set<String> getCodes();
    List<ReferenceData> getReferenceDataByCode(String[] code);
    List<ReferenceData> getAllReferenceData();

}
