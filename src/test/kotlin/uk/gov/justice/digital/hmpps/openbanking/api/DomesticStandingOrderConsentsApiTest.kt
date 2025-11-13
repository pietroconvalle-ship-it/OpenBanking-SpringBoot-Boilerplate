package uk.gov.justice.digital.hmpps.openbanking.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrderConsent5
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrderConsentResponse6

class DomesticStandingOrderConsentsApiTest {

  private val api: DomesticStandingOrderConsentsApiController = DomesticStandingOrderConsentsApiController()

  /**
   * To test DomesticStandingOrderConsentsApiController.createDomesticStandingOrderConsents
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun createDomesticStandingOrderConsentsTest() {
    val authorization: kotlin.String = TODO()
    val xIdempotencyKey: kotlin.String = TODO()
    val xJwsSignature: kotlin.String = TODO()
    val obWriteDomesticStandingOrderConsent5: OBWriteDomesticStandingOrderConsent5 = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWriteDomesticStandingOrderConsentResponse6> = api.createDomesticStandingOrderConsents(authorization, xIdempotencyKey, xJwsSignature, obWriteDomesticStandingOrderConsent5, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test DomesticStandingOrderConsentsApiController.getDomesticStandingOrderConsentsConsentId
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun getDomesticStandingOrderConsentsConsentIdTest() {
    val consentId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWriteDomesticStandingOrderConsentResponse6> = api.getDomesticStandingOrderConsentsConsentId(consentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }
}
