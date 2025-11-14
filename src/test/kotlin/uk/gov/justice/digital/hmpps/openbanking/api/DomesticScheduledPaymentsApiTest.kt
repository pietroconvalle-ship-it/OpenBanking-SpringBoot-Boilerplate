package uk.gov.justice.digital.hmpps.openbanking.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticScheduled2
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticScheduledResponse5
import uk.gov.justice.digital.hmpps.openbanking.model.OBWritePaymentDetailsResponse1

class DomesticScheduledPaymentsApiTest {

  private val api: DomesticScheduledPaymentsApiController = DomesticScheduledPaymentsApiController()

  /**
   * To test DomesticScheduledPaymentsApiController.createDomesticScheduledPayments
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun createDomesticScheduledPaymentsTest() {
    val authorization: kotlin.String = TODO()
    val xIdempotencyKey: kotlin.String = TODO()
    val xJwsSignature: kotlin.String = TODO()
    val obWriteDomesticScheduled2: OBWriteDomesticScheduled2 = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWriteDomesticScheduledResponse5> = api.createDomesticScheduledPayments(authorization, xIdempotencyKey, xJwsSignature, obWriteDomesticScheduled2, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test DomesticScheduledPaymentsApiController.getDomesticScheduledPaymentsDomesticScheduledPaymentId
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun getDomesticScheduledPaymentsDomesticScheduledPaymentIdTest() {
    val domesticScheduledPaymentId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWriteDomesticScheduledResponse5> = api.getDomesticScheduledPaymentsDomesticScheduledPaymentId(domesticScheduledPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test DomesticScheduledPaymentsApiController.getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetailsTest() {
    val domesticScheduledPaymentId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWritePaymentDetailsResponse1> = api.getDomesticScheduledPaymentsDomesticScheduledPaymentIdPaymentDetails(domesticScheduledPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }
}
