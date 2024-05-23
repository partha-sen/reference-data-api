package com.pss.mapper;


import com.pss.entity.Brand;
import com.pss.entity.Category;
import com.pss.entity.Company;
import com.pss.entity.SubCategory;
import com.pss.model.ReferenceDataConstants;
import com.pss.model.ReferenceDataElement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.HashMap;
import java.util.Map;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ReferenceDataMapper {

    @Mapping(source = "id", target = "value")
    @Mapping(source = "category", target = "label")
    ReferenceDataElement toReferenceDataElement(Category category);

    @Mapping(source = "code", target = "value")
    @Mapping(source = "companyName", target = "label")
    ReferenceDataElement toReferenceDataElement(Company company);

    @Mapping(source = "id", target = "value")
    @Mapping(source = "subCategory", target = "label")
    @Mapping(target = "linkedEntity", expression = "java(addLinkedEntity(subCategory))")
    ReferenceDataElement toReferenceDataElement(SubCategory subCategory);


    @Mapping(source = "id", target = "value")
    @Mapping(source = "brandName", target = "label")
    @Mapping(target = "linkedEntity", expression = "java(addLinkedEntity(brand))")
    ReferenceDataElement toReferenceDataElement(Brand brand);


   default Map<String, String> addLinkedEntity(SubCategory subCategory){
        Map<String, String> linkedEntity = new HashMap<>();
        linkedEntity.put(ReferenceDataConstants.CATEGORY, subCategory.getCategory().getId().toString());
        return linkedEntity;
    }

    default Map<String, String> addLinkedEntity(Brand brand){
        Map<String, String> linkedEntity = new HashMap<>();
        linkedEntity.put(ReferenceDataConstants.COMPANY, brand.getCompany().getCode());
        linkedEntity.put(ReferenceDataConstants.SUB_CATEGORY, brand.getSubCategory().getId().toString());
        return linkedEntity;
    }

}
