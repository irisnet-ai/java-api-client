/*
 * Irisnet API
 * Artificial Intelligence (AI) for image- and video-processing in realtime. This is an interactive documentation meant to give a place were you can quickly look up the endpoints and their schemas, while also giving you the option to try things out yourself.  Listed below you'll see the available endpoints of the API that can be expanded by clicking on it. Each expanded endpoint lists the request parameter (if available) and the request body (if available). The request body can list some example bodies and the schema, explaining each model in detail. Additionally you'll find a 'Try it out' button where you can type in your custom parameters and custom body and execute that against the API. The responses section in the expanded endpoint lists the possible responses with their corresponding status codes. If you've executed an API call it will also show you the response from the server.  Underneath the endpoints you'll find the model schemas. These are the models used for the requests and responses.By clicking on the right arrow you can expand the model and it will show you a description of the model and the model parameters. For nested models you can keep clicking the right arrow to reveal further details on it.  
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.irisnet.java.client;

import de.irisnet.java.ApiException;
import de.irisnet.java.client.model.INDefineAI;
import de.irisnet.java.client.model.INParams;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EndpointsToSetupTheAiApi
 */
@Ignore
public class EndpointsToSetupTheAiApiTest {

    private final EndpointsToSetupTheAiApi api = new EndpointsToSetupTheAiApi();

    
    /**
     * Set definitions via pre-defined prototypes.
     *
     * Each available prototype groups together a pre-defined set of parameters that will define the behaviour of the AI. This allows to configure multiple AI-checks per image. The image upload is only required once. Set the definition context with your needs in mind, credits are subtracted accordingly. See &#39;cost&#39; endpoint for further information. Additionally you can overwrite specific parameters using &#39;set-parameters&#39;. Any prior request to &#39;set-parameters&#39; are invalidated when calling this request. This can also be used to reset the AI configuration.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setINDefineTest() throws ApiException {
        INDefineAI inDefineAI = null;
        api.setINDefine(inDefineAI);

        // TODO: test validations
    }
    
    /**
     * Set the behaviour parameters for one object class.
     *
     * Overwrites or extends the default configuration of the AI. By setting precise behaviour parameters, the AI can be fine tuned for specific use cases. To reset the parameters to their default values, make a post request to &#39;set-definition&#39;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setINParamsTest() throws ApiException {
        INParams inParams = null;
        api.setINParams(inParams);

        // TODO: test validations
    }
    
}
