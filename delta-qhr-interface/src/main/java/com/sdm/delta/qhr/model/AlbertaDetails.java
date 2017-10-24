
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
    "type",
    "newBornCode",
    "guardianUli",
    "guardianRegistration",
    "uli2"
})
public class AlbertaDetails implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("newBornCode")
    private String newBornCode;
    @JsonProperty("guardianUli")
    private String guardianUli;
    @JsonProperty("guardianRegistration")
    private String guardianRegistration;
    @JsonProperty("uli2")
    @Valid
    private Uli2 uli2;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5455965430880555007L;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("newBornCode")
    public String getNewBornCode() {
        return newBornCode;
    }

    @JsonProperty("newBornCode")
    public void setNewBornCode(String newBornCode) {
        this.newBornCode = newBornCode;
    }

    @JsonProperty("guardianUli")
    public String getGuardianUli() {
        return guardianUli;
    }

    @JsonProperty("guardianUli")
    public void setGuardianUli(String guardianUli) {
        this.guardianUli = guardianUli;
    }

    @JsonProperty("guardianRegistration")
    public String getGuardianRegistration() {
        return guardianRegistration;
    }

    @JsonProperty("guardianRegistration")
    public void setGuardianRegistration(String guardianRegistration) {
        this.guardianRegistration = guardianRegistration;
    }

    @JsonProperty("uli2")
    public Uli2 getUli2() {
        return uli2;
    }

    @JsonProperty("uli2")
    public void setUli2(Uli2 uli2) {
        this.uli2 = uli2;
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
        return new ToStringBuilder(this).append("type", type).append("newBornCode", newBornCode).append("guardianUli", guardianUli).append("guardianRegistration", guardianRegistration).append("uli2", uli2).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(guardianRegistration).append(uli2).append(additionalProperties).append(guardianUli).append(newBornCode).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlbertaDetails) == false) {
            return false;
        }
        AlbertaDetails rhs = ((AlbertaDetails) other);
        return new EqualsBuilder().append(guardianRegistration, rhs.guardianRegistration).append(uli2, rhs.uli2).append(additionalProperties, rhs.additionalProperties).append(guardianUli, rhs.guardianUli).append(newBornCode, rhs.newBornCode).append(type, rhs.type).isEquals();
    }

}
