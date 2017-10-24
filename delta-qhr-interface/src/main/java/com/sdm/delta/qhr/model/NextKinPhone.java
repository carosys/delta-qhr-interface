
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
    "phoneId",
    "number",
    "ext",
    "equipType",
    "usage",
    "notes",
    "order",
    "contactType",
    "loggableView"
})
public class NextKinPhone implements Serializable
{

    @JsonProperty("phoneId")
    private Integer phoneId;
    @JsonProperty("number")
    private String number;
    @JsonProperty("ext")
    private String ext;
    @JsonProperty("equipType")
    private String equipType;
    @JsonProperty("usage")
    private String usage;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("order")
    private Integer order;
    @JsonProperty("contactType")
    private String contactType;
    @JsonProperty("loggableView")
    @Valid
    private LoggableView loggableView;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1340253353413880852L;

    @JsonProperty("phoneId")
    public Integer getPhoneId() {
        return phoneId;
    }

    @JsonProperty("phoneId")
    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("ext")
    public String getExt() {
        return ext;
    }

    @JsonProperty("ext")
    public void setExt(String ext) {
        this.ext = ext;
    }

    @JsonProperty("equipType")
    public String getEquipType() {
        return equipType;
    }

    @JsonProperty("equipType")
    public void setEquipType(String equipType) {
        this.equipType = equipType;
    }

    @JsonProperty("usage")
    public String getUsage() {
        return usage;
    }

    @JsonProperty("usage")
    public void setUsage(String usage) {
        this.usage = usage;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    @JsonProperty("contactType")
    public String getContactType() {
        return contactType;
    }

    @JsonProperty("contactType")
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    @JsonProperty("loggableView")
    public LoggableView getLoggableView() {
        return loggableView;
    }

    @JsonProperty("loggableView")
    public void setLoggableView(LoggableView loggableView) {
        this.loggableView = loggableView;
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
        return new ToStringBuilder(this).append("phoneId", phoneId).append("number", number).append("ext", ext).append("equipType", equipType).append("usage", usage).append("notes", notes).append("order", order).append("contactType", contactType).append("loggableView", loggableView).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(order).append(additionalProperties).append(loggableView).append(contactType).append(usage).append(phoneId).append(number).append(notes).append(equipType).append(ext).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NextKinPhone) == false) {
            return false;
        }
        NextKinPhone rhs = ((NextKinPhone) other);
        return new EqualsBuilder().append(order, rhs.order).append(additionalProperties, rhs.additionalProperties).append(loggableView, rhs.loggableView).append(contactType, rhs.contactType).append(usage, rhs.usage).append(phoneId, rhs.phoneId).append(number, rhs.number).append(notes, rhs.notes).append(equipType, rhs.equipType).append(ext, rhs.ext).isEquals();
    }

}
