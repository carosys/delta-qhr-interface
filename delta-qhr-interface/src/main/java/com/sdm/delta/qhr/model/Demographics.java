
package com.sdm.delta.qhr.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "firstName",
    "lastName",
    "middleName",
    "title",
    "suffix",
    "birthday",
    "genderId",
    "email",
    "phones",
    "addresses",
    "healthCard",
    "preferredContactType",
    "nextKinName",
    "nextKinPhone",
    "officialLanguageCode",
    "spokenLanguageCode",
    "relationshipStatusId"
})
public class Demographics implements Serializable
{

    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("title")
    private String title;
    @JsonProperty("suffix")
    private String suffix;
    @JsonProperty("birthday")
    private Integer birthday;
    @JsonProperty("genderId")
    private Integer genderId;
    @JsonProperty("email")
    @Valid
    private Email email;
    @JsonProperty("phones")
    @Valid
    private List<Phone> phones = null;
    @JsonProperty("addresses")
    @Valid
    private List<Address> addresses = null;
    @JsonProperty("healthCard")
    @Valid
    private HealthCard healthCard;
    @JsonProperty("preferredContactType")
    private String preferredContactType;
    @JsonProperty("nextKinName")
    private String nextKinName;
    @JsonProperty("nextKinPhone")
    @Valid
    private NextKinPhone nextKinPhone;
    @JsonProperty("officialLanguageCode")
    private String officialLanguageCode;
    @JsonProperty("spokenLanguageCode")
    private String spokenLanguageCode;
    @JsonProperty("relationshipStatusId")
    private Integer relationshipStatusId;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6337534292994732979L;

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("suffix")
    public String getSuffix() {
        return suffix;
    }

    @JsonProperty("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @JsonProperty("birthday")
    public Integer getBirthday() {
        return birthday;
    }

    @JsonProperty("birthday")
    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    @JsonProperty("genderId")
    public Integer getGenderId() {
        return genderId;
    }

    @JsonProperty("genderId")
    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    @JsonProperty("email")
    public Email getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Email email) {
        this.email = email;
    }

    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @JsonProperty("healthCard")
    public HealthCard getHealthCard() {
        return healthCard;
    }

    @JsonProperty("healthCard")
    public void setHealthCard(HealthCard healthCard) {
        this.healthCard = healthCard;
    }

    @JsonProperty("preferredContactType")
    public String getPreferredContactType() {
        return preferredContactType;
    }

    @JsonProperty("preferredContactType")
    public void setPreferredContactType(String preferredContactType) {
        this.preferredContactType = preferredContactType;
    }

    @JsonProperty("nextKinName")
    public String getNextKinName() {
        return nextKinName;
    }

    @JsonProperty("nextKinName")
    public void setNextKinName(String nextKinName) {
        this.nextKinName = nextKinName;
    }

    @JsonProperty("nextKinPhone")
    public NextKinPhone getNextKinPhone() {
        return nextKinPhone;
    }

    @JsonProperty("nextKinPhone")
    public void setNextKinPhone(NextKinPhone nextKinPhone) {
        this.nextKinPhone = nextKinPhone;
    }

    @JsonProperty("officialLanguageCode")
    public String getOfficialLanguageCode() {
        return officialLanguageCode;
    }

    @JsonProperty("officialLanguageCode")
    public void setOfficialLanguageCode(String officialLanguageCode) {
        this.officialLanguageCode = officialLanguageCode;
    }

    @JsonProperty("spokenLanguageCode")
    public String getSpokenLanguageCode() {
        return spokenLanguageCode;
    }

    @JsonProperty("spokenLanguageCode")
    public void setSpokenLanguageCode(String spokenLanguageCode) {
        this.spokenLanguageCode = spokenLanguageCode;
    }

    @JsonProperty("relationshipStatusId")
    public Integer getRelationshipStatusId() {
        return relationshipStatusId;
    }

    @JsonProperty("relationshipStatusId")
    public void setRelationshipStatusId(Integer relationshipStatusId) {
        this.relationshipStatusId = relationshipStatusId;
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
        return new ToStringBuilder(this).append("firstName", firstName).append("lastName", lastName).append("middleName", middleName).append("title", title).append("suffix", suffix).append("birthday", birthday).append("genderId", genderId).append("email", email).append("phones", phones).append("addresses", addresses).append("healthCard", healthCard).append("preferredContactType", preferredContactType).append("nextKinName", nextKinName).append("nextKinPhone", nextKinPhone).append("officialLanguageCode", officialLanguageCode).append("spokenLanguageCode", spokenLanguageCode).append("relationshipStatusId", relationshipStatusId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(middleName).append(birthday).append(lastName).append(spokenLanguageCode).append(nextKinName).append(preferredContactType).append(genderId).append(suffix).append(officialLanguageCode).append(phones).append(healthCard).append(title).append(email).append(additionalProperties).append(relationshipStatusId).append(nextKinPhone).append(addresses).append(firstName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Demographics) == false) {
            return false;
        }
        Demographics rhs = ((Demographics) other);
        return new EqualsBuilder().append(middleName, rhs.middleName).append(birthday, rhs.birthday).append(lastName, rhs.lastName).append(spokenLanguageCode, rhs.spokenLanguageCode).append(nextKinName, rhs.nextKinName).append(preferredContactType, rhs.preferredContactType).append(genderId, rhs.genderId).append(suffix, rhs.suffix).append(officialLanguageCode, rhs.officialLanguageCode).append(phones, rhs.phones).append(healthCard, rhs.healthCard).append(title, rhs.title).append(email, rhs.email).append(additionalProperties, rhs.additionalProperties).append(relationshipStatusId, rhs.relationshipStatusId).append(nextKinPhone, rhs.nextKinPhone).append(addresses, rhs.addresses).append(firstName, rhs.firstName).isEquals();
    }

}
