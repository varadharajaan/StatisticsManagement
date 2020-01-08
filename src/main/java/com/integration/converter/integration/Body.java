
package com.integration.converter.integration;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_timestampOffset",
    "amount"
})
public class Body {

    @JsonProperty("_timestampOffset")
    private Integer timestampOffset;
    @JsonProperty("amount")
    private String amount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_timestampOffset")
    public Integer getTimestampOffset() {
        return timestampOffset;
    }

    @JsonProperty("_timestampOffset")
    public void setTimestampOffset(Integer timestampOffset) {
        this.timestampOffset = timestampOffset;
    }

    public Body withTimestampOffset(Integer timestampOffset) {
        this.timestampOffset = timestampOffset;
        return this;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Body withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Body withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timestampOffset).append(amount).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Body) == false) {
            return false;
        }
        Body rhs = ((Body) other);
        return new EqualsBuilder().append(timestampOffset, rhs.timestampOffset).append(amount, rhs.amount).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
