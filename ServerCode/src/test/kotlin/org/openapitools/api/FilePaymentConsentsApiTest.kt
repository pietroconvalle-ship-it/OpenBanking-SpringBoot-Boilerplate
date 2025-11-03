package org.openapitools.api

import org.openapitools.model.OBErrorResponse11
import org.openapitools.model.OBWriteFileConsent3
import org.openapitools.model.OBWriteFileConsentResponse4
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class FilePaymentConsentsApiTest {

    private val api: FilePaymentConsentsApiController = FilePaymentConsentsApiController()

    /**
     * To test FilePaymentConsentsApiController.createFilePaymentConsents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createFilePaymentConsentsTest() {
        val authorization: kotlin.String = TODO()
        val xIdempotencyKey: kotlin.String = TODO()
        val xJwsSignature: kotlin.String = TODO()
        val obWriteFileConsent3: OBWriteFileConsent3 = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteFileConsentResponse4> = api.createFilePaymentConsents(authorization, xIdempotencyKey, xJwsSignature, obWriteFileConsent3, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test FilePaymentConsentsApiController.createFilePaymentConsentsConsentIdFile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createFilePaymentConsentsConsentIdFileTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xIdempotencyKey: kotlin.String = TODO()
        val xJwsSignature: kotlin.String = TODO()
        val body: kotlin.Any = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<Unit> = api.createFilePaymentConsentsConsentIdFile(consentId, authorization, xIdempotencyKey, xJwsSignature, body, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test FilePaymentConsentsApiController.getFilePaymentConsentsConsentId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFilePaymentConsentsConsentIdTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteFileConsentResponse4> = api.getFilePaymentConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test FilePaymentConsentsApiController.getFilePaymentConsentsConsentIdFile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFilePaymentConsentsConsentIdFileTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<kotlin.Any> = api.getFilePaymentConsentsConsentIdFile(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
