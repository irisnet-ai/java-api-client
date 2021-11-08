/*
 * Irisnet API
 * Artificial Intelligence (AI) for image- and video-processing in realtime. This is an interactive documentation meant to give a place were you can quickly look up the endpoints and their schemas, while also giving you the option to try things out yourself.  Listed below you'll see the available endpoints of the API that can be expanded by clicking on it. Each expanded endpoint lists the request parameter (if available) and the request body (if available). The request body can list some example bodies and the schema, explaining each model in detail. Additionally you'll find a 'Try it out' button where you can type in your custom parameters and custom body and execute that against the API. The responses section in the expanded endpoint lists the possible responses with their corresponding status codes. If you've executed an API call it will also show you the response from the server.  Underneath the endpoints you'll find the model schemas. These are the models used for the requests and responses. By clicking on the right arrow you can expand the model and it will show you a description of the model and the model parameters. For nested models you can keep clicking the right arrow to reveal further details on it.  
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.irisnet.java.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describes the rules applied and the count of objects found for the given classification.
 */
@ApiModel(description = "Describes the rules applied and the count of objects found for the given classification.")

public class INRule {
  public static final String SERIALIZED_NAME_IN_CLASS = "inClass";
  @SerializedName(SERIALIZED_NAME_IN_CLASS)
  private String inClass;

  public static final String SERIALIZED_NAME_IN_GROUP = "inGroup";
  @SerializedName(SERIALIZED_NAME_IN_GROUP)
  private String inGroup;

  public static final String SERIALIZED_NAME_FOUND = "found";
  @SerializedName(SERIALIZED_NAME_FOUND)
  private Integer found;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Integer min;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Integer max;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Integer severity;


  public INRule inClass(String inClass) {
    
    this.inClass = inClass;
    return this;
  }

   /**
   * The classification of the recognized object.
   * @return inClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "face", value = "The classification of the recognized object.")

  public String getInClass() {
    return inClass;
  }


  public void setInClass(String inClass) {
    this.inClass = inClass;
  }


  public INRule inGroup(String inGroup) {
    
    this.inGroup = inGroup;
    return this;
  }

   /**
   * The group of the classification.
   * @return inGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "human", value = "The group of the classification.")

  public String getInGroup() {
    return inGroup;
  }


  public void setInGroup(String inGroup) {
    this.inGroup = inGroup;
  }


  public INRule found(Integer found) {
    
    this.found = found;
    return this;
  }

   /**
   * The count of how many instances of the classification object were found.
   * @return found
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The count of how many instances of the classification object were found.")

  public Integer getFound() {
    return found;
  }


  public void setFound(Integer found) {
    this.found = found;
  }


  public INRule min(Integer min) {
    
    this.min = min;
    return this;
  }

   /**
   * The minimum allowed instances of the classification object.
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The minimum allowed instances of the classification object.")

  public Integer getMin() {
    return min;
  }


  public void setMin(Integer min) {
    this.min = min;
  }


  public INRule max(Integer max) {
    
    this.max = max;
    return this;
  }

   /**
   * The maximum allowed instances of the classification object.
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The maximum allowed instances of the classification object.")

  public Integer getMax() {
    return max;
  }


  public void setMax(Integer max) {
    this.max = max;
  }


  public INRule severity(Integer severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * The severity of the classification object set while configuring the AI.
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "The severity of the classification object set while configuring the AI.")

  public Integer getSeverity() {
    return severity;
  }


  public void setSeverity(Integer severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    INRule inRule = (INRule) o;
    return Objects.equals(this.inClass, inRule.inClass) &&
        Objects.equals(this.inGroup, inRule.inGroup) &&
        Objects.equals(this.found, inRule.found) &&
        Objects.equals(this.min, inRule.min) &&
        Objects.equals(this.max, inRule.max) &&
        Objects.equals(this.severity, inRule.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inClass, inGroup, found, min, max, severity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class INRule {\n");
    sb.append("    inClass: ").append(toIndentedString(inClass)).append("\n");
    sb.append("    inGroup: ").append(toIndentedString(inGroup)).append("\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

