package org.openapitools.api

import org.openapitools.model.OBDomesticVRPDetails
import org.openapitools.model.OBDomesticVRPRequest
import org.openapitools.model.OBDomesticVRPResponse
import org.openapitools.model.OBErrorResponse14
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class DomesticVrpsApiTest {

    private val api: DomesticVrpsApiController = DomesticVrpsApiController()

    /**
     * To test DomesticVrpsApiController.domesticVrpGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun domesticVrpGetTest() {
        val domesticVRPId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBDomesticVRPResponse> = api.domesticVrpGet(domesticVRPId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test DomesticVrpsApiController.domesticVrpPaymentDetailsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun domesticVrpPaymentDetailsGetTest() {
        val domesticVRPId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBDomesticVRPDetails> = api.domesticVrpPaymentDetailsGet(domesticVRPId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test DomesticVrpsApiController.domesticVrpPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun domesticVrpPostTest() {
        val authorization: kotlin.String = TODO()
        val xJwsSignature: kotlin.String = TODO()
        val xIdempotencyKey: kotlin.String = TODO()
        val obDomesticVRPRequest: OBDomesticVRPRequest = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val payloadVersion: kotlin.String? = TODO()
        val response: ResponseEntity<OBDomesticVRPResponse> = api.domesticVrpPost(authorization, xJwsSignature, xIdempotencyKey, obDomesticVRPRequest, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, payloadVersion)

        // TODO: test validations
    }
}
