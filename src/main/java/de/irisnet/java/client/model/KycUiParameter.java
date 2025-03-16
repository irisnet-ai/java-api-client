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
 * A collection of parameters that determine the appearance and behaviour of the user interface (UI).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class KycUiParameter {
  public static final String SERIALIZED_NAME_PRIMARY_COLOR = "primaryColor";
  @SerializedName(SERIALIZED_NAME_PRIMARY_COLOR)
  @javax.annotation.Nullable
  private String primaryColor = "57a632";

  public static final String SERIALIZED_NAME_BACKGROUND_COLOR = "backgroundColor";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_COLOR)
  @javax.annotation.Nullable
  private String backgroundColor = "000000";

  public static final String SERIALIZED_NAME_TEXT_COLOR = "textColor";
  @SerializedName(SERIALIZED_NAME_TEXT_COLOR)
  @javax.annotation.Nullable
  private String textColor = "ffffff";

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  @javax.annotation.Nullable
  private String logo;

  public KycUiParameter() {
  }

  public KycUiParameter primaryColor(@javax.annotation.Nullable String primaryColor) {
    this.primaryColor = primaryColor;
    return this;
  }

  /**
   * The primary color of the UI in hex format (rrggbb).
   * @return primaryColor
   */
  @javax.annotation.Nullable
  public String getPrimaryColor() {
    return primaryColor;
  }

  public void setPrimaryColor(@javax.annotation.Nullable String primaryColor) {
    this.primaryColor = primaryColor;
  }


  public KycUiParameter backgroundColor(@javax.annotation.Nullable String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * The background color of the UI in hex format (rrggbb).
   * @return backgroundColor
   */
  @javax.annotation.Nullable
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(@javax.annotation.Nullable String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  public KycUiParameter textColor(@javax.annotation.Nullable String textColor) {
    this.textColor = textColor;
    return this;
  }

  /**
   * The text color of the UI in hex format (rrggbb).
   * @return textColor
   */
  @javax.annotation.Nullable
  public String getTextColor() {
    return textColor;
  }

  public void setTextColor(@javax.annotation.Nullable String textColor) {
    this.textColor = textColor;
  }


  public KycUiParameter logo(@javax.annotation.Nullable String logo) {
    this.logo = logo;
    return this;
  }

  /**
   * The company logo for the UI in PNG fileformat (512 px * 512 px) as a base64 encoded string.
   * @return logo
   */
  @javax.annotation.Nullable
  public String getLogo() {
    return logo;
  }

  public void setLogo(@javax.annotation.Nullable String logo) {
    this.logo = logo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KycUiParameter kycUiParameter = (KycUiParameter) o;
    return Objects.equals(this.primaryColor, kycUiParameter.primaryColor) &&
        Objects.equals(this.backgroundColor, kycUiParameter.backgroundColor) &&
        Objects.equals(this.textColor, kycUiParameter.textColor) &&
        Objects.equals(this.logo, kycUiParameter.logo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryColor, backgroundColor, textColor, logo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KycUiParameter {\n");
    sb.append("    primaryColor: ").append(toIndentedString(primaryColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
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
    openapiFields.add("primaryColor");
    openapiFields.add("backgroundColor");
    openapiFields.add("textColor");
    openapiFields.add("logo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to KycUiParameter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KycUiParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KycUiParameter is not found in the empty JSON string", KycUiParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!KycUiParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KycUiParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("primaryColor") != null && !jsonObj.get("primaryColor").isJsonNull()) && !jsonObj.get("primaryColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryColor").toString()));
      }
      if ((jsonObj.get("backgroundColor") != null && !jsonObj.get("backgroundColor").isJsonNull()) && !jsonObj.get("backgroundColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backgroundColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backgroundColor").toString()));
      }
      if ((jsonObj.get("textColor") != null && !jsonObj.get("textColor").isJsonNull()) && !jsonObj.get("textColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `textColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("textColor").toString()));
      }
      if ((jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KycUiParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KycUiParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KycUiParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KycUiParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<KycUiParameter>() {
           @Override
           public void write(JsonWriter out, KycUiParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KycUiParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of KycUiParameter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KycUiParameter
   * @throws IOException if the JSON string is invalid with respect to KycUiParameter
   */
  public static KycUiParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KycUiParameter.class);
  }

  /**
   * Convert an instance of KycUiParameter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

