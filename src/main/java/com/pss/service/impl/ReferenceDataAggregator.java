package com.pss.service.impl;

import com.pss.model.ReferenceData;
import com.pss.service.ReferenceDataAggregatorService;
import com.pss.service.ReferenceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ReferenceDataAggregator implements ReferenceDataAggregatorService {

    private final Map<String, ReferenceDataService> referenceDataMap;

    public ReferenceDataAggregator(@Autowired Map<String, ReferenceDataService> referenceDataMap) {
        this.referenceDataMap = referenceDataMap;
    }

    @Override
    public List<ReferenceData> getReferenceDataByCode(String[] codes) {
        List<ReferenceData> referenceDataList = new ArrayList<>();
        for (String code : codes) {
            ReferenceDataService referenceData = referenceDataMap.get(code);
            if(referenceData != null){
                referenceDataList.add(new ReferenceData(code, referenceData.getReferenceData()));
            }
        }
        return referenceDataList;
    }

    @Override
    public List<ReferenceData> getAllReferenceData() {
        List<ReferenceData> referenceDataList = new ArrayList<>();
        for (Map.Entry<String, ReferenceDataService> entry : referenceDataMap.entrySet()) {
            referenceDataList.add(new ReferenceData(entry.getKey(), entry.getValue().getReferenceData()));
        }
        return referenceDataList;
    }
}
