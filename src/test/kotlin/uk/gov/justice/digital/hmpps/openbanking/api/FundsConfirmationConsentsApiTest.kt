package uk.gov.justice.digital.hmpps.openbanking.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity
import uk.gov.justice.digital.hmpps.openbanking.model.OBFundsConfirmationConsent1
import uk.gov.justice.digital.hmpps.openbanking.model.OBFundsConfirmationConsentResponse1

class FundsConfirmationConsentsApiTest {

  private val api: FundsConfirmationConsentsApiController = FundsConfirmationConsentsApiController()

  /**
   * To test FundsConfirmationConsentsApiController.createFundsConfirmationConsents
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun createFundsConfirmationConsentsTest() {
    val authorization: kotlin.String = TODO()
    val obFundsConfirmationConsent1: OBFundsConfirmationConsent1 = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBFundsConfirmationConsentResponse1> = api.createFundsConfirmationConsents(authorization, obFundsConfirmationConsent1, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test FundsConfirmationConsentsApiController.deleteFundsConfirmationConsentsConsentId
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun deleteFundsConfirmationConsentsConsentIdTest() {
    val consentId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<Unit> = api.deleteFundsConfirmationConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test FundsConfirmationConsentsApiController.getFundsConfirmationConsentsConsentId
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun getFundsConfirmationConsentsConsentIdTest() {
    val consentId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBFundsConfirmationConsentResponse1> = api.getFundsConfirmationConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }
}
