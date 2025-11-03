package org.openapitools.api

import org.openapitools.model.OBDomesticVRPConsentRequest
import org.openapitools.model.OBDomesticVRPConsentResponse
import org.openapitools.model.OBErrorResponse14
import org.openapitools.model.OBVRPFundsConfirmationRequest
import org.openapitools.model.OBVRPFundsConfirmationResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class DomesticVrpConsentsApiTest {

    private val api: DomesticVrpConsentsApiController = DomesticVrpConsentsApiController()

    /**
     * To test DomesticVrpConsentsApiController.domesticVrpConsentsDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun domesticVrpConsentsDeleteTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<Unit> = api.domesticVrpConsentsDelete(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test DomesticVrpConsentsApiController.domesticVrpConsentsFundsConfirmation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun domesticVrpConsentsFundsConfirmationTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xJwsSignature: kotlin.String = TODO()
        val obVRPFundsConfirmationRequest: OBVRPFundsConfirmationRequest = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBVRPFundsConfirmationResponse> = api.domesticVrpConsentsFundsConfirmation(consentId, authorization, xJwsSignature, obVRPFundsConfirmationRequest, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test DomesticVrpConsentsApiController.domesticVrpConsentsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun domesticVrpConsentsGetTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBDomesticVRPConsentResponse> = api.domesticVrpConsentsGet(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test DomesticVrpConsentsApiController.domesticVrpConsentsPatch
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun domesticVrpConsentsPatchTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xIdempotencyKey: kotlin.String = TODO()
        val xJwsSignature: kotlin.String = TODO()
        val body: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBDomesticVRPConsentResponse> = api.domesticVrpConsentsPatch(consentId, authorization, xIdempotencyKey, xJwsSignature, body, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test DomesticVrpConsentsApiController.domesticVrpConsentsPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun domesticVrpConsentsPostTest() {
        val authorization: kotlin.String = TODO()
        val xIdempotencyKey: kotlin.String = TODO()
        val xJwsSignature: kotlin.String = TODO()
        val obDomesticVRPConsentRequest: OBDomesticVRPConsentRequest = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBDomesticVRPConsentResponse> = api.domesticVrpConsentsPost(authorization, xIdempotencyKey, xJwsSignature, obDomesticVRPConsentRequest, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test DomesticVrpConsentsApiController.domesticVrpConsentsPut
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun domesticVrpConsentsPutTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xIdempotencyKey: kotlin.String = TODO()
        val xJwsSignature: kotlin.String = TODO()
        val obDomesticVRPConsentRequest: OBDomesticVRPConsentRequest = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBDomesticVRPConsentResponse> = api.domesticVrpConsentsPut(consentId, authorization, xIdempotencyKey, xJwsSignature, obDomesticVRPConsentRequest, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
