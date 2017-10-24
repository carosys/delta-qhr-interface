
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
    "guardianHcn",
    "secondaryHealthCard",
    "lastUpdatedDatetime"
})
public class NovaScotiaDetails implements Serializable
{

    @JsonProperty("guardianHcn")
    private String guardianHcn;
    @JsonProperty("secondaryHealthCard")
    @Valid
    private SecondaryHealthCard secondaryHealthCard;
    @JsonProperty("lastUpdatedDatetime")
    private Integer lastUpdatedDatetime;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -300124323002976217L;

    @JsonProperty("guardianHcn")
    public String getGuardianHcn() {
        return guardianHcn;
    }

    @JsonProperty("guardianHcn")
    public void setGuardianHcn(String guardianHcn) {
        this.guardianHcn = guardianHcn;
    }

    @JsonProperty("secondaryHealthCard")
    public SecondaryHealthCard getSecondaryHealthCard() {
        return secondaryHealthCard;
    }

    @JsonProperty("secondaryHealthCard")
    public void setSecondaryHealthCard(SecondaryHealthCard secondaryHealthCard) {
        this.secondaryHealthCard = secondaryHealthCard;
    }

    @JsonProperty("lastUpdatedDatetime")
    public Integer getLastUpdatedDatetime() {
        return lastUpdatedDatetime;
    }

    @JsonProperty("lastUpdatedDatetime")
    public void setLastUpdatedDatetime(Integer lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
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
        return new ToStringBuilder(this).append("guardianHcn", guardianHcn).append("secondaryHealthCard", secondaryHealthCard).append("lastUpdatedDatetime", lastUpdatedDatetime).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(lastUpdatedDatetime).append(guardianHcn).append(secondaryHealthCard).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NovaScotiaDetails) == false) {
            return false;
        }
        NovaScotiaDetails rhs = ((NovaScotiaDetails) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(lastUpdatedDatetime, rhs.lastUpdatedDatetime).append(guardianHcn, rhs.guardianHcn).append(secondaryHealthCard, rhs.secondaryHealthCard).isEquals();
    }

}
