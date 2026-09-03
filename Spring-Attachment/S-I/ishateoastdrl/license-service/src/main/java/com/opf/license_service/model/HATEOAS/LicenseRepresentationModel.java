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
@AllArgsConstructor
public class LicenseRepresentationModel extends RepresentationModel<License> {

    @JsonUnwrapped
    private final License license;

}
