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
import java.util.HashMap;
import java.util.Map;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import de.irisnet.java.JSON;

/**
 * Describes the current balance of the given license key. A key has a certain amount of credits that can be used for any kind of AI recognition. The license key is invalid, when all of the credits have been used, the license was disabled or expired.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LicenseInfo {
  public static final String SERIALIZED_NAME_CREDITS_USED = "creditsUsed";
  @SerializedName(SERIALIZED_NAME_CREDITS_USED)
  private Integer creditsUsed;

  public static final String SERIALIZED_NAME_CREDITS_REMAINING = "creditsRemaining";
  @SerializedName(SERIALIZED_NAME_CREDITS_REMAINING)
  private Integer creditsRemaining;

  public static final String SERIALIZED_NAME_TOTAL_CREDITS = "totalCredits";
  @SerializedName(SERIALIZED_NAME_TOTAL_CREDITS)
  private Integer totalCredits;

  public static final String SERIALIZED_NAME_LICENSE_KEY = "licenseKey";
  @SerializedName(SERIALIZED_NAME_LICENSE_KEY)
  private String licenseKey;

  public static final String SERIALIZED_NAME_PRIVILEGES = "privileges";
  @SerializedName(SERIALIZED_NAME_PRIVILEGES)
  private Map<String, String> privileges = new HashMap<>();

  public LicenseInfo() {
  }

  public LicenseInfo creditsUsed(Integer creditsUsed) {
    
    this.creditsUsed = creditsUsed;
    return this;
  }

   /**
   * Credits used for the license key.
   * @return creditsUsed
  **/
  @javax.annotation.Nullable
  public Integer getCreditsUsed() {
    return creditsUsed;
  }


  public void setCreditsUsed(Integer creditsUsed) {
    this.creditsUsed = creditsUsed;
  }


  public LicenseInfo creditsRemaining(Integer creditsRemaining) {
    
    this.creditsRemaining = creditsRemaining;
    return this;
  }

   /**
   * Credits remaining for the license key.
   * @return creditsRemaining
  **/
  @javax.annotation.Nullable
  public Integer getCreditsRemaining() {
    return creditsRemaining;
  }


  public void setCreditsRemaining(Integer creditsRemaining) {
    this.creditsRemaining = creditsRemaining;
  }


  public LicenseInfo totalCredits(Integer totalCredits) {
    
    this.totalCredits = totalCredits;
    return this;
  }

   /**
   * Total credits contained within the license key.
   * @return totalCredits
  **/
  @javax.annotation.Nullable
  public Integer getTotalCredits() {
    return totalCredits;
  }


  public void setTotalCredits(Integer totalCredits) {
    this.totalCredits = totalCredits;
  }


  public LicenseInfo licenseKey(String licenseKey) {
    
    this.licenseKey = licenseKey;
    return this;
  }

   /**
   * The license key
   * @return licenseKey
  **/
  @javax.annotation.Nullable
  public String getLicenseKey() {
    return licenseKey;
  }


  public void setLicenseKey(String licenseKey) {
    this.licenseKey = licenseKey;
  }


  public LicenseInfo privileges(Map<String, String> privileges) {
    
    this.privileges = privileges;
    return this;
  }

  public LicenseInfo putPrivilegesItem(String key, String privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new HashMap<>();
    }
    this.privileges.put(key, privilegesItem);
    return this;
  }

   /**
   * A map of privileges
   * @return privileges
  **/
  @javax.annotation.Nullable
  public Map<String, String> getPrivileges() {
    return privileges;
  }


  public void setPrivileges(Map<String, String> privileges) {
    this.privileges = privileges;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseInfo licenseInfo = (LicenseInfo) o;
    return Objects.equals(this.creditsUsed, licenseInfo.creditsUsed) &&
        Objects.equals(this.creditsRemaining, licenseInfo.creditsRemaining) &&
        Objects.equals(this.totalCredits, licenseInfo.totalCredits) &&
        Objects.equals(this.licenseKey, licenseInfo.licenseKey) &&
        Objects.equals(this.privileges, licenseInfo.privileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditsUsed, creditsRemaining, totalCredits, licenseKey, privileges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseInfo {\n");
    sb.append("    creditsUsed: ").append(toIndentedString(creditsUsed)).append("\n");
    sb.append("    creditsRemaining: ").append(toIndentedString(creditsRemaining)).append("\n");
    sb.append("    totalCredits: ").append(toIndentedString(totalCredits)).append("\n");
    sb.append("    licenseKey: ").append(toIndentedString(licenseKey)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
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
    openapiFields.add("creditsUsed");
    openapiFields.add("creditsRemaining");
    openapiFields.add("totalCredits");
    openapiFields.add("licenseKey");
    openapiFields.add("privileges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LicenseInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LicenseInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LicenseInfo is not found in the empty JSON string", LicenseInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LicenseInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LicenseInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("licenseKey") != null && !jsonObj.get("licenseKey").isJsonNull()) && !jsonObj.get("licenseKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `licenseKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("licenseKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LicenseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LicenseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LicenseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LicenseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<LicenseInfo>() {
           @Override
           public void write(JsonWriter out, LicenseInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LicenseInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LicenseInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LicenseInfo
  * @throws IOException if the JSON string is invalid with respect to LicenseInfo
  */
  public static LicenseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LicenseInfo.class);
  }

 /**
  * Convert an instance of LicenseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

