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
import java.io.IOException;
import java.util.Arrays;

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
 * Attributes qualifying the _ageEstimation_ classification.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class AgeEstimationAttribute {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private Integer age;

  public static final String SERIALIZED_NAME_AGE_MIN = "ageMin";
  @SerializedName(SERIALIZED_NAME_AGE_MIN)
  private Integer ageMin;

  public static final String SERIALIZED_NAME_AGE_MAX = "ageMax";
  @SerializedName(SERIALIZED_NAME_AGE_MAX)
  private Integer ageMax;

  public AgeEstimationAttribute() {
  }

  public AgeEstimationAttribute type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Used as a type discriminator for json to object conversion.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public AgeEstimationAttribute age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * The estimated age of the person in the selfie in years.
   * @return age
   */
  @javax.annotation.Nullable
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }


  public AgeEstimationAttribute ageMin(Integer ageMin) {
    this.ageMin = ageMin;
    return this;
  }

  /**
   * The estimated minimum age of the person in the selfie in years.
   * @return ageMin
   */
  @javax.annotation.Nullable
  public Integer getAgeMin() {
    return ageMin;
  }

  public void setAgeMin(Integer ageMin) {
    this.ageMin = ageMin;
  }


  public AgeEstimationAttribute ageMax(Integer ageMax) {
    this.ageMax = ageMax;
    return this;
  }

  /**
   * The estimated maximum age of the person in the selfie in years.
   * @return ageMax
   */
  @javax.annotation.Nullable
  public Integer getAgeMax() {
    return ageMax;
  }

  public void setAgeMax(Integer ageMax) {
    this.ageMax = ageMax;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeEstimationAttribute ageEstimationAttribute = (AgeEstimationAttribute) o;
    return Objects.equals(this.type, ageEstimationAttribute.type) &&
        Objects.equals(this.age, ageEstimationAttribute.age) &&
        Objects.equals(this.ageMin, ageEstimationAttribute.ageMin) &&
        Objects.equals(this.ageMax, ageEstimationAttribute.ageMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, age, ageMin, ageMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeEstimationAttribute {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    ageMin: ").append(toIndentedString(ageMin)).append("\n");
    sb.append("    ageMax: ").append(toIndentedString(ageMax)).append("\n");
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
    openapiFields.add("age");
    openapiFields.add("ageMin");
    openapiFields.add("ageMax");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AgeEstimationAttribute
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AgeEstimationAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgeEstimationAttribute is not found in the empty JSON string", AgeEstimationAttribute.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AgeEstimationAttribute.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgeEstimationAttribute` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgeEstimationAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgeEstimationAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgeEstimationAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgeEstimationAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<AgeEstimationAttribute>() {
           @Override
           public void write(JsonWriter out, AgeEstimationAttribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgeEstimationAttribute read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AgeEstimationAttribute given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AgeEstimationAttribute
   * @throws IOException if the JSON string is invalid with respect to AgeEstimationAttribute
   */
  public static AgeEstimationAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgeEstimationAttribute.class);
  }

  /**
   * Convert an instance of AgeEstimationAttribute to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

