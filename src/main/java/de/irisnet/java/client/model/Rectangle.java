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
import java.util.Map.Entry;
import java.util.Set;

import de.irisnet.java.JSON;

/**
 * Describes the bounds of a rectangle starting from the center.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Rectangle {
  public static final String SERIALIZED_NAME_X0 = "x0";
  @SerializedName(SERIALIZED_NAME_X0)
  private Float x0;

  public static final String SERIALIZED_NAME_Y0 = "y0";
  @SerializedName(SERIALIZED_NAME_Y0)
  private Float y0;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Float width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Float height;

  public Rectangle() {
  }

  public Rectangle x0(Float x0) {
    
    this.x0 = x0;
    return this;
  }

   /**
   * The center of the rectangle in the horizontal (x) direction.
   * @return x0
  **/
  @javax.annotation.Nullable
  public Float getX0() {
    return x0;
  }


  public void setX0(Float x0) {
    this.x0 = x0;
  }


  public Rectangle y0(Float y0) {
    
    this.y0 = y0;
    return this;
  }

   /**
   * The center of the rectangle in the vertical (y) direction.
   * @return y0
  **/
  @javax.annotation.Nullable
  public Float getY0() {
    return y0;
  }


  public void setY0(Float y0) {
    this.y0 = y0;
  }


  public Rectangle width(Float width) {
    
    this.width = width;
    return this;
  }

   /**
   * The total width of the rectangle in the horizontal (x) direction. Use _x0 - width / 2_ and _x0 + width / 2_ to get the left and right edges of the rectangle.
   * @return width
  **/
  @javax.annotation.Nullable
  public Float getWidth() {
    return width;
  }


  public void setWidth(Float width) {
    this.width = width;
  }


  public Rectangle height(Float height) {
    
    this.height = height;
    return this;
  }

   /**
   * The total height of the rectangle in the vertical (y) direction. Use _y0 - height / 2_ and _y0 + height / 2_ to get the top and bottom edges of the rectangle.
   * @return height
  **/
  @javax.annotation.Nullable
  public Float getHeight() {
    return height;
  }


  public void setHeight(Float height) {
    this.height = height;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rectangle rectangle = (Rectangle) o;
    return Objects.equals(this.x0, rectangle.x0) &&
        Objects.equals(this.y0, rectangle.y0) &&
        Objects.equals(this.width, rectangle.width) &&
        Objects.equals(this.height, rectangle.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x0, y0, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rectangle {\n");
    sb.append("    x0: ").append(toIndentedString(x0)).append("\n");
    sb.append("    y0: ").append(toIndentedString(y0)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
    openapiFields.add("x0");
    openapiFields.add("y0");
    openapiFields.add("width");
    openapiFields.add("height");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Rectangle
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Rectangle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Rectangle is not found in the empty JSON string", Rectangle.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Rectangle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Rectangle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Rectangle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Rectangle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Rectangle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Rectangle.class));

       return (TypeAdapter<T>) new TypeAdapter<Rectangle>() {
           @Override
           public void write(JsonWriter out, Rectangle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Rectangle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Rectangle given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Rectangle
  * @throws IOException if the JSON string is invalid with respect to Rectangle
  */
  public static Rectangle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Rectangle.class);
  }

 /**
  * Convert an instance of Rectangle to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

