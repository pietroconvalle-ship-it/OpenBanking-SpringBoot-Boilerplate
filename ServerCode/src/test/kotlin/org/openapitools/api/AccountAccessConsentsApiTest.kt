package org.openapitools.api

import org.openapitools.model.OBErrorResponse1
import org.openapitools.model.OBErrorResponse12
import org.openapitools.model.OBReadConsent1
import org.openapitools.model.OBReadConsentResponse1
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class AccountAccessConsentsApiTest {

    private val api: AccountAccessConsentsApiController = AccountAccessConsentsApiController()

    /**
     * To test AccountAccessConsentsApiController.createAccountAccessConsents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createAccountAccessConsentsTest() {
        val authorization: kotlin.String = TODO()
        val obReadConsent1: OBReadConsent1 = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadConsentResponse1> = api.createAccountAccessConsents(authorization, obReadConsent1, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountAccessConsentsApiController.deleteAccountAccessConsentsConsentId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteAccountAccessConsentsConsentIdTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<Unit> = api.deleteAccountAccessConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountAccessConsentsApiController.getAccountAccessConsentsConsentId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountAccessConsentsConsentIdTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadConsentResponse1> = api.getAccountAccessConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
