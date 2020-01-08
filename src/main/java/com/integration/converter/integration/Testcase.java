
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
    "testCaseId",
    "description",
    "request",
    "response"
})
public class Testcase {

    @JsonProperty("testCaseId")
    private String testCaseId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("request")
    private Request request;
    @JsonProperty("response")
    private Response response;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("testCaseId")
    public String getTestCaseId() {
        return testCaseId;
    }

    @JsonProperty("testCaseId")
    public void setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
    }

    public Testcase withTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Testcase withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("request")
    public Request getRequest() {
        return request;
    }

    @JsonProperty("request")
    public void setRequest(Request request) {
        this.request = request;
    }

    public Testcase withRequest(Request request) {
        this.request = request;
        return this;
    }

    @JsonProperty("response")
    public Response getResponse() {
        return response;
    }

    @JsonProperty("response")
    public void setResponse(Response response) {
        this.response = response;
    }

    public Testcase withResponse(Response response) {
        this.response = response;
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

    public Testcase withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(testCaseId).append(description).append(request).append(response).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Testcase) == false) {
            return false;
        }
        Testcase rhs = ((Testcase) other);
        return new EqualsBuilder().append(testCaseId, rhs.testCaseId).append(description, rhs.description).append(request, rhs.request).append(response, rhs.response).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
