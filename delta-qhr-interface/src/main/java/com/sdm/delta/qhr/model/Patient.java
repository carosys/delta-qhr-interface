
package com.sdm.delta.qhr.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "patientId",
    "personId",
    "demographics",
    "familyProviderId",
    "enrolledProviderId",
    "officeProviderId",
    "referringProviderId",
    "insurerId",
    "fileNumber",
    "registrationNumber",
    "paperChartNote",
    "paperChart",
    "patientStatusId",
    "gestationAge",
    "employerContactId",
    "pharmacyContactId",
    "referredDate",
    "onSocialAssistance",
    "hasArchivedRecords",
    "deceased",
    "deceasedDate",
    "occupation",
    "alert",
    "albertaDetails",
    "ontarioDetails",
    "novaScotiaDetails",
    "manitobaDetails"
})
public class Patient implements Serializable
{

    @JsonProperty("patientId")
    private Integer patientId;
    @JsonProperty("personId")
    private Integer personId;
    @JsonProperty("demographics")
    @Valid
    private Demographics demographics;
    @JsonProperty("familyProviderId")
    private Integer familyProviderId;
    @JsonProperty("enrolledProviderId")
    private Integer enrolledProviderId;
    @JsonProperty("officeProviderId")
    private Integer officeProviderId;
    @JsonProperty("referringProviderId")
    private Integer referringProviderId;
    @JsonProperty("insurerId")
    private Integer insurerId;
    @JsonProperty("fileNumber")
    private String fileNumber;
    @JsonProperty("registrationNumber")
    private String registrationNumber;
    @JsonProperty("paperChartNote")
    private String paperChartNote;
    @JsonProperty("paperChart")
    private Boolean paperChart;
    @JsonProperty("patientStatusId")
    private Integer patientStatusId;
    @JsonProperty("gestationAge")
    private Integer gestationAge;
    @JsonProperty("employerContactId")
    private Integer employerContactId;
    @JsonProperty("pharmacyContactId")
    private Integer pharmacyContactId;
    @JsonProperty("referredDate")
    private Integer referredDate;
    @JsonProperty("onSocialAssistance")
    private Boolean onSocialAssistance;
    @JsonProperty("hasArchivedRecords")
    private Boolean hasArchivedRecords;
    @JsonProperty("deceased")
    private Boolean deceased;
    @JsonProperty("deceasedDate")
    @Valid
    private DeceasedDate deceasedDate;
    @JsonProperty("occupation")
    private String occupation;
    @JsonProperty("alert")
    @Valid
    private Alert alert;
    @JsonProperty("albertaDetails")
    @Valid
    private AlbertaDetails albertaDetails;
    @JsonProperty("ontarioDetails")
    @Valid
    private OntarioDetails ontarioDetails;
    @JsonProperty("novaScotiaDetails")
    @Valid
    private NovaScotiaDetails novaScotiaDetails;
    @JsonProperty("manitobaDetails")
    @Valid
    private ManitobaDetails manitobaDetails;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6554410783598153091L;

    @JsonProperty("patientId")
    public Integer getPatientId() {
        return patientId;
    }

    @JsonProperty("patientId")
    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    @JsonProperty("personId")
    public Integer getPersonId() {
        return personId;
    }

    @JsonProperty("personId")
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @JsonProperty("demographics")
    public Demographics getDemographics() {
        return demographics;
    }

    @JsonProperty("demographics")
    public void setDemographics(Demographics demographics) {
        this.demographics = demographics;
    }

    @JsonProperty("familyProviderId")
    public Integer getFamilyProviderId() {
        return familyProviderId;
    }

    @JsonProperty("familyProviderId")
    public void setFamilyProviderId(Integer familyProviderId) {
        this.familyProviderId = familyProviderId;
    }

    @JsonProperty("enrolledProviderId")
    public Integer getEnrolledProviderId() {
        return enrolledProviderId;
    }

    @JsonProperty("enrolledProviderId")
    public void setEnrolledProviderId(Integer enrolledProviderId) {
        this.enrolledProviderId = enrolledProviderId;
    }

    @JsonProperty("officeProviderId")
    public Integer getOfficeProviderId() {
        return officeProviderId;
    }

