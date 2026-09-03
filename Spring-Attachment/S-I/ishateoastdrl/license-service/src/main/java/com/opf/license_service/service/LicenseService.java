package com.opf.license_service.service;

import com.opf.license_service.model.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Random;

@Service
public class LicenseService {

    @Autowired
    License license;

    @Autowired
    MessageSource messages;

    public License getLicense(
            String licenseId,
            String organizationId){

        // Assume we have a license queried out...
        License license = new License();
        license.setId(new Random().nextInt(1000));
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setDescription("Software product");
        license.setProductName("Ostock");
        license.setLicenseType("full");

        return license;
    }

    public String createLicense(
            License license,
            String organizationId,
            Locale locale) {

        String responseMessage = null;

        if(license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(
                    messages.getMessage("license.create.message", null, locale),
                    license.toString());
        }

        return responseMessage;
    }

    public String updateLicense(
            License license,
            String organizationId,
            Locale locale){

        String responseMessage = null;

        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(
                    messages.getMessage("license.update.message", null, null),
                    license.toString());
        }

        return responseMessage;
    }

    public String deleteLicense(String licenseId, String organizationId){
        String responseMessage = null;
        responseMessage = String.format("Deleting license with id %s for the organization %s",licenseId, organizationId);
        return responseMessage;
    }
}
