package com.pss.service;

import com.pss.model.ReferenceData;

import java.util.List;

public interface ReferenceDataAggregatorService {

    List<ReferenceData> getReferenceDataByCode(String[] code);
    List<ReferenceData> getAllReferenceData();

}
