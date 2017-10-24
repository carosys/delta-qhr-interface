
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
    "healthRegistrationNumber"
})
public class ManitobaDetails implements Serializable
{

    @JsonProperty("healthRegistrationNumber")
    private String healthRegistrationNumber;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8914910511909435873L;

    @JsonProperty("healthRegistrationNumber")
    public String getHealthRegistrationNumber() {
        return healthRegistrationNumber;
    }

    @JsonProperty("healthRegistrationNumber")
    public void setHealthRegistrationNumber(String healthRegistrationNumber) {
        this.healthRegistrationNumber = healthRegistrationNumber;
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
        return new ToStringBuilder(this).append("healthRegistrationNumber", healthRegistrationNumber).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(healthRegistrationNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManitobaDetails) == false) {
            return false;
        }
        ManitobaDetails rhs = ((ManitobaDetails) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(healthRegistrationNumber, rhs.healthRegistrationNumber).isEquals();
    }

}
