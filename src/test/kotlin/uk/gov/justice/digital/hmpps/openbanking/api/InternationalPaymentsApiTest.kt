package uk.gov.justice.digital.hmpps.openbanking.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternational3
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalResponse5
import uk.gov.justice.digital.hmpps.openbanking.model.OBWritePaymentDetailsResponse1

class InternationalPaymentsApiTest {

  private val api: InternationalPaymentsApiController = InternationalPaymentsApiController()

  /**
   * To test InternationalPaymentsApiController.createInternationalPayments
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun createInternationalPaymentsTest() {
    val authorization: kotlin.String = TODO()
    val xIdempotencyKey: kotlin.String = TODO()
    val xJwsSignature: kotlin.String = TODO()
    val obWriteInternational3: OBWriteInternational3 = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWriteInternationalResponse5> = api.createInternationalPayments(authorization, xIdempotencyKey, xJwsSignature, obWriteInternational3, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test InternationalPaymentsApiController.getInternationalPaymentsInternationalPaymentId
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun getInternationalPaymentsInternationalPaymentIdTest() {
    val internationalPaymentId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWriteInternationalResponse5> = api.getInternationalPaymentsInternationalPaymentId(internationalPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test InternationalPaymentsApiController.getInternationalPaymentsInternationalPaymentIdPaymentDetails
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun getInternationalPaymentsInternationalPaymentIdPaymentDetailsTest() {
    val internationalPaymentId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWritePaymentDetailsResponse1> = api.getInternationalPaymentsInternationalPaymentIdPaymentDetails(internationalPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }
}
