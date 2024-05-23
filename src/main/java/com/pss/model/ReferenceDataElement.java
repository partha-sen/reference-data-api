package com.pss.model;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
public class ReferenceDataElement {
    private Map<String, String> linkedEntity;
    private String value;
    private String label;

}
