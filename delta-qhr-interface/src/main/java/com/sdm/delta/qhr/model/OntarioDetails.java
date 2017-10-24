
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
    "validationStatus",
    "validationMessage",
    "admissionDate",
    "dischargeDate",
    "masterNumber"
})
public class OntarioDetails implements Serializable
{

    @JsonProperty("validationStatus")
    private Boolean validationStatus;
    @JsonProperty("validationMessage")
    private String validationMessage;
    @JsonProperty("admissionDate")
    private Integer admissionDate;
    @JsonProperty("dischargeDate")
    private Integer dischargeDate;
    @JsonProperty("masterNumber")
    private Integer masterNumber;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8061559495049086492L;

    @JsonProperty("validationStatus")
    public Boolean getValidationStatus() {
        return validationStatus;
    }

    @JsonProperty("validationStatus")
    public void setValidationStatus(Boolean validationStatus) {
        this.validationStatus = validationStatus;
    }

    @JsonProperty("validationMessage")
    public String getValidationMessage() {
        return validationMessage;
    }

    @JsonProperty("validationMessage")
    public void setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
    }

    @JsonProperty("admissionDate")
    public Integer getAdmissionDate() {
        return admissionDate;
    }

    @JsonProperty("admissionDate")
    public void setAdmissionDate(Integer admissionDate) {
        this.admissionDate = admissionDate;
    }

    @JsonProperty("dischargeDate")
    public Integer getDischargeDate() {
        return dischargeDate;
    }

    @JsonProperty("dischargeDate")
    public void setDischargeDate(Integer dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    @JsonProperty("masterNumber")
    public Integer getMasterNumber() {
        return masterNumber;
    }

    @JsonProperty("masterNumber")
    public void setMasterNumber(Integer masterNumber) {
        this.masterNumber = masterNumber;
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
        return new ToStringBuilder(this).append("validationStatus", validationStatus).append("validationMessage", validationMessage).append("admissionDate", admissionDate).append("dischargeDate", dischargeDate).append("masterNumber", masterNumber).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(admissionDate).append(masterNumber).append(additionalProperties).append(validationMessage).append(validationStatus).append(dischargeDate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OntarioDetails) == false) {
            return false;
        }
        OntarioDetails rhs = ((OntarioDetails) other);
        return new EqualsBuilder().append(admissionDate, rhs.admissionDate).append(masterNumber, rhs.masterNumber).append(additionalProperties, rhs.additionalProperties).append(validationMessage, rhs.validationMessage).append(validationStatus, rhs.validationStatus).append(dischargeDate, rhs.dischargeDate).isEquals();
    }

}
