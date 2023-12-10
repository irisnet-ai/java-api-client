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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.irisnet.java.JSON;

/**
 * Attributes qualifying the _hair_ classification.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HairAttribute {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  /**
   * The color of the hair.
   */
  @JsonAdapter(ColorEnum.Adapter.class)
  public enum ColorEnum {
    BLACK("black"),
    
    BROWN("brown"),
    
    BLONDE("blonde"),
    
    GREY("grey"),
    
    RED("red"),
    
    OTHER("other");

    private String value;

    ColorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ColorEnum fromValue(String value) {
      for (ColorEnum b : ColorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ColorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ColorEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ColorEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private ColorEnum color;

  /**
   * The hair style.
   */
  @JsonAdapter(StyleEnum.Adapter.class)
  public enum StyleEnum {
    LONGHAIRED("longHaired"),
    
    SHORTHAIRED("shortHaired");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StyleEnum fromValue(String value) {
      for (StyleEnum b : StyleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StyleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StyleEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StyleEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STYLE = "style";
  @SerializedName(SERIALIZED_NAME_STYLE)
  private StyleEnum style;

  public HairAttribute() {
  }

  public HairAttribute type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Used as a type discriminator for json to object conversion.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public HairAttribute color(ColorEnum color) {
    
    this.color = color;
    return this;
  }

   /**
   * The color of the hair.
   * @return color
  **/
  @javax.annotation.Nullable
  public ColorEnum getColor() {
    return color;
  }


  public void setColor(ColorEnum color) {
    this.color = color;
  }


  public HairAttribute style(StyleEnum style) {
    
    this.style = style;
    return this;
  }

   /**
   * The hair style.
   * @return style
  **/
  @javax.annotation.Nullable
  public StyleEnum getStyle() {
    return style;
  }


  public void setStyle(StyleEnum style) {
    this.style = style;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HairAttribute hairAttribute = (HairAttribute) o;
    return Objects.equals(this.type, hairAttribute.type) &&
        Objects.equals(this.color, hairAttribute.color) &&
        Objects.equals(this.style, hairAttribute.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, color, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HairAttribute {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
    openapiFields.add("color");
    openapiFields.add("style");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HairAttribute
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HairAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HairAttribute is not found in the empty JSON string", HairAttribute.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HairAttribute.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HairAttribute` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      // validate the optional field `color`
      if (jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) {
        ColorEnum.validateJsonElement(jsonObj.get("color"));
      }
      if ((jsonObj.get("style") != null && !jsonObj.get("style").isJsonNull()) && !jsonObj.get("style").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `style` to be a primitive type in the JSON string but got `%s`", jsonObj.get("style").toString()));
      }
      // validate the optional field `style`
      if (jsonObj.get("style") != null && !jsonObj.get("style").isJsonNull()) {
        StyleEnum.validateJsonElement(jsonObj.get("style"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HairAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HairAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HairAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HairAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<HairAttribute>() {
           @Override
           public void write(JsonWriter out, HairAttribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HairAttribute read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HairAttribute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HairAttribute
  * @throws IOException if the JSON string is invalid with respect to HairAttribute
  */
  public static HairAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HairAttribute.class);
  }

 /**
  * Convert an instance of HairAttribute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

