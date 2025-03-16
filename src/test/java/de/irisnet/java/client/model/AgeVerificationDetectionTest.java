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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.irisnet.java.client.model.AgeVerificationAttribute;
import de.irisnet.java.client.model.AgeVerificationSubChecks;
import de.irisnet.java.client.model.Coordinates;
import de.irisnet.java.client.model.Detection;
import de.irisnet.java.client.model.KnownFace;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for AgeVerificationDetection
 */
public class AgeVerificationDetectionTest {
    private final AgeVerificationDetection model = new AgeVerificationDetection();

    /**
     * Model tests for AgeVerificationDetection
     */
    @Test
    public void testAgeVerificationDetection() {
        // TODO: test AgeVerificationDetection
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'classification'
     */
    @Test
    public void classificationTest() {
        // TODO: test classification
    }

    /**
     * Test the property 'group'
     */
    @Test
    public void groupTest() {
        // TODO: test group
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'probability'
     */
    @Test
    public void probabilityTest() {
        // TODO: test probability
    }

    /**
     * Test the property 'coordinates'
     */
    @Test
    public void coordinatesTest() {
        // TODO: test coordinates
    }

    /**
     * Test the property 'attributes'
     */
    @Test
    public void attributesTest() {
        // TODO: test attributes
    }

    /**
     * Test the property 'subDetections'
     */
    @Test
    public void subDetectionsTest() {
        // TODO: test subDetections
    }

    /**
     * Test the property 'checkId'
     */
    @Test
    public void checkIdTest() {
        // TODO: test checkId
    }

    /**
     * Test the property 'hasOfficialDocument'
     */
    @Test
    public void hasOfficialDocumentTest() {
        // TODO: test hasOfficialDocument
    }

    /**
     * Test the property 'comparable'
     */
    @Test
    public void comparableTest() {
        // TODO: test comparable
    }

    /**
     * Test the property 'faceSimilarity'
     */
    @Test
    public void faceSimilarityTest() {
        // TODO: test faceSimilarity
    }

    /**
     * Test the property 'faceLivenessCheckScore'
     */
    @Test
    public void faceLivenessCheckScoreTest() {
        // TODO: test faceLivenessCheckScore
    }

    /**
     * Test the property 'documentFrontLivenessScore'
     */
    @Test
    public void documentFrontLivenessScoreTest() {
        // TODO: test documentFrontLivenessScore
    }

    /**
     * Test the property 'documentBackLivenessScore'
     */
    @Test
    public void documentBackLivenessScoreTest() {
        // TODO: test documentBackLivenessScore
    }

    /**
     * Test the property 'processedChecks'
     */
    @Test
    public void processedChecksTest() {
        // TODO: test processedChecks
    }

    /**
     * Test the property 'documentHolderId'
     */
    @Test
    public void documentHolderIdTest() {
        // TODO: test documentHolderId
    }

    /**
     * Test the property 'knownFaces'
     */
    @Test
    public void knownFacesTest() {
        // TODO: test knownFaces
    }

}
