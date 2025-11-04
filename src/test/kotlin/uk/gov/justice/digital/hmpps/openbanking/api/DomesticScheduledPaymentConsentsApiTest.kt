package uk.gov.justice.digital.hmpps.openbanking.api

import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse11
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticScheduledConsent4
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticScheduledConsentResponse5
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class DomesticScheduledPaymentConsentsApiTest {

    private val api: DomesticScheduledPaymentConsentsApiController = DomesticScheduledPaymentConsentsApiController()

    /**
     * To test DomesticScheduledPaymentConsentsApiController.createDomesticScheduledPaymentConsents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createDomesticScheduledPaymentConsentsTest() {
        val authorization: kotlin.String = TODO()
        val xIdempotencyKey: kotlin.String = TODO()
        val xJwsSignature: kotlin.String = TODO()
        val obWriteDomesticScheduledConsent4: OBWriteDomesticScheduledConsent4 = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteDomesticScheduledConsentResponse5> = api.createDomesticScheduledPaymentConsents(authorization, xIdempotencyKey, xJwsSignature, obWriteDomesticScheduledConsent4, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test DomesticScheduledPaymentConsentsApiController.getDomesticScheduledPaymentConsentsConsentId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getDomesticScheduledPaymentConsentsConsentIdTest() {
        val consentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteDomesticScheduledConsentResponse5> = api.getDomesticScheduledPaymentConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
