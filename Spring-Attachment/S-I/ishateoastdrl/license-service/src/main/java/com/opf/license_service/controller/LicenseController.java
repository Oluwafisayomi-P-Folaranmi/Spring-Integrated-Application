package com.opf.license_service.controller;

import com.opf.license_service.model.HATEOAS.LicenseRepresentationModel;
import com.opf.license_service.model.License;
import com.opf.license_service.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping(value = "v1/organization/{organizationId}/license")
public class LicenseController {

    @Autowired
    private LicenseService licenseService;

    // GET v1/organization/{organizationId}/license/{licenseId}
    @GetMapping(value="/{licenseId}")
    public ResponseEntity<LicenseRepresentationModel> getLicense(
            @PathVariable("organizationId") String organizationId,
            @PathVariable("licenseId") String licenseId) {

        License license = licenseService
                .getLicense(licenseId, organizationId);

        LicenseRepresentationModel lrm = new LicenseRepresentationModel(license);
        lrm.add(linkTo(methodOn(LicenseController.class)
                .getLicense(organizationId, license.getLicenseId()))
                .withSelfRel(),

                linkTo(methodOn(LicenseController.class)
                        .createLicense(organizationId, license, null))
                        .withRel("createLicense"),

                linkTo(methodOn(LicenseController.class)
                        .updateLicense(organizationId, license, null))
                        .withRel("updateLicense"),

                linkTo(methodOn(LicenseController.class)
                        .deleteLicense(organizationId, license.getLicenseId()))
                        .withRel("deleteLicense")
                );
        return null;
    }

    // POST // v1/organization/{organizationId}/license/
    @PostMapping
    public ResponseEntity<String> createLicense(
            @PathVariable("organizationId") String organizationId,
            @RequestBody License request,
            @RequestHeader(value = "Accept-Language", required = false) Locale locale) {

        return ResponseEntity.ok(
                licenseService.createLicense(
                        request, organizationId, locale));

    }

    // PUT v1/organization/{organizationId}/license/
    @PutMapping
    public ResponseEntity<String> updateLicense(
            @PathVariable("organizationId") String organizationId,
            @RequestBody License request,
            @RequestHeader(value = "Accept-Language", required = false) Locale locale)
    {

        return ResponseEntity.ok(
                licenseService.updateLicense(
                        request, organizationId, locale));

    }

    // DELETE // v1/organization/{organizationId}/license/{licenseId}
    @DeleteMapping(value="/{licenseId}")
    public ResponseEntity<String> deleteLicense(
            @PathVariable("organizationId") String organizationId,
            @PathVariable("licenseId") String licenseId) {

        return ResponseEntity.ok(licenseService.deleteLicense(licenseId,
                organizationId));

    }
}
