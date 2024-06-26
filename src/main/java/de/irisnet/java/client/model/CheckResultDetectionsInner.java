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
import de.irisnet.java.client.model.BaseDetection;
import de.irisnet.java.client.model.BreastDetection;
import de.irisnet.java.client.model.FaceDetection;
import de.irisnet.java.client.model.HairDetection;
import de.irisnet.java.client.model.IdDocumentAttribute;
import de.irisnet.java.client.model.IdDocumentDetection;
import de.irisnet.java.client.model.IdDocumentSubChecks;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import de.irisnet.java.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class CheckResultDetectionsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CheckResultDetectionsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CheckResultDetectionsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CheckResultDetectionsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BaseDetection> adapterBaseDetection = gson.getDelegateAdapter(this, TypeToken.get(BaseDetection.class));
            final TypeAdapter<BreastDetection> adapterBreastDetection = gson.getDelegateAdapter(this, TypeToken.get(BreastDetection.class));
            final TypeAdapter<FaceDetection> adapterFaceDetection = gson.getDelegateAdapter(this, TypeToken.get(FaceDetection.class));
            final TypeAdapter<HairDetection> adapterHairDetection = gson.getDelegateAdapter(this, TypeToken.get(HairDetection.class));
            final TypeAdapter<IdDocumentDetection> adapterIdDocumentDetection = gson.getDelegateAdapter(this, TypeToken.get(IdDocumentDetection.class));

            return (TypeAdapter<T>) new TypeAdapter<CheckResultDetectionsInner>() {
                @Override
                public void write(JsonWriter out, CheckResultDetectionsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `BaseDetection`
                    if (value.getActualInstance() instanceof BaseDetection) {
                        JsonElement element = adapterBaseDetection.toJsonTree((BaseDetection)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `BreastDetection`
                    if (value.getActualInstance() instanceof BreastDetection) {
                        JsonElement element = adapterBreastDetection.toJsonTree((BreastDetection)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `FaceDetection`
                    if (value.getActualInstance() instanceof FaceDetection) {
                        JsonElement element = adapterFaceDetection.toJsonTree((FaceDetection)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `HairDetection`
                    if (value.getActualInstance() instanceof HairDetection) {
                        JsonElement element = adapterHairDetection.toJsonTree((HairDetection)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `IdDocumentDetection`
                    if (value.getActualInstance() instanceof IdDocumentDetection) {
                        JsonElement element = adapterIdDocumentDetection.toJsonTree((IdDocumentDetection)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: BaseDetection, BreastDetection, FaceDetection, HairDetection, IdDocumentDetection");
                }

                @Override
                public CheckResultDetectionsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize BaseDetection
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BaseDetection.validateJsonElement(jsonElement);
                        actualAdapter = adapterBaseDetection;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BaseDetection'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BaseDetection failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BaseDetection'", e);
                    }
                    // deserialize BreastDetection
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BreastDetection.validateJsonElement(jsonElement);
                        actualAdapter = adapterBreastDetection;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BreastDetection'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BreastDetection failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BreastDetection'", e);
                    }
                    // deserialize FaceDetection
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FaceDetection.validateJsonElement(jsonElement);
                        actualAdapter = adapterFaceDetection;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FaceDetection'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FaceDetection failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FaceDetection'", e);
                    }
                    // deserialize HairDetection
                    try {
                        // validate the JSON object to see if any exception is thrown
                        HairDetection.validateJsonElement(jsonElement);
                        actualAdapter = adapterHairDetection;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'HairDetection'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for HairDetection failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'HairDetection'", e);
                    }
                    // deserialize IdDocumentDetection
                    try {
                        // validate the JSON object to see if any exception is thrown
                        IdDocumentDetection.validateJsonElement(jsonElement);
                        actualAdapter = adapterIdDocumentDetection;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'IdDocumentDetection'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for IdDocumentDetection failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'IdDocumentDetection'", e);
                    }

                    if (match == 1) {
                        CheckResultDetectionsInner ret = new CheckResultDetectionsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CheckResultDetectionsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CheckResultDetectionsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public CheckResultDetectionsInner(BaseDetection o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CheckResultDetectionsInner(BreastDetection o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CheckResultDetectionsInner(FaceDetection o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CheckResultDetectionsInner(HairDetection o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CheckResultDetectionsInner(IdDocumentDetection o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BaseDetection", BaseDetection.class);
        schemas.put("BreastDetection", BreastDetection.class);
        schemas.put("FaceDetection", FaceDetection.class);
        schemas.put("HairDetection", HairDetection.class);
        schemas.put("IdDocumentDetection", IdDocumentDetection.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CheckResultDetectionsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BaseDetection, BreastDetection, FaceDetection, HairDetection, IdDocumentDetection
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof BaseDetection) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BreastDetection) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FaceDetection) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof HairDetection) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof IdDocumentDetection) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BaseDetection, BreastDetection, FaceDetection, HairDetection, IdDocumentDetection");
    }

    /**
     * Get the actual instance, which can be the following:
     * BaseDetection, BreastDetection, FaceDetection, HairDetection, IdDocumentDetection
     *
     * @return The actual instance (BaseDetection, BreastDetection, FaceDetection, HairDetection, IdDocumentDetection)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BaseDetection`. If the actual instance is not `BaseDetection`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BaseDetection`
     * @throws ClassCastException if the instance is not `BaseDetection`
     */
    public BaseDetection getBaseDetection() throws ClassCastException {
        return (BaseDetection)super.getActualInstance();
    }
    /**
     * Get the actual instance of `BreastDetection`. If the actual instance is not `BreastDetection`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BreastDetection`
     * @throws ClassCastException if the instance is not `BreastDetection`
     */
    public BreastDetection getBreastDetection() throws ClassCastException {
        return (BreastDetection)super.getActualInstance();
    }
    /**
     * Get the actual instance of `FaceDetection`. If the actual instance is not `FaceDetection`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FaceDetection`
     * @throws ClassCastException if the instance is not `FaceDetection`
     */
    public FaceDetection getFaceDetection() throws ClassCastException {
        return (FaceDetection)super.getActualInstance();
    }
    /**
     * Get the actual instance of `HairDetection`. If the actual instance is not `HairDetection`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HairDetection`
     * @throws ClassCastException if the instance is not `HairDetection`
     */
    public HairDetection getHairDetection() throws ClassCastException {
        return (HairDetection)super.getActualInstance();
    }
    /**
     * Get the actual instance of `IdDocumentDetection`. If the actual instance is not `IdDocumentDetection`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IdDocumentDetection`
     * @throws ClassCastException if the instance is not `IdDocumentDetection`
     */
    public IdDocumentDetection getIdDocumentDetection() throws ClassCastException {
        return (IdDocumentDetection)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CheckResultDetectionsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with BaseDetection
        try {
            BaseDetection.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BaseDetection failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with BreastDetection
        try {
            BreastDetection.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BreastDetection failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with FaceDetection
        try {
            FaceDetection.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FaceDetection failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with HairDetection
        try {
            HairDetection.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for HairDetection failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with IdDocumentDetection
        try {
            IdDocumentDetection.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for IdDocumentDetection failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CheckResultDetectionsInner with oneOf schemas: BaseDetection, BreastDetection, FaceDetection, HairDetection, IdDocumentDetection. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CheckResultDetectionsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CheckResultDetectionsInner
     * @throws IOException if the JSON string is invalid with respect to CheckResultDetectionsInner
     */
    public static CheckResultDetectionsInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CheckResultDetectionsInner.class);
    }

    /**
     * Convert an instance of CheckResultDetectionsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

