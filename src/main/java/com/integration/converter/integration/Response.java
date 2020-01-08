
package com.integration.converter.integration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "status_code",
    "headers",
    "body"
})
public class Response {

    @JsonProperty("status_code")
    private Integer statusCode;
    @JsonProperty("headers")
    private Headers_ headers;
    @JsonProperty("body")
    private List<Body_> body = new ArrayList<Body_>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status_code")
    public Integer getStatusCode() {
        return statusCode;
    }

    @JsonProperty("status_code")
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Response withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    @JsonProperty("headers")
    public Headers_ getHeaders() {
        return headers;
    }

    @JsonProperty("headers")
    public void setHeaders(Headers_ headers) {
        this.headers = headers;
    }

    public Response withHeaders(Headers_ headers) {
        this.headers = headers;
        return this;
    }

    @JsonProperty("body")
    public List<Body_> getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(List<Body_> body) {
        this.body = body;
    }

    public Response withBody(List<Body_> body) {
        this.body = body;
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

    public Response withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(statusCode).append(headers).append(body).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Response) == false) {
            return false;
        }
        Response rhs = ((Response) other);
        return new EqualsBuilder().append(statusCode, rhs.statusCode).append(headers, rhs.headers).append(body, rhs.body).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
