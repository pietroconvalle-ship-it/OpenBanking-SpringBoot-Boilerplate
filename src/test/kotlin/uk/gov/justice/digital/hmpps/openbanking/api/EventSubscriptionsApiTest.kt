package uk.gov.justice.digital.hmpps.openbanking.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity
import uk.gov.justice.digital.hmpps.openbanking.model.OBEventSubscription1
import uk.gov.justice.digital.hmpps.openbanking.model.OBEventSubscriptionResponse1
import uk.gov.justice.digital.hmpps.openbanking.model.OBEventSubscriptionsResponse1

class EventSubscriptionsApiTest {

  private val api: EventSubscriptionsApiController = EventSubscriptionsApiController()

  /**
   * To test EventSubscriptionsApiController.changeEventSubscriptionsEventSubscriptionId
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun changeEventSubscriptionsEventSubscriptionIdTest() {
    val eventSubscriptionId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xJwsSignature: kotlin.String = TODO()
    val obEventSubscriptionResponse1: OBEventSubscriptionResponse1 = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBEventSubscriptionResponse1> = api.changeEventSubscriptionsEventSubscriptionId(eventSubscriptionId, authorization, xJwsSignature, obEventSubscriptionResponse1, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test EventSubscriptionsApiController.createEventSubscriptions
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun createEventSubscriptionsTest() {
    val authorization: kotlin.String = TODO()
    val xJwsSignature: kotlin.String = TODO()
    val obEventSubscription1: OBEventSubscription1 = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBEventSubscriptionResponse1> = api.createEventSubscriptions(authorization, xJwsSignature, obEventSubscription1, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test EventSubscriptionsApiController.deleteEventSubscriptionsEventSubscriptionId
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun deleteEventSubscriptionsEventSubscriptionIdTest() {
    val eventSubscriptionId: kotlin.String = TODO()
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<Unit> = api.deleteEventSubscriptionsEventSubscriptionId(eventSubscriptionId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }

  /**
   * To test EventSubscriptionsApiController.getEventSubscriptions
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun getEventSubscriptionsTest() {
    val authorization: kotlin.String = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBEventSubscriptionsResponse1> = api.getEventSubscriptions(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }
}
