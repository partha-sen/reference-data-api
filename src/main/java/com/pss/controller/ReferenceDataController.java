package com.pss.controller;

import com.pss.annotation.ValidateReferenceDataCode;
import com.pss.model.ReferenceData;
import com.pss.service.ReferenceDataAggregatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
@RequestMapping("/reference-data")
public class ReferenceDataController {

    private final ReferenceDataAggregatorService referenceDataAggregator;

    public ReferenceDataController(ReferenceDataAggregatorService referenceDataAggregator) {
        this.referenceDataAggregator = referenceDataAggregator;
    }

    @GetMapping("/lookup")
    public ResponseEntity<List<ReferenceData>> getReferenceDataByCode(@RequestParam @ValidateReferenceDataCode String[] code){
        return ResponseEntity.ok(referenceDataAggregator.getReferenceDataByCode(code));
    }

    @GetMapping("/lookup-all")
    public ResponseEntity<List<ReferenceData>> getSubCountries(){
        return ResponseEntity.ok(referenceDataAggregator.getAllReferenceData());
    }

}
