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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import de.irisnet.java.JSON;

/**
 * Describes an event that lead to a broken rule.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Event {
  public static final String SERIALIZED_NAME_CLASSIFICATION = "classification";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION)
  private String classification;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Float start;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Float duration;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Integer severity;

  public Event() {
  }

  public Event classification(String classification) {
    
    this.classification = classification;
    return this;
  }

   /**
   * The classification of the recognized object.
   * @return classification
  **/
  @javax.annotation.Nullable

  public String getClassification() {
    return classification;
  }


  public void setClassification(String classification) {
    this.classification = classification;
  }


  public Event group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * The group of the classification.
   * @return group
  **/
  @javax.annotation.Nullable

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public Event start(Float start) {
    
    this.start = start;
    return this;
  }

   /**
   * The start in seconds where the classification object is found.
   * @return start
  **/
  @javax.annotation.Nullable

  public Float getStart() {
    return start;
  }


  public void setStart(Float start) {
    this.start = start;
  }


  public Event duration(Float duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * The duration of the event in seconds until the classification object is no longer in frame. The current event is ongoing if the duration is not set.
   * @return duration
  **/
  @javax.annotation.Nullable

  public Float getDuration() {
    return duration;
  }


  public void setDuration(Float duration) {
    this.duration = duration;
  }


  public Event severity(Integer severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * The severity of the classification object set while configuring the AI.
   * @return severity
  **/
  @javax.annotation.Nullable

  public Integer getSeverity() {
    return severity;
  }


  public void setSeverity(Integer severity) {
    this.severity = severity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.classification, event.classification) &&
        Objects.equals(this.group, event.group) &&
        Objects.equals(this.start, event.start) &&
        Objects.equals(this.duration, event.duration) &&
        Objects.equals(this.severity, event.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification, group, start, duration, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
    openapiFields.add("classification");
    openapiFields.add("group");
    openapiFields.add("start");
    openapiFields.add("duration");
    openapiFields.add("severity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Event
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Event.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Event is not found in the empty JSON string", Event.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Event.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Event` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("classification") != null && !jsonObj.get("classification").isJsonNull()) && !jsonObj.get("classification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classification").toString()));
      }
      if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Event.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Event' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Event> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Event.class));

       return (TypeAdapter<T>) new TypeAdapter<Event>() {
           @Override
           public void write(JsonWriter out, Event value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Event read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Event given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Event
  * @throws IOException if the JSON string is invalid with respect to Event
  */
  public static Event fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Event.class);
  }

 /**
  * Convert an instance of Event to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

