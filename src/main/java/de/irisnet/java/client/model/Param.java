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
 * A single parameter set for one classification, for example face, describing the behaviour of the AI. Each classification has default parameters that are set if these are empty.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class Param {
  /**
   * The classification of the object, that the element refers to. The following is a tree representation of the prototypes and their containing classifications. Default parameter values are defined per classification object. The default values of &#39;min&#39;, &#39;max&#39; and &#39;drawMode&#39; are witten after the name of the classification object in that order. Use the prototype names to set parameters to all of the containing classifications. ##### nudityCheck &gt; _A prototype containing classifications for basic human attributes and sexual contents. This prototype and the containing classifications are activated by default_ * _face_ _(1, 3, 0)_ * _hand_ _(0, -1, 0)_ * _foot_ _(0, -1, 0)_ * _footwear_ _(0, -1, 0)_ * _chest_ _(0, -1, 0)_ * _breast_ _(0, 0, 2)_ * _vulva_ _(0, 0, 2)_ * _penis_ _(0, 0, 2)_ * _vagina_ _(0, 0, 2)_ * _buttocks_ _(0, 0, 2)_ * _anus_ _(0, 0, 2)_ * _toy_ _(0, -1, 0)_ * _oral_ _(0, 0, 2)_ * _penetration_ _(0, 0, 2)_ * _bondage_ _(0, -1, 0)_ * _gag_ _(0, -1, 0)_ ##### ageEstimation &gt; _Contains classification objects for estimating the age of a human face. This prototype activates nudityCheck_ * _child (*)_ _(0, 0, 6)_ * _adult (*)_ _(0, -1, 0)_ * _senior (*)_ _(0, -1, 0)_ * _pose_ _(0, 0, 0)_ - The age can not be estimated, due to a pose that hides facial features. ##### attributesCheck &gt; _Contains classification objects for various attributes of the human face. This prototype activates nudityCheck_ * _female (*)_ _(0, -1, 0)_ * _male (*)_ _(0, -1, 0)_ * _hair_ _(0, -1, 0)_ * _hairless_ _(0, -1, 0)_ * _beard_ _(0, -1, 0)_ * _moustache_ _(0, -1, 0)_ * _headpiece_ _(0, -1, 0)_ * _glasses_ _(0, -1, 0)_ * _sunglasses_ _(0, -1, 0)_ * _mask_ _(0, -1, 0)_ * _slimSizedFace (*)_ _(0, -1, 0)_ * _realSizedFace (*)_ _(0, -1, 0)_ * _plusSizedFace (*)_ _(0, -1, 0)_ ##### nippleCheck &gt; _Contains classifications for determining if the object recognized as breast has a nipple. This prototype activates nudityCheck_ * _noNipple_ _(0, -1, 0)_ * _hasNipple_ _(0, 0, 0)_ ##### bodyAttributes &gt; _Contains classification objects for determining the body size._ * _slimSized_ _(0, -1, 0)_ * _realSized_ _(0, -1, 0)_ * _plusSized_ _(0, -1, 0)_ ##### illegalSymbols &gt; _Contains various classification objects of symbols that are prohibited in Germany (e.g. Hakenkreuz, SS, etc). These are grouped under a single name_ * _illegalSymbols_ _(0, 0, 1)_ ##### unwantedSubstances &gt; _Contains classification objects for different substances._ * _beer_ _(0, -1, 0)_ * _beerBottle_ _(0, -1, 0)_ * _beerCan_ _(0, -1, 0)_ * _wine_ _(0, -1, 0)_ * _wineBottle_ _(0, -1, 0)_ * _cocktail_ _(0, -1, 0)_ * _alcohol_ _(0, -1, 0)_ * _cannabis_ _(0, 0, 0)_ * _cigarette_ _(0, 0, 0)_ * _cocaine_ _(0, 0, 0)_ * _heroine_ _(0, 0, 0)_ * _coffee_ _(0, -1, 0)_ ##### violenceCheck &gt; _Contains classification objects for violent items or acts._ * _camouflage_ _(0, -1, 0)_ * _club_ _(0, -1, 0)_ * _knife_ _(0, 0, 0)_ * _sword_ _(0, 0, 0)_ * _pistol_ _(0, 0, 0)_ * _rifle_ _(0, 0, 0)_ * _cannon_ _(0, 0, 0)_ * _fire_ _(0, -1, 0)_ ##### selfieCheck &gt; _Classification objects representing various pre-defined poses for the selfie task._ * _hand2mouth_ _(0, 1, 0)_ * _point2nose_ _(0, 1, 0)_ * _relaxed_ _(0, 1, 0)_ * _point2chin_ _(0, 1, 0)_ * _hand2cheek_ _(0, 1, 0)_ * _excellent_ _(0, 1, 0)_ * _nice_ _(0, 1, 0)_ * _thinking_ _(0, 1, 0)_ * _thumbUp_ _(0, 1, 0)_ * _victory_ _(0, 1, 0)_ * _lookout_ _(0, 1, 0)_ * _fingerUp_ _(0, 1, 0)_ * _middleFinger_ _(0, 0, 0)_ ##### textRecognition &gt; _Contains letters, numbers and some symbols (e.g. @, #, etc) as classification objects. These are grouped under a single name_ * _textRecognition_ _(0, 6, 6)_  _Classification objects that are marked with (*) are sub-classifications of face. Both face and the marked classification are affected by the given parameter values._  _Please be aware that the default values can be subject to change. This is due to the difficulty of recognizing certain objects e.g. objects that are classified as toy._
   */
  @JsonAdapter(ClassificationEnum.Adapter.class)
  public enum ClassificationEnum {
    FACE("face"),
    
    HAND("hand"),
    
    FOOT("foot"),
    
    FOOTWEAR("footwear"),
    
    CHEST("chest"),
    
    BREAST("breast"),
    
    VULVA("vulva"),
    
    PENIS("penis"),
    
    VAGINA("vagina"),
    
    BUTTOCKS("buttocks"),
    
    ANUS("anus"),
    
    ORAL("oral"),
    
    PENETRATION("penetration"),
    
    TOY("toy"),
    
    BONDAGE("bondage"),
    
    GAG("gag"),
    
    CHILD("child"),
    
    ADULT("adult"),
    
    SENIOR("senior"),
    
    POSE("pose"),
    
    FEMALE("female"),
    
    MALE("male"),
    
    HAIR("hair"),
    
    HAIRLESS("hairless"),
    
    BEARD("beard"),
    
    MOUSTACHE("moustache"),
    
    HEADPIECE("headpiece"),
    
    GLASSES("glasses"),
    
    SUNGLASSES("sunglasses"),
    
    MASK("mask"),
    
    SLIM_SIZED_FACE("slimSizedFace"),
    
    REAL_SIZED_FACE("realSizedFace"),
    
    PLUS_SIZED_FACE("plusSizedFace"),
    
    SLIM_SIZED("slimSized"),
    
    REAL_SIZED("realSized"),
    
    PLUS_SIZED("plusSized"),
    
    NO_NIPPLE("noNipple"),
    
    HAS_NIPPLE("hasNipple"),
    
    BEER("beer"),
    
    BEER_BOTTLE("beerBottle"),
    
    BEER_CAN("beerCan"),
    
    WINE("wine"),
    
    WINE_BOTTLE("wineBottle"),
    
    COCKTAIL("cocktail"),
    
    ALCOHOL("alcohol"),
    
    CANNABIS("cannabis"),
    
    CIGARETTE("cigarette"),
    
    COCAINE("cocaine"),
    
    HEROINE("heroine"),
    
    COFFEE("coffee"),
    
    CAMOUFLAGE("camouflage"),
    
    CLUB("club"),
    
    KNIFE("knife"),
    
    SWORD("sword"),
    
    PISTOL("pistol"),
    
    RIFLE("rifle"),
    
    CANNON("cannon"),
    
    FIRE("fire"),
    
    HAND2MOUTH("hand2mouth"),
    
    POINT2NOSE("point2nose"),
    
    RELAXED("relaxed"),
    
    POINT2CHIN("point2chin"),
    
    HAND2CHEEK("hand2cheek"),
    
    EXCELLENT("excellent"),
    
    NICE("nice"),
    
    THINKING("thinking"),
    
    THUMB_UP("thumbUp"),
    
    VICTORY("victory"),
    
    LOOKOUT("lookout"),
    
    FINGER_UP("fingerUp"),
    
    MIDDLE_FINGER("middleFinger"),
    
    NUDITY_CHECK("nudityCheck"),
    
    AGE_VERIFICATION("ageVerification"),
    
    AGE_ESTIMATION("ageEstimation"),
    
    ILLEGAL_SYMBOLS("illegalSymbols"),
    
    TEXT_RECOGNITION("textRecognition"),
    
    ATTRIBUTES_CHECK("attributesCheck"),
    
    BODY_ATTRIBUTES("bodyAttributes"),
    
    NIPPLE_CHECK("nippleCheck"),
    
    UNWANTED_SUBSTANCES("unwantedSubstances"),
    
    VIOLENCE_CHECK("violenceCheck"),
    
    SELFIE_CHECK("selfieCheck");

    private String value;

    ClassificationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClassificationEnum fromValue(String value) {
      for (ClassificationEnum b : ClassificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClassificationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClassificationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClassificationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClassificationEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ClassificationEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CLASSIFICATION = "classification";
  @SerializedName(SERIALIZED_NAME_CLASSIFICATION)
  private ClassificationEnum classification;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Integer min;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Integer max;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Integer severity = 100;

  public static final String SERIALIZED_NAME_DRAW_MODE = "drawMode";
  @SerializedName(SERIALIZED_NAME_DRAW_MODE)
  private Integer drawMode;

  public static final String SERIALIZED_NAME_GREY = "grey";
  @SerializedName(SERIALIZED_NAME_GREY)
  private Integer grey = 127;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private Float scale = 1.0f;

  public static final String SERIALIZED_NAME_IGNORE = "ignore";
  @SerializedName(SERIALIZED_NAME_IGNORE)
  private Boolean ignore = false;

  public Param() {
  }

  public Param classification(ClassificationEnum classification) {
    this.classification = classification;
    return this;
  }

  /**
   * The classification of the object, that the element refers to. The following is a tree representation of the prototypes and their containing classifications. Default parameter values are defined per classification object. The default values of &#39;min&#39;, &#39;max&#39; and &#39;drawMode&#39; are witten after the name of the classification object in that order. Use the prototype names to set parameters to all of the containing classifications. ##### nudityCheck &gt; _A prototype containing classifications for basic human attributes and sexual contents. This prototype and the containing classifications are activated by default_ * _face_ _(1, 3, 0)_ * _hand_ _(0, -1, 0)_ * _foot_ _(0, -1, 0)_ * _footwear_ _(0, -1, 0)_ * _chest_ _(0, -1, 0)_ * _breast_ _(0, 0, 2)_ * _vulva_ _(0, 0, 2)_ * _penis_ _(0, 0, 2)_ * _vagina_ _(0, 0, 2)_ * _buttocks_ _(0, 0, 2)_ * _anus_ _(0, 0, 2)_ * _toy_ _(0, -1, 0)_ * _oral_ _(0, 0, 2)_ * _penetration_ _(0, 0, 2)_ * _bondage_ _(0, -1, 0)_ * _gag_ _(0, -1, 0)_ ##### ageEstimation &gt; _Contains classification objects for estimating the age of a human face. This prototype activates nudityCheck_ * _child (*)_ _(0, 0, 6)_ * _adult (*)_ _(0, -1, 0)_ * _senior (*)_ _(0, -1, 0)_ * _pose_ _(0, 0, 0)_ - The age can not be estimated, due to a pose that hides facial features. ##### attributesCheck &gt; _Contains classification objects for various attributes of the human face. This prototype activates nudityCheck_ * _female (*)_ _(0, -1, 0)_ * _male (*)_ _(0, -1, 0)_ * _hair_ _(0, -1, 0)_ * _hairless_ _(0, -1, 0)_ * _beard_ _(0, -1, 0)_ * _moustache_ _(0, -1, 0)_ * _headpiece_ _(0, -1, 0)_ * _glasses_ _(0, -1, 0)_ * _sunglasses_ _(0, -1, 0)_ * _mask_ _(0, -1, 0)_ * _slimSizedFace (*)_ _(0, -1, 0)_ * _realSizedFace (*)_ _(0, -1, 0)_ * _plusSizedFace (*)_ _(0, -1, 0)_ ##### nippleCheck &gt; _Contains classifications for determining if the object recognized as breast has a nipple. This prototype activates nudityCheck_ * _noNipple_ _(0, -1, 0)_ * _hasNipple_ _(0, 0, 0)_ ##### bodyAttributes &gt; _Contains classification objects for determining the body size._ * _slimSized_ _(0, -1, 0)_ * _realSized_ _(0, -1, 0)_ * _plusSized_ _(0, -1, 0)_ ##### illegalSymbols &gt; _Contains various classification objects of symbols that are prohibited in Germany (e.g. Hakenkreuz, SS, etc). These are grouped under a single name_ * _illegalSymbols_ _(0, 0, 1)_ ##### unwantedSubstances &gt; _Contains classification objects for different substances._ * _beer_ _(0, -1, 0)_ * _beerBottle_ _(0, -1, 0)_ * _beerCan_ _(0, -1, 0)_ * _wine_ _(0, -1, 0)_ * _wineBottle_ _(0, -1, 0)_ * _cocktail_ _(0, -1, 0)_ * _alcohol_ _(0, -1, 0)_ * _cannabis_ _(0, 0, 0)_ * _cigarette_ _(0, 0, 0)_ * _cocaine_ _(0, 0, 0)_ * _heroine_ _(0, 0, 0)_ * _coffee_ _(0, -1, 0)_ ##### violenceCheck &gt; _Contains classification objects for violent items or acts._ * _camouflage_ _(0, -1, 0)_ * _club_ _(0, -1, 0)_ * _knife_ _(0, 0, 0)_ * _sword_ _(0, 0, 0)_ * _pistol_ _(0, 0, 0)_ * _rifle_ _(0, 0, 0)_ * _cannon_ _(0, 0, 0)_ * _fire_ _(0, -1, 0)_ ##### selfieCheck &gt; _Classification objects representing various pre-defined poses for the selfie task._ * _hand2mouth_ _(0, 1, 0)_ * _point2nose_ _(0, 1, 0)_ * _relaxed_ _(0, 1, 0)_ * _point2chin_ _(0, 1, 0)_ * _hand2cheek_ _(0, 1, 0)_ * _excellent_ _(0, 1, 0)_ * _nice_ _(0, 1, 0)_ * _thinking_ _(0, 1, 0)_ * _thumbUp_ _(0, 1, 0)_ * _victory_ _(0, 1, 0)_ * _lookout_ _(0, 1, 0)_ * _fingerUp_ _(0, 1, 0)_ * _middleFinger_ _(0, 0, 0)_ ##### textRecognition &gt; _Contains letters, numbers and some symbols (e.g. @, #, etc) as classification objects. These are grouped under a single name_ * _textRecognition_ _(0, 6, 6)_  _Classification objects that are marked with (*) are sub-classifications of face. Both face and the marked classification are affected by the given parameter values._  _Please be aware that the default values can be subject to change. This is due to the difficulty of recognizing certain objects e.g. objects that are classified as toy._
   * @return classification
   */
  @javax.annotation.Nonnull
  public ClassificationEnum getClassification() {
    return classification;
  }

  public void setClassification(ClassificationEnum classification) {
    this.classification = classification;
  }


  public Param min(Integer min) {
    this.min = min;
    return this;
  }

  /**
   * The minimum amount of objects allowed on the image. Setting the value to -1 will cause the AI to ignore this rule. For moving images this value is applied to a single frame.
   * minimum: -1
   * @return min
   */
  @javax.annotation.Nullable
  public Integer getMin() {
    return min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }


  public Param max(Integer max) {
    this.max = max;
    return this;
  }

  /**
   * The maximum amount of objects allowed on the image. Setting the value to -1 will cause the AI to ignore this rule. For moving images this value is applied to a single frame.
   * minimum: -1
   * @return max
   */
  @javax.annotation.Nullable
  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }


  public Param severity(Integer severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Set a value to define the severity of a broken rule of the given classification object.
   * minimum: 0
   * maximum: 999
   * @return severity
   */
  @javax.annotation.Nullable
  public Integer getSeverity() {
    return severity;
  }

  public void setSeverity(Integer severity) {
    this.severity = severity;
  }


  public Param drawMode(Integer drawMode) {
    this.drawMode = drawMode;
    return this;
  }

  /**
   * Set if and how a classification object should be drawn over.  * _0_ - will draw nothing, * _1_ - will draw a frame with class name surrounding the object, * _2_ - will draw a filled rectangle that will mask the object, * _3_ - is a combination between _1_ and _2_ (frame/name + mask), * _6_ - will blur the object and * _7_ - is a combination between _1_ and _6_ (frame/name + blur).
   * minimum: 0
   * maximum: 7
   * @return drawMode
   */
  @javax.annotation.Nullable
  public Integer getDrawMode() {
    return drawMode;
  }

  public void setDrawMode(Integer drawMode) {
    this.drawMode = drawMode;
  }


  public Param grey(Integer grey) {
    this.grey = grey;
    return this;
  }

  /**
   * A grey scale color used in combination of _drawMode_ &#39;2&#39; or &#39;3&#39;. &#39;0&#39; will represent black, while the maximum &#39;255&#39; will be white.
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


  public Param scale(Float scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Scale of the bounds around the classification object. Specify a value to increase or decrease the size of the bounds. This is applied to the resulting media as well as the JSON coordinates.
   * minimum: 0.5
   * maximum: 4.0
   * @return scale
   */
  @javax.annotation.Nullable
  public Float getScale() {
    return scale;
  }

  public void setScale(Float scale) {
    this.scale = scale;
  }


  public Param ignore(Boolean ignore) {
    this.ignore = ignore;
    return this;
  }

  /**
   * A shorthand to ignore the classification object. This is equal to setting _min&#x3D;0_, _max&#x3D;-1_ and _drawMode&#x3D;0_.
   * @return ignore
   */
  @javax.annotation.Nullable
  public Boolean getIgnore() {
    return ignore;
  }

  public void setIgnore(Boolean ignore) {
    this.ignore = ignore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Param param = (Param) o;
    return Objects.equals(this.classification, param.classification) &&
        Objects.equals(this.min, param.min) &&
        Objects.equals(this.max, param.max) &&
        Objects.equals(this.severity, param.severity) &&
        Objects.equals(this.drawMode, param.drawMode) &&
        Objects.equals(this.grey, param.grey) &&
        Objects.equals(this.scale, param.scale) &&
        Objects.equals(this.ignore, param.ignore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification, min, max, severity, drawMode, grey, scale, ignore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Param {\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    drawMode: ").append(toIndentedString(drawMode)).append("\n");
    sb.append("    grey: ").append(toIndentedString(grey)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    ignore: ").append(toIndentedString(ignore)).append("\n");
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
    openapiFields.add("min");
    openapiFields.add("max");
    openapiFields.add("severity");
    openapiFields.add("drawMode");
    openapiFields.add("grey");
    openapiFields.add("scale");
    openapiFields.add("ignore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("classification");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Param
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Param.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Param is not found in the empty JSON string", Param.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Param.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Param` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Param.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("classification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classification").toString()));
      }
      // validate the required field `classification`
      ClassificationEnum.validateJsonElement(jsonObj.get("classification"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Param.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Param' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Param> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Param.class));

       return (TypeAdapter<T>) new TypeAdapter<Param>() {
           @Override
           public void write(JsonWriter out, Param value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Param read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Param given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Param
   * @throws IOException if the JSON string is invalid with respect to Param
   */
  public static Param fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Param.class);
  }

  /**
   * Convert an instance of Param to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

