package com.opf.license_service.model.HATEOAS;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.opf.license_service.model.License;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LicenseRepresentationModel extends RepresentationModel<LicenseRepresentationModel> {

    private int id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;

    public LicenseRepresentationModel(License license) {
        this.id = license.getId();
        this.licenseId = license.getLicenseId();
        this.description = license.getDescription();
        this.organizationId = license.getOrganizationId();
        this.productName = license.getProductName();
        this.licenseType = license.getLicenseType();
    }
}
