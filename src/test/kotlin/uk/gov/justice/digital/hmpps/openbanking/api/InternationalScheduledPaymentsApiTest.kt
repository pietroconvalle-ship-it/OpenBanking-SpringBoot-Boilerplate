package uk.gov.justice.digital.hmpps.openbanking.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalScheduled3
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalScheduledResponse6
import uk.gov.justice.digital.hmpps.openbanking.model.OBWritePaymentDetailsResponse1

class InternationalScheduledPaymentsApiTest {

  private val api: InternationalScheduledPaymentsApiController = InternationalScheduledPaymentsApiController()

  /**
   * To test InternationalScheduledPaymentsApiController.createInternationalScheduledPayments
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun createInternationalScheduledPaymentsTest() {
    val authorization: kotlin.String = TODO()
    val xIdempotencyKey: kotlin.String = TODO()
    val xJwsSignature: kotlin.String = TODO()
    val obWriteInternationalScheduled3: OBWriteInternationalScheduled3 = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWriteInternationalScheduledResponse6> = api.createInternationalScheduledPayments(authorization, xIdempotencyKey, xJwsSignature, obWriteInternationalScheduled3, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test InternationalScheduledPaymentsApiController.getInternationalScheduledPaymentsInternationalScheduledPaymentId
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun getInternationalScheduledPaymentsInternationalScheduledPaymentIdTest() {
    val internationalScheduledPaymentId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWriteInternationalScheduledResponse6> = api.getInternationalScheduledPaymentsInternationalScheduledPaymentId(internationalScheduledPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test InternationalScheduledPaymentsApiController.getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetailsTest() {
    val internationalScheduledPaymentId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWritePaymentDetailsResponse1> = api.getInternationalScheduledPaymentsInternationalScheduledPaymentIdPaymentDetails(internationalScheduledPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }
}
