/*
 * Irisnet API
 * Artificial Intelligence (AI) for image- and video-processing in realtime. This is an interactive documentation meant to give a place were you can quickly look up the endpoints and their schemas, while also giving you the option to try things out yourself.  Listed below you'll see the available endpoints of the API that can be expanded by clicking on it. Each expanded endpoint lists the request parameter (if available) and the request body (if available). The request body can list some example bodies and the schema, explaining each model in detail. Additionally you'll find a 'Try it out' button where you can type in your custom parameters and custom body and execute that against the API. The responses section in the expanded endpoint lists the possible responses with their corresponding status codes. If you've executed an API call it will also show you the response from the server.  Underneath the endpoints you'll find the model schemas. These are the models used for the requests and responses.By clicking on the right arrow you can expand the model and it will show you a description of the model and the model parameters. For nested models you can keep clicking the right arrow to reveal further details on it.  
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
 * An element that defines some overall defaults if needed. These will be applied on every parameter set. Single parameters can be still overwritten by their respective attributes within the &#39;inParam&#39; element.
 */
@ApiModel(description = "An element that defines some overall defaults if needed. These will be applied on every parameter set. Single parameters can be still overwritten by their respective attributes within the 'inParam' element.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-03T16:53:53.323Z[Etc/UTC]")
public class INDefault {
  public static final String SERIALIZED_NAME_THRESH = "thresh";
  @SerializedName(SERIALIZED_NAME_THRESH)
  private Float thresh = 0.5f;

  public static final String SERIALIZED_NAME_GREY = "grey";
  @SerializedName(SERIALIZED_NAME_GREY)
  private Integer grey = 127;


  public INDefault thresh(Float thresh) {
    
    this.thresh = thresh;
    return this;
  }

   /**
   * Threshold when an object can be recognized. Lowering the value will increase the probability of recognizing objects. A threshhold of 0.5 would mean, that 50% of an object like a face must be visible, to be detected.Setting the value too low however, can cause false positives.
   * minimum: 0.0
   * maximum: 1.0
   * @return thresh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Threshold when an object can be recognized. Lowering the value will increase the probability of recognizing objects. A threshhold of 0.5 would mean, that 50% of an object like a face must be visible, to be detected.Setting the value too low however, can cause false positives.")

  public Float getThresh() {
    return thresh;
  }


  public void setThresh(Float thresh) {
    this.thresh = thresh;
  }


  public INDefault grey(Integer grey) {
    
    this.grey = grey;
    return this;
  }

   /**
   * A grey scale color to use for frame or masking. &#39;0&#39; will represent black, while the maximum &#39;255&#39; will be white.
   * minimum: 0
   * maximum: 255
   * @return grey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A grey scale color to use for frame or masking. '0' will represent black, while the maximum '255' will be white.")

  public Integer getGrey() {
    return grey;
  }


  public void setGrey(Integer grey) {
    this.grey = grey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    INDefault inDefault = (INDefault) o;
    return Objects.equals(this.thresh, inDefault.thresh) &&
        Objects.equals(this.grey, inDefault.grey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thresh, grey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class INDefault {\n");
    sb.append("    thresh: ").append(toIndentedString(thresh)).append("\n");
    sb.append("    grey: ").append(toIndentedString(grey)).append("\n");
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

