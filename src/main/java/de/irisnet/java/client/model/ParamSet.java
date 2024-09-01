/*
 * Irisnet API
 * Artificial Intelligence (AI) for image- and video-processing in real-time. This is an interactive documentation where you can quickly look up the endpoints and their schemas, while having the opportunity to try things out for yourself.  In the list below, you can see the available endpoints of the API, which can be expanded by clicking on them. Each expanded endpoint lists the request parameters (if available) and the request body (if available). The request body can list some example bodies and the schema, explaining each model in detail.  Additionally you'll find a 'Try it out' button that allows you to enter your custom parameters and custom body and execute that against the API. <b>Be sure to enter your license key to authorize the requests before using this documentation interactively.</b>  The responses section in the expanded endpoint lists the possible responses with their corresponding status codes. If you've executed an API call it will also show you the response from the server.  Underneath the endpoints you'll find the model schemas. These are the models used for the requests and responses. If you click on the right arrow, you can expand the model and get a description of the model and the model parameters. For nested models, you can keep clicking the right arrow for further details.  Clicking the link below the title at the top of this page opens the [OpenAPI specification](https://swagger.io/specification/) (OAS3) in JSON format. The OAS3 Spec allows the generation of clients in many programming languages. There are several free client generators available that can be used to get started easily.
 *
 * The version of the OpenAPI document: v2
 * Contact: info@irisnet.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.irisnet.java.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.irisnet.java.client.model.Param;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.irisnet.java.JSON;

/**
 * A set of parameters/rules that describe how the AI should behave.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class ParamSet {
  public static final String SERIALIZED_NAME_THRESH = "thresh";
  @SerializedName(SERIALIZED_NAME_THRESH)
  private Float thresh = 0.5f;

  public static final String SERIALIZED_NAME_GREY = "grey";
  @SerializedName(SERIALIZED_NAME_GREY)
  private Integer grey = 127;

  public static final String SERIALIZED_NAME_MIN_DURATION = "minDuration";
  @SerializedName(SERIALIZED_NAME_MIN_DURATION)
  private Integer minDuration = 100;

  public static final String SERIALIZED_NAME_ABORT_ON_SEVERITY = "abortOnSeverity";
  @SerializedName(SERIALIZED_NAME_ABORT_ON_SEVERITY)
  private Integer abortOnSeverity = -1;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<Param> params = new ArrayList<>();

  public ParamSet() {
  }

  public ParamSet thresh(Float thresh) {
    this.thresh = thresh;
    return this;
  }

  /**
   * Threshold when an object can be recognized. Lowering the value will increase the probability of recognizing objects. A threshold of 0.5 would mean, that 50% of an object like a face must be visible, to be detected.Setting the value too low however, can cause false positives.
   * minimum: 0.0
   * maximum: 1.0
   * @return thresh
   */
  @javax.annotation.Nullable
  public Float getThresh() {
    return thresh;
  }

  public void setThresh(Float thresh) {
    this.thresh = thresh;
  }


  public ParamSet grey(Integer grey) {
    this.grey = grey;
    return this;
  }

  /**
   * A grey scale color to use for frame or masking. &#39;0&#39; will represent black, while the maximum &#39;255&#39; will be white.
   * minimum: 0
   * maximum: 255
   * @return grey
   */
  @javax.annotation.Nullable
  public Integer getGrey() {
    return grey;
  }

  public void setGrey(Integer grey) {
    this.grey = grey;
  }


  public ParamSet minDuration(Integer minDuration) {
    this.minDuration = minDuration;
    return this;
  }

  /**
   * Set the overall minimum duration in milliseconds for a rule to be broken in moving images.
   * minimum: 50
   * maximum: 250
   * @return minDuration
   */
  @javax.annotation.Nullable
  public Integer getMinDuration() {
    return minDuration;
  }

  public void setMinDuration(Integer minDuration) {
    this.minDuration = minDuration;
  }


  public ParamSet abortOnSeverity(Integer abortOnSeverity) {
    this.abortOnSeverity = abortOnSeverity;
    return this;
  }

  /**
   * Set a severity on which to automatically stop the check operation. Works with moving images.Use &#39;-1&#39; to ignore this option.
   * minimum: -1
   * @return abortOnSeverity
   */
  @javax.annotation.Nullable
  public Integer getAbortOnSeverity() {
    return abortOnSeverity;
  }

  public void setAbortOnSeverity(Integer abortOnSeverity) {
    this.abortOnSeverity = abortOnSeverity;
  }


  public ParamSet params(List<Param> params) {
    this.params = params;
    return this;
  }

  public ParamSet addParamsItem(Param paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<>();
    }
    this.params.add(paramsItem);
    return this;
  }

  /**
   * A list of parameter sets that describe the rules of the objects.
   * @return params
   */
  @javax.annotation.Nullable
  public List<Param> getParams() {
    return params;
  }

  public void setParams(List<Param> params) {
    this.params = params;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParamSet paramSet = (ParamSet) o;
    return Objects.equals(this.thresh, paramSet.thresh) &&
        Objects.equals(this.grey, paramSet.grey) &&
        Objects.equals(this.minDuration, paramSet.minDuration) &&
        Objects.equals(this.abortOnSeverity, paramSet.abortOnSeverity) &&
        Objects.equals(this.params, paramSet.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thresh, grey, minDuration, abortOnSeverity, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParamSet {\n");
    sb.append("    thresh: ").append(toIndentedString(thresh)).append("\n");
    sb.append("    grey: ").append(toIndentedString(grey)).append("\n");
    sb.append("    minDuration: ").append(toIndentedString(minDuration)).append("\n");
    sb.append("    abortOnSeverity: ").append(toIndentedString(abortOnSeverity)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("thresh");
    openapiFields.add("grey");
    openapiFields.add("minDuration");
    openapiFields.add("abortOnSeverity");
    openapiFields.add("params");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ParamSet
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ParamSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParamSet is not found in the empty JSON string", ParamSet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ParamSet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ParamSet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("params") != null && !jsonObj.get("params").isJsonNull()) {
        JsonArray jsonArrayparams = jsonObj.getAsJsonArray("params");
        if (jsonArrayparams != null) {
          // ensure the json data is an array
          if (!jsonObj.get("params").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `params` to be an array in the JSON string but got `%s`", jsonObj.get("params").toString()));
          }

          // validate the optional field `params` (array)
          for (int i = 0; i < jsonArrayparams.size(); i++) {
            Param.validateJsonElement(jsonArrayparams.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParamSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParamSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParamSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParamSet.class));

       return (TypeAdapter<T>) new TypeAdapter<ParamSet>() {
           @Override
           public void write(JsonWriter out, ParamSet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParamSet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ParamSet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ParamSet
   * @throws IOException if the JSON string is invalid with respect to ParamSet
   */
  public static ParamSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParamSet.class);
  }

  /**
   * Convert an instance of ParamSet to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

