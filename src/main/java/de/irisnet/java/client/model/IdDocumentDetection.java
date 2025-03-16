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
import de.irisnet.java.client.model.Coordinates;
import de.irisnet.java.client.model.Detection;
import de.irisnet.java.client.model.IdDocumentAttribute;
import de.irisnet.java.client.model.IdDocumentSubChecks;
import de.irisnet.java.client.model.KnownFace;
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
 * Contains further characteristics particular to _idDocument_ detection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class IdDocumentDetection extends Detection {
  public static final String SERIALIZED_NAME_CLASSIFICATION = "classification";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION)
  @javax.annotation.Nullable
  private String classification;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  @javax.annotation.Nullable
  private String group;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";
  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  @javax.annotation.Nullable
  private Integer probability;

  public static final String SERIALIZED_NAME_COORDINATES = "coordinates";
  @SerializedName(SERIALIZED_NAME_COORDINATES)
  @javax.annotation.Nullable
  private Coordinates coordinates;

  public static final String SERIALIZED_NAME_CHECK_ID = "checkId";
  @SerializedName(SERIALIZED_NAME_CHECK_ID)
  @javax.annotation.Nullable
  private String checkId;

  public static final String SERIALIZED_NAME_HAS_OFFICIAL_DOCUMENT = "hasOfficialDocument";
  @SerializedName(SERIALIZED_NAME_HAS_OFFICIAL_DOCUMENT)
  @javax.annotation.Nullable
  private Boolean hasOfficialDocument;

  public static final String SERIALIZED_NAME_COMPARABLE = "comparable";
  @SerializedName(SERIALIZED_NAME_COMPARABLE)
  @javax.annotation.Nullable
  private Boolean comparable;

  public static final String SERIALIZED_NAME_FACE_SIMILARITY = "faceSimilarity";
  @SerializedName(SERIALIZED_NAME_FACE_SIMILARITY)
  @javax.annotation.Nullable
  private Integer faceSimilarity;

  public static final String SERIALIZED_NAME_FACE_LIVENESS_CHECK_SCORE = "faceLivenessCheckScore";
  @SerializedName(SERIALIZED_NAME_FACE_LIVENESS_CHECK_SCORE)
  @javax.annotation.Nullable
  private Integer faceLivenessCheckScore;

  public static final String SERIALIZED_NAME_DOCUMENT_FRONT_LIVENESS_SCORE = "documentFrontLivenessScore";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_FRONT_LIVENESS_SCORE)
  @javax.annotation.Nullable
  private Integer documentFrontLivenessScore;

  public static final String SERIALIZED_NAME_DOCUMENT_BACK_LIVENESS_SCORE = "documentBackLivenessScore";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_BACK_LIVENESS_SCORE)
  @javax.annotation.Nullable
  private Integer documentBackLivenessScore;

  public static final String SERIALIZED_NAME_PROCESSED_CHECKS = "processedChecks";
  @SerializedName(SERIALIZED_NAME_PROCESSED_CHECKS)
  @javax.annotation.Nullable
  private IdDocumentSubChecks processedChecks;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  @javax.annotation.Nullable
  private List<IdDocumentAttribute> attributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOCUMENT_HOLDER_ID = "documentHolderId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_HOLDER_ID)
  @javax.annotation.Nullable
  private String documentHolderId;

  public static final String SERIALIZED_NAME_KNOWN_FACES = "knownFaces";
  @SerializedName(SERIALIZED_NAME_KNOWN_FACES)
  @javax.annotation.Nullable
  private List<KnownFace> knownFaces = new ArrayList<>();

  public IdDocumentDetection() {
    this.type = this.getClass().getSimpleName();
  }

  public IdDocumentDetection classification(@javax.annotation.Nullable String classification) {
    this.classification = classification;
    return this;
  }

  /**
   * The classification of the recognized object.
   * @return classification
   */
  @javax.annotation.Nullable
  public String getClassification() {
    return classification;
  }

  public void setClassification(@javax.annotation.Nullable String classification) {
    this.classification = classification;
  }


  public IdDocumentDetection group(@javax.annotation.Nullable String group) {
    this.group = group;
    return this;
  }

  /**
   * The group of the classification.
   * @return group
   */
  @javax.annotation.Nullable
  public String getGroup() {
    return group;
  }

  public void setGroup(@javax.annotation.Nullable String group) {
    this.group = group;
  }


  public IdDocumentDetection id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the detection object.
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public IdDocumentDetection probability(@javax.annotation.Nullable Integer probability) {
    this.probability = probability;
    return this;
  }

  /**
   * The probability that the object found matches the classification.
   * @return probability
   */
  @javax.annotation.Nullable
  public Integer getProbability() {
    return probability;
  }

  public void setProbability(@javax.annotation.Nullable Integer probability) {
    this.probability = probability;
  }


  public IdDocumentDetection coordinates(@javax.annotation.Nullable Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  /**
   * Get coordinates
   * @return coordinates
   */
  @javax.annotation.Nullable
  public Coordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(@javax.annotation.Nullable Coordinates coordinates) {
    this.coordinates = coordinates;
  }


  public IdDocumentDetection checkId(@javax.annotation.Nullable String checkId) {
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

  public void setCheckId(@javax.annotation.Nullable String checkId) {
    this.checkId = checkId;
  }


  public IdDocumentDetection hasOfficialDocument(@javax.annotation.Nullable Boolean hasOfficialDocument) {
    this.hasOfficialDocument = hasOfficialDocument;
    return this;
  }

  /**
   * Indicates whether the identified document is official
   * @return hasOfficialDocument
   */
  @javax.annotation.Nullable
  public Boolean getHasOfficialDocument() {
    return hasOfficialDocument;
  }

  public void setHasOfficialDocument(@javax.annotation.Nullable Boolean hasOfficialDocument) {
    this.hasOfficialDocument = hasOfficialDocument;
  }


  public IdDocumentDetection comparable(@javax.annotation.Nullable Boolean comparable) {
    this.comparable = comparable;
    return this;
  }

  /**
   * Indicates whether the provided selfie-image is comparable to the document
   * @return comparable
   */
  @javax.annotation.Nullable
  public Boolean getComparable() {
    return comparable;
  }

  public void setComparable(@javax.annotation.Nullable Boolean comparable) {
    this.comparable = comparable;
  }


  public IdDocumentDetection faceSimilarity(@javax.annotation.Nullable Integer faceSimilarity) {
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

  public void setFaceSimilarity(@javax.annotation.Nullable Integer faceSimilarity) {
    this.faceSimilarity = faceSimilarity;
  }


  public IdDocumentDetection faceLivenessCheckScore(@javax.annotation.Nullable Integer faceLivenessCheckScore) {
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

  public void setFaceLivenessCheckScore(@javax.annotation.Nullable Integer faceLivenessCheckScore) {
    this.faceLivenessCheckScore = faceLivenessCheckScore;
  }


  public IdDocumentDetection documentFrontLivenessScore(@javax.annotation.Nullable Integer documentFrontLivenessScore) {
    this.documentFrontLivenessScore = documentFrontLivenessScore;
    return this;
  }

  /**
   * Indicates the liveness score of the front side image of the document
   * @return documentFrontLivenessScore
   */
  @javax.annotation.Nullable
  public Integer getDocumentFrontLivenessScore() {
    return documentFrontLivenessScore;
  }

  public void setDocumentFrontLivenessScore(@javax.annotation.Nullable Integer documentFrontLivenessScore) {
    this.documentFrontLivenessScore = documentFrontLivenessScore;
  }


  public IdDocumentDetection documentBackLivenessScore(@javax.annotation.Nullable Integer documentBackLivenessScore) {
    this.documentBackLivenessScore = documentBackLivenessScore;
    return this;
  }

  /**
   * Indicates the liveness score of the back side image of the document
   * @return documentBackLivenessScore
   */
  @javax.annotation.Nullable
  public Integer getDocumentBackLivenessScore() {
    return documentBackLivenessScore;
  }

  public void setDocumentBackLivenessScore(@javax.annotation.Nullable Integer documentBackLivenessScore) {
    this.documentBackLivenessScore = documentBackLivenessScore;
  }


  public IdDocumentDetection processedChecks(@javax.annotation.Nullable IdDocumentSubChecks processedChecks) {
    this.processedChecks = processedChecks;
    return this;
  }

  /**
   * Get processedChecks
   * @return processedChecks
   */
  @javax.annotation.Nullable
  public IdDocumentSubChecks getProcessedChecks() {
    return processedChecks;
  }

  public void setProcessedChecks(@javax.annotation.Nullable IdDocumentSubChecks processedChecks) {
    this.processedChecks = processedChecks;
  }


  public IdDocumentDetection attributes(@javax.annotation.Nullable List<IdDocumentAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public IdDocumentDetection addAttributesItem(IdDocumentAttribute attributesItem) {
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
  public List<IdDocumentAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(@javax.annotation.Nullable List<IdDocumentAttribute> attributes) {
    this.attributes = attributes;
  }


  public IdDocumentDetection documentHolderId(@javax.annotation.Nullable String documentHolderId) {
    this.documentHolderId = documentHolderId;
    return this;
  }

  /**
   * The id of the documentHolder
   * @return documentHolderId
   */
  @javax.annotation.Nullable
  public String getDocumentHolderId() {
    return documentHolderId;
  }

  public void setDocumentHolderId(@javax.annotation.Nullable String documentHolderId) {
    this.documentHolderId = documentHolderId;
  }


  public IdDocumentDetection knownFaces(@javax.annotation.Nullable List<KnownFace> knownFaces) {
    this.knownFaces = knownFaces;
    return this;
  }

  public IdDocumentDetection addKnownFacesItem(KnownFace knownFacesItem) {
    if (this.knownFaces == null) {
      this.knownFaces = new ArrayList<>();
    }
    this.knownFaces.add(knownFacesItem);
    return this;
  }

  /**
   * A list of known faces, describing which other documentHolders match this documentHolder with a certain similarity
   * @return knownFaces
   */
  @javax.annotation.Nullable
  public List<KnownFace> getKnownFaces() {
    return knownFaces;
  }

  public void setKnownFaces(@javax.annotation.Nullable List<KnownFace> knownFaces) {
    this.knownFaces = knownFaces;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdDocumentDetection idDocumentDetection = (IdDocumentDetection) o;
    return Objects.equals(this.classification, idDocumentDetection.classification) &&
        Objects.equals(this.group, idDocumentDetection.group) &&
        Objects.equals(this.id, idDocumentDetection.id) &&
        Objects.equals(this.probability, idDocumentDetection.probability) &&
        Objects.equals(this.coordinates, idDocumentDetection.coordinates) &&
        Objects.equals(this.checkId, idDocumentDetection.checkId) &&
        Objects.equals(this.hasOfficialDocument, idDocumentDetection.hasOfficialDocument) &&
        Objects.equals(this.comparable, idDocumentDetection.comparable) &&
        Objects.equals(this.faceSimilarity, idDocumentDetection.faceSimilarity) &&
        Objects.equals(this.faceLivenessCheckScore, idDocumentDetection.faceLivenessCheckScore) &&
        Objects.equals(this.documentFrontLivenessScore, idDocumentDetection.documentFrontLivenessScore) &&
        Objects.equals(this.documentBackLivenessScore, idDocumentDetection.documentBackLivenessScore) &&
        Objects.equals(this.processedChecks, idDocumentDetection.processedChecks) &&
        Objects.equals(this.attributes, idDocumentDetection.attributes) &&
        Objects.equals(this.documentHolderId, idDocumentDetection.documentHolderId) &&
        Objects.equals(this.knownFaces, idDocumentDetection.knownFaces) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification, group, id, probability, coordinates, checkId, hasOfficialDocument, comparable, faceSimilarity, faceLivenessCheckScore, documentFrontLivenessScore, documentBackLivenessScore, processedChecks, attributes, documentHolderId, knownFaces, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdDocumentDetection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
    sb.append("    hasOfficialDocument: ").append(toIndentedString(hasOfficialDocument)).append("\n");
    sb.append("    comparable: ").append(toIndentedString(comparable)).append("\n");
    sb.append("    faceSimilarity: ").append(toIndentedString(faceSimilarity)).append("\n");
    sb.append("    faceLivenessCheckScore: ").append(toIndentedString(faceLivenessCheckScore)).append("\n");
    sb.append("    documentFrontLivenessScore: ").append(toIndentedString(documentFrontLivenessScore)).append("\n");
    sb.append("    documentBackLivenessScore: ").append(toIndentedString(documentBackLivenessScore)).append("\n");
    sb.append("    processedChecks: ").append(toIndentedString(processedChecks)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    documentHolderId: ").append(toIndentedString(documentHolderId)).append("\n");
    sb.append("    knownFaces: ").append(toIndentedString(knownFaces)).append("\n");
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
    openapiFields.add("classification");
    openapiFields.add("group");
    openapiFields.add("id");
    openapiFields.add("probability");
    openapiFields.add("coordinates");
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
    openapiFields.add("knownFaces");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IdDocumentDetection
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IdDocumentDetection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdDocumentDetection is not found in the empty JSON string", IdDocumentDetection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IdDocumentDetection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdDocumentDetection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdDocumentDetection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdDocumentDetection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdDocumentDetection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdDocumentDetection.class));

       return (TypeAdapter<T>) new TypeAdapter<IdDocumentDetection>() {
           @Override
           public void write(JsonWriter out, IdDocumentDetection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdDocumentDetection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IdDocumentDetection given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IdDocumentDetection
   * @throws IOException if the JSON string is invalid with respect to IdDocumentDetection
   */
  public static IdDocumentDetection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdDocumentDetection.class);
  }

  /**
   * Convert an instance of IdDocumentDetection to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

