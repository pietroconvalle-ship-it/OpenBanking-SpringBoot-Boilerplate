package org.openapitools.api

import org.openapitools.model.OBErrorResponse11
import org.openapitools.model.OBWriteDomesticConsent4
import org.openapitools.model.OBWriteDomesticConsentResponse5
import org.openapitools.model.OBWriteFundsConfirmationResponse1
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class DomesticPaymentConsentsApiTest {

    private val api: DomesticPaymentConsentsApiController = DomesticPaymentConsentsApiController()

    /**
     * To test DomesticPaymentConsentsApiController.createDomesticPaymentConsents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createDomesticPaymentConsentsTest() {
        val authorization: kotlin.String = TODO()
        val xIdempotencyKey: kotlin.String = TODO()
        val xJwsSignature: kotlin.String = TODO()
        val obWriteDomesticConsent4: OBWriteDomesticConsent4 = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteDomesticConsentResponse5> = api.createDomesticPaymentConsents(authorization, xIdempotencyKey, xJwsSignature, obWriteDomesticConsent4, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test DomesticPaymentConsentsApiController.getDomesticPaymentConsentsConsentId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getDomesticPaymentConsentsConsentIdTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteDomesticConsentResponse5> = api.getDomesticPaymentConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test DomesticPaymentConsentsApiController.getDomesticPaymentConsentsConsentIdFundsConfirmation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getDomesticPaymentConsentsConsentIdFundsConfirmationTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteFundsConfirmationResponse1> = api.getDomesticPaymentConsentsConsentIdFundsConfirmation(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
