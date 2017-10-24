
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
    "phn",
    "locationId",
    "expiry"
})
public class HealthCard implements Serializable
{

    @JsonProperty("phn")
    private String phn;
    @JsonProperty("locationId")
    private Integer locationId;
    @JsonProperty("expiry")
    private Integer expiry;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8509663366579767616L;

    @JsonProperty("phn")
    public String getPhn() {
        return phn;
    }

    @JsonProperty("phn")
    public void setPhn(String phn) {
        this.phn = phn;
    }

    @JsonProperty("locationId")
    public Integer getLocationId() {
        return locationId;
    }

    @JsonProperty("locationId")
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @JsonProperty("expiry")
    public Integer getExpiry() {
        return expiry;
    }

    @JsonProperty("expiry")
    public void setExpiry(Integer expiry) {
        this.expiry = expiry;
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
        return new ToStringBuilder(this).append("phn", phn).append("locationId", locationId).append("expiry", expiry).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(locationId).append(phn).append(expiry).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HealthCard) == false) {
            return false;
        }
        HealthCard rhs = ((HealthCard) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(locationId, rhs.locationId).append(phn, rhs.phn).append(expiry, rhs.expiry).isEquals();
    }

}
