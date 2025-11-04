package uk.gov.justice.digital.hmpps.openbanking.api

import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse11
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteFundsConfirmationResponse1
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalConsent5
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalConsentResponse6
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class InternationalPaymentConsentsApiTest {

    private val api: InternationalPaymentConsentsApiController = InternationalPaymentConsentsApiController()

    /**
     * To test InternationalPaymentConsentsApiController.createInternationalPaymentConsents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createInternationalPaymentConsentsTest() {
        val authorization: kotlin.String = TODO()
        val xIdempotencyKey: kotlin.String = TODO()
        val xJwsSignature: kotlin.String = TODO()
        val obWriteInternationalConsent5: OBWriteInternationalConsent5 = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteInternationalConsentResponse6> = api.createInternationalPaymentConsents(authorization, xIdempotencyKey, xJwsSignature, obWriteInternationalConsent5, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test InternationalPaymentConsentsApiController.getInternationalPaymentConsentsConsentId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getInternationalPaymentConsentsConsentIdTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteInternationalConsentResponse6> = api.getInternationalPaymentConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test InternationalPaymentConsentsApiController.getInternationalPaymentConsentsConsentIdFundsConfirmation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getInternationalPaymentConsentsConsentIdFundsConfirmationTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteFundsConfirmationResponse1> = api.getInternationalPaymentConsentsConsentIdFundsConfirmation(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