    @JsonProperty("officeProviderId")
    public void setOfficeProviderId(Integer officeProviderId) {
        this.officeProviderId = officeProviderId;
    }

    @JsonProperty("referringProviderId")
    public Integer getReferringProviderId() {
        return referringProviderId;
    }

    @JsonProperty("referringProviderId")
    public void setReferringProviderId(Integer referringProviderId) {
        this.referringProviderId = referringProviderId;
    }

    @JsonProperty("insurerId")
    public Integer getInsurerId() {
        return insurerId;
    }

    @JsonProperty("insurerId")
    public void setInsurerId(Integer insurerId) {
        this.insurerId = insurerId;
    }

    @JsonProperty("fileNumber")
    public String getFileNumber() {
        return fileNumber;
    }

    @JsonProperty("fileNumber")
    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    @JsonProperty("registrationNumber")
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @JsonProperty("registrationNumber")
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @JsonProperty("paperChartNote")
    public String getPaperChartNote() {
        return paperChartNote;
    }

    @JsonProperty("paperChartNote")
    public void setPaperChartNote(String paperChartNote) {
        this.paperChartNote = paperChartNote;
    }

    @JsonProperty("paperChart")
    public Boolean getPaperChart() {
        return paperChart;
    }

    @JsonProperty("paperChart")
    public void setPaperChart(Boolean paperChart) {
        this.paperChart = paperChart;
    }

    @JsonProperty("patientStatusId")
    public Integer getPatientStatusId() {
        return patientStatusId;
    }

    @JsonProperty("patientStatusId")
    public void setPatientStatusId(Integer patientStatusId) {
        this.patientStatusId = patientStatusId;
    }

    @JsonProperty("gestationAge")
    public Integer getGestationAge() {
        return gestationAge;
    }

    @JsonProperty("gestationAge")
    public void setGestationAge(Integer gestationAge) {
        this.gestationAge = gestationAge;
    }

    @JsonProperty("employerContactId")
    public Integer getEmployerContactId() {
        return employerContactId;
    }

    @JsonProperty("employerContactId")
    public void setEmployerContactId(Integer employerContactId) {
        this.employerContactId = employerContactId;
    }

    @JsonProperty("pharmacyContactId")
    public Integer getPharmacyContactId() {
        return pharmacyContactId;
    }

    @JsonProperty("pharmacyContactId")
    public void setPharmacyContactId(Integer pharmacyContactId) {
        this.pharmacyContactId = pharmacyContactId;
    }

    @JsonProperty("referredDate")
    public Integer getReferredDate() {
        return referredDate;
    }

    @JsonProperty("referredDate")
    public void setReferredDate(Integer referredDate) {
        this.referredDate = referredDate;
    }

    @JsonProperty("onSocialAssistance")
    public Boolean getOnSocialAssistance() {
        return onSocialAssistance;
    }

    @JsonProperty("onSocialAssistance")
    public void setOnSocialAssistance(Boolean onSocialAssistance) {
        this.onSocialAssistance = onSocialAssistance;
    }

    @JsonProperty("hasArchivedRecords")
    public Boolean getHasArchivedRecords() {
        return hasArchivedRecords;
    }

    @JsonProperty("hasArchivedRecords")
    public void setHasArchivedRecords(Boolean hasArchivedRecords) {
        this.hasArchivedRecords = hasArchivedRecords;
    }

    @JsonProperty("deceased")
    public Boolean getDeceased() {
        return deceased;
    }

    @JsonProperty("deceased")
    public void setDeceased(Boolean deceased) {
        this.deceased = deceased;
    }

    @JsonProperty("deceasedDate")
    public DeceasedDate getDeceasedDate() {
        return deceasedDate;
    }

    @JsonProperty("deceasedDate")
    public void setDeceasedDate(DeceasedDate deceasedDate) {
        this.deceasedDate = deceasedDate;
    }

    @JsonProperty("occupation")
    public String getOccupation() {
        return occupation;
    }

    @JsonProperty("occupation")
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @JsonProperty("alert")
    public Alert getAlert() {
        return alert;
    }

    @JsonProperty("alert")
    public void setAlert(Alert alert) {
        this.alert = alert;
    }

    @JsonProperty("albertaDetails")
    public AlbertaDetails getAlbertaDetails() {
        return albertaDetails;
    }

