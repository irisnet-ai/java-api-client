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


package de.irisnet.java.client;

import de.irisnet.java.ApiException;
import de.irisnet.java.client.model.ApiNotice;
import de.irisnet.java.client.model.Config;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigurationManagementApi
 */
@Disabled
public class ConfigurationManagementApiTest {

    private final ConfigurationManagementApi api = new ConfigurationManagementApi();

    /**
     * Delete an AI configuration.
     *
     * Deletes the AI configuration with the given id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteConfigTest() throws ApiException {
        UUID configId = null;
        api.deleteConfig(configId);
        // TODO: test validations
    }

    /**
     * List all saved AI configurations.
     *
     * Returns a list of all configurations with its id&#39;s and configured prototypes. There is a limit on how many configurations can be stored per license key. You can find this limit in the response of the info operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllConfigsTest() throws ApiException {
        List<Config> response = api.getAllConfigs();
        // TODO: test validations
    }

    /**
     * Get a specific AI configuration.
     *
     * Returns a specific AI configuration for the requested id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigTest() throws ApiException {
        UUID configId = null;
        Config response = api.getConfig(configId);
        // TODO: test validations
    }

    /**
     * Create a new AI configuration.
     *
     * Create a new AI configuration with the desired prototypes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setConfigTest() throws ApiException {
        Config config = null;
        Config response = api.setConfig(config);
        // TODO: test validations
    }

}
