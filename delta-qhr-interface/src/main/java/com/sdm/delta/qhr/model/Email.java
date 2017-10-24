
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
    "emailId",
    "type",
    "address",
    "order",
    "loggableView"
})
public class Email implements Serializable
{

    @JsonProperty("emailId")
    private Integer emailId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("address")
    private String address;
    @JsonProperty("order")
    private Integer order;
    @JsonProperty("loggableView")
    @Valid
    private LoggableView loggableView;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4616629801397870056L;

    @JsonProperty("emailId")
    public Integer getEmailId() {
        return emailId;
    }

    @JsonProperty("emailId")
    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
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
        return new ToStringBuilder(this).append("emailId", emailId).append("type", type).append("address", address).append("order", order).append("loggableView", loggableView).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(emailId).append(order).append(address).append(additionalProperties).append(loggableView).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Email) == false) {
            return false;
        }
        Email rhs = ((Email) other);
        return new EqualsBuilder().append(emailId, rhs.emailId).append(order, rhs.order).append(address, rhs.address).append(additionalProperties, rhs.additionalProperties).append(loggableView, rhs.loggableView).append(type, rhs.type).isEquals();
    }

}