    @JsonProperty("albertaDetails")
    public void setAlbertaDetails(AlbertaDetails albertaDetails) {
        this.albertaDetails = albertaDetails;
    }

    @JsonProperty("ontarioDetails")
    public OntarioDetails getOntarioDetails() {
        return ontarioDetails;
    }

    @JsonProperty("ontarioDetails")
    public void setOntarioDetails(OntarioDetails ontarioDetails) {
        this.ontarioDetails = ontarioDetails;
    }

    @JsonProperty("novaScotiaDetails")
    public NovaScotiaDetails getNovaScotiaDetails() {
        return novaScotiaDetails;
    }

    @JsonProperty("novaScotiaDetails")
    public void setNovaScotiaDetails(NovaScotiaDetails novaScotiaDetails) {
        this.novaScotiaDetails = novaScotiaDetails;
    }

    @JsonProperty("manitobaDetails")
    public ManitobaDetails getManitobaDetails() {
        return manitobaDetails;
    }

    @JsonProperty("manitobaDetails")
    public void setManitobaDetails(ManitobaDetails manitobaDetails) {
        this.manitobaDetails = manitobaDetails;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("patientId", patientId).append("personId", personId).append("demographics", demographics).append("familyProviderId", familyProviderId).append("enrolledProviderId", enrolledProviderId).append("officeProviderId", officeProviderId).append("referringProviderId", referringProviderId).append("insurerId", insurerId).append("fileNumber", fileNumber).append("registrationNumber", registrationNumber).append("paperChartNote", paperChartNote).append("paperChart", paperChart).append("patientStatusId", patientStatusId).append("gestationAge", gestationAge).append("employerContactId", employerContactId).append("pharmacyContactId", pharmacyContactId).append("referredDate", referredDate).append("onSocialAssistance", onSocialAssistance).append("hasArchivedRecords", hasArchivedRecords).append("deceased", deceased).append("deceasedDate", deceasedDate).append("occupation", occupation).append("alert", alert).append("albertaDetails", albertaDetails).append("ontarioDetails", ontarioDetails).append("novaScotiaDetails", novaScotiaDetails).append("manitobaDetails", manitobaDetails).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(albertaDetails).append(ontarioDetails).append(referringProviderId).append(pharmacyContactId).append(familyProviderId).append(enrolledProviderId).append(patientId).append(fileNumber).append(personId).append(deceased).append(onSocialAssistance).append(gestationAge).append(hasArchivedRecords).append(occupation).append(employerContactId).append(patientStatusId).append(alert).append(insurerId).append(manitobaDetails).append(referredDate).append(novaScotiaDetails).append(registrationNumber).append(officeProviderId).append(paperChartNote).append(additionalProperties).append(demographics).append(deceasedDate).append(paperChart).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Patient) == false) {
            return false;
        }
        Patient rhs = ((Patient) other);
        return new EqualsBuilder().append(albertaDetails, rhs.albertaDetails).append(ontarioDetails, rhs.ontarioDetails).append(referringProviderId, rhs.referringProviderId).append(pharmacyContactId, rhs.pharmacyContactId).append(familyProviderId, rhs.familyProviderId).append(enrolledProviderId, rhs.enrolledProviderId).append(patientId, rhs.patientId).append(fileNumber, rhs.fileNumber).append(personId, rhs.personId).append(deceased, rhs.deceased).append(onSocialAssistance, rhs.onSocialAssistance).append(gestationAge, rhs.gestationAge).append(hasArchivedRecords, rhs.hasArchivedRecords).append(occupation, rhs.occupation).append(employerContactId, rhs.employerContactId).append(patientStatusId, rhs.patientStatusId).append(alert, rhs.alert).append(insurerId, rhs.insurerId).append(manitobaDetails, rhs.manitobaDetails).append(referredDate, rhs.referredDate).append(novaScotiaDetails, rhs.novaScotiaDetails).append(registrationNumber, rhs.registrationNumber).append(officeProviderId, rhs.officeProviderId).append(paperChartNote, rhs.paperChartNote).append(additionalProperties, rhs.additionalProperties).append(demographics, rhs.demographics).append(deceasedDate, rhs.deceasedDate).append(paperChart, rhs.paperChart).isEquals();
    }

}
