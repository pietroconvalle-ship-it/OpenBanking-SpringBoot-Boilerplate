package uk.gov.justice.digital.hmpps.openbanking.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteFundsConfirmationResponse1
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalScheduledConsent5
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalScheduledConsentResponse6

class InternationalScheduledPaymentConsentsApiTest {

  private val api: InternationalScheduledPaymentConsentsApiController = InternationalScheduledPaymentConsentsApiController()

  /**
   * To test InternationalScheduledPaymentConsentsApiController.createInternationalScheduledPaymentConsents
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun createInternationalScheduledPaymentConsentsTest() {
    val authorization: kotlin.String = TODO()
    val xIdempotencyKey: kotlin.String = TODO()
    val xJwsSignature: kotlin.String = TODO()
    val obWriteInternationalScheduledConsent5: OBWriteInternationalScheduledConsent5 = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWriteInternationalScheduledConsentResponse6> = api.createInternationalScheduledPaymentConsents(authorization, xIdempotencyKey, xJwsSignature, obWriteInternationalScheduledConsent5, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test InternationalScheduledPaymentConsentsApiController.getInternationalScheduledPaymentConsentsConsentId
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun getInternationalScheduledPaymentConsentsConsentIdTest() {
    val consentId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWriteInternationalScheduledConsentResponse6> = api.getInternationalScheduledPaymentConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test InternationalScheduledPaymentConsentsApiController.getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun getInternationalScheduledPaymentConsentsConsentIdFundsConfirmationTest() {
    val consentId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWriteFundsConfirmationResponse1> = api.getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }
}
