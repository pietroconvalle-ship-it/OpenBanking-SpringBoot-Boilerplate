package uk.gov.justice.digital.hmpps.openbanking.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomestic2
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticResponse5
import uk.gov.justice.digital.hmpps.openbanking.model.OBWritePaymentDetailsResponse1

class DomesticPaymentsApiTest {

  private val api: DomesticPaymentsApiController = DomesticPaymentsApiController()

  /**
   * To test DomesticPaymentsApiController.createDomesticPayments
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun createDomesticPaymentsTest() {
    val authorization: kotlin.String = TODO()
    val xIdempotencyKey: kotlin.String = TODO()
    val xJwsSignature: kotlin.String = TODO()
    val obWriteDomestic2: OBWriteDomestic2 = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWriteDomesticResponse5> = api.createDomesticPayments(authorization, xIdempotencyKey, xJwsSignature, obWriteDomestic2, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test DomesticPaymentsApiController.getDomesticPaymentsDomesticPaymentId
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun getDomesticPaymentsDomesticPaymentIdTest() {
    val domesticPaymentId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWriteDomesticResponse5> = api.getDomesticPaymentsDomesticPaymentId(domesticPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test DomesticPaymentsApiController.getDomesticPaymentsDomesticPaymentIdPaymentDetails
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun getDomesticPaymentsDomesticPaymentIdPaymentDetailsTest() {
    val domesticPaymentId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBWritePaymentDetailsResponse1> = api.getDomesticPaymentsDomesticPaymentIdPaymentDetails(domesticPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }
}
