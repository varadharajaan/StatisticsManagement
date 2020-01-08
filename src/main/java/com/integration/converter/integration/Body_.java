
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
    "sum",
    "max",
    "avg",
    "min",
    "count"
})
public class Body_ {

    @JsonProperty("sum")
    private String sum;
    @JsonProperty("max")
    private String max;
    @JsonProperty("avg")
    private String avg;
    @JsonProperty("min")
    private String min;
    @JsonProperty("count")
    private Integer count;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sum")
    public String getSum() {
        return sum;
    }

    @JsonProperty("sum")
    public void setSum(String sum) {
        this.sum = sum;
    }

    public Body_ withSum(String sum) {
        this.sum = sum;
        return this;
    }

    @JsonProperty("max")
    public String getMax() {
        return max;
    }

    @JsonProperty("max")
    public void setMax(String max) {
        this.max = max;
    }

    public Body_ withMax(String max) {
        this.max = max;
        return this;
    }

    @JsonProperty("avg")
    public String getAvg() {
        return avg;
    }

    @JsonProperty("avg")
    public void setAvg(String avg) {
        this.avg = avg;
    }

    public Body_ withAvg(String avg) {
        this.avg = avg;
        return this;
    }

    @JsonProperty("min")
    public String getMin() {
        return min;
    }

    @JsonProperty("min")
    public void setMin(String min) {
        this.min = min;
    }

    public Body_ withMin(String min) {
        this.min = min;
        return this;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public Body_ withCount(Integer count) {
        this.count = count;
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

    public Body_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sum).append(max).append(avg).append(min).append(count).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Body_) == false) {
            return false;
        }
        Body_ rhs = ((Body_) other);
        return new EqualsBuilder().append(sum, rhs.sum).append(max, rhs.max).append(avg, rhs.avg).append(min, rhs.min).append(count, rhs.count).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
