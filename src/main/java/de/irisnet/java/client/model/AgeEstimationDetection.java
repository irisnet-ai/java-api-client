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
import de.irisnet.java.client.model.AgeEstimationAttribute;
import de.irisnet.java.client.model.AgeEstimationSubChecks;
import de.irisnet.java.client.model.BaseDetection;
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
 * Contains further characteristics particular to _ageEstimation_ detection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class AgeEstimationDetection extends BaseDetection {
  public static final String SERIALIZED_NAME_CHECK_ID = "checkId";
  @SerializedName(SERIALIZED_NAME_CHECK_ID)
  private String checkId;

  public static final String SERIALIZED_NAME_FACE_SIMILARITY = "faceSimilarity";
  @SerializedName(SERIALIZED_NAME_FACE_SIMILARITY)
  private Integer faceSimilarity;

  public static final String SERIALIZED_NAME_FACE_LIVENESS_CHECK_SCORE = "faceLivenessCheckScore";
  @SerializedName(SERIALIZED_NAME_FACE_LIVENESS_CHECK_SCORE)
  private Integer faceLivenessCheckScore;

  public static final String SERIALIZED_NAME_PROCESSED_CHECKS = "processedChecks";
  @SerializedName(SERIALIZED_NAME_PROCESSED_CHECKS)
  private AgeEstimationSubChecks processedChecks;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<AgeEstimationAttribute> attributes = new ArrayList<>();

  public AgeEstimationDetection() {
    this.type = this.getClass().getSimpleName();
  }

  public AgeEstimationDetection checkId(String checkId) {
    this.checkId = checkId;
    return this;
  }

  /**
   * The id of the check that lead to the detection
   * @return checkId
   */
  @javax.annotation.Nullable
  public String getCheckId() {
    return checkId;
  }

  public void setCheckId(String checkId) {
    this.checkId = checkId;
  }


  public AgeEstimationDetection faceSimilarity(Integer faceSimilarity) {
    this.faceSimilarity = faceSimilarity;
    return this;
  }

  /**
   * Indicates the similarity-level of whether two faces belong to the same person
   * @return faceSimilarity
   */
  @javax.annotation.Nullable
  public Integer getFaceSimilarity() {
    return faceSimilarity;
  }

  public void setFaceSimilarity(Integer faceSimilarity) {
    this.faceSimilarity = faceSimilarity;
  }


  public AgeEstimationDetection faceLivenessCheckScore(Integer faceLivenessCheckScore) {
    this.faceLivenessCheckScore = faceLivenessCheckScore;
    return this;
  }

  /**
   * Indicates the liveness score of the selfie image
   * @return faceLivenessCheckScore
   */
  @javax.annotation.Nullable
  public Integer getFaceLivenessCheckScore() {
    return faceLivenessCheckScore;
  }

  public void setFaceLivenessCheckScore(Integer faceLivenessCheckScore) {
    this.faceLivenessCheckScore = faceLivenessCheckScore;
  }


  public AgeEstimationDetection processedChecks(AgeEstimationSubChecks processedChecks) {
    this.processedChecks = processedChecks;
    return this;
  }

  /**
   * Get processedChecks
   * @return processedChecks
   */
  @javax.annotation.Nullable
  public AgeEstimationSubChecks getProcessedChecks() {
    return processedChecks;
  }

  public void setProcessedChecks(AgeEstimationSubChecks processedChecks) {
    this.processedChecks = processedChecks;
  }


  public AgeEstimationDetection attributes(List<AgeEstimationAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public AgeEstimationDetection addAttributesItem(AgeEstimationAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Attributes of the _idDocument_ detection.
   * @return attributes
   */
  @javax.annotation.Nullable
  public List<AgeEstimationAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AgeEstimationAttribute> attributes) {
    this.attributes = attributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeEstimationDetection ageEstimationDetection = (AgeEstimationDetection) o;
    return Objects.equals(this.checkId, ageEstimationDetection.checkId) &&
        Objects.equals(this.faceSimilarity, ageEstimationDetection.faceSimilarity) &&
        Objects.equals(this.faceLivenessCheckScore, ageEstimationDetection.faceLivenessCheckScore) &&
        Objects.equals(this.processedChecks, ageEstimationDetection.processedChecks) &&
        Objects.equals(this.attributes, ageEstimationDetection.attributes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkId, faceSimilarity, faceLivenessCheckScore, processedChecks, attributes, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeEstimationDetection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
    sb.append("    faceSimilarity: ").append(toIndentedString(faceSimilarity)).append("\n");
    sb.append("    faceLivenessCheckScore: ").append(toIndentedString(faceLivenessCheckScore)).append("\n");
    sb.append("    processedChecks: ").append(toIndentedString(processedChecks)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("attributes");
    openapiFields.add("subDetections");
    openapiFields.add("checkId");
    openapiFields.add("hasOfficialDocument");
    openapiFields.add("comparable");
    openapiFields.add("faceSimilarity");
    openapiFields.add("faceLivenessCheckScore");
    openapiFields.add("documentFrontLivenessScore");
    openapiFields.add("documentBackLivenessScore");
    openapiFields.add("processedChecks");
    openapiFields.add("documentHolderId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AgeEstimationDetection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AgeEstimationDetection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgeEstimationDetection is not found in the empty JSON string", AgeEstimationDetection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AgeEstimationDetection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgeEstimationDetection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AgeEstimationDetection.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgeEstimationDetection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgeEstimationDetection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgeEstimationDetection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgeEstimationDetection.class));

       return (TypeAdapter<T>) new TypeAdapter<AgeEstimationDetection>() {
           @Override
           public void write(JsonWriter out, AgeEstimationDetection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgeEstimationDetection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AgeEstimationDetection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AgeEstimationDetection
   * @throws IOException if the JSON string is invalid with respect to AgeEstimationDetection
   */
  public static AgeEstimationDetection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgeEstimationDetection.class);
  }

  /**
   * Convert an instance of AgeEstimationDetection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
