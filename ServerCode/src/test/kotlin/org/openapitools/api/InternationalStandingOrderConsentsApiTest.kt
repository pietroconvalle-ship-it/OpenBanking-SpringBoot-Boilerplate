package org.openapitools.api

import org.openapitools.model.OBErrorResponse11
import org.openapitools.model.OBWriteInternationalStandingOrderConsent6
import org.openapitools.model.OBWriteInternationalStandingOrderConsentResponse7
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class InternationalStandingOrderConsentsApiTest {

    private val api: InternationalStandingOrderConsentsApiController = InternationalStandingOrderConsentsApiController()

    /**
     * To test InternationalStandingOrderConsentsApiController.createInternationalStandingOrderConsents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createInternationalStandingOrderConsentsTest() {
        val authorization: kotlin.String = TODO()
        val xIdempotencyKey: kotlin.String = TODO()
        val xJwsSignature: kotlin.String = TODO()
        val obWriteInternationalStandingOrderConsent6: OBWriteInternationalStandingOrderConsent6 = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteInternationalStandingOrderConsentResponse7> = api.createInternationalStandingOrderConsents(authorization, xIdempotencyKey, xJwsSignature, obWriteInternationalStandingOrderConsent6, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test InternationalStandingOrderConsentsApiController.getInternationalStandingOrderConsentsConsentId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getInternationalStandingOrderConsentsConsentIdTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteInternationalStandingOrderConsentResponse7> = api.getInternationalStandingOrderConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
