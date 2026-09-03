package com.opf.license_service.model;

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
public class License extends RepresentationModel<License> {

    private int id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;

}
