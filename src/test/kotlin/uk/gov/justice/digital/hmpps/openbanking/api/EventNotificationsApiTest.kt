package uk.gov.justice.digital.hmpps.openbanking.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class EventNotificationsApiTest {

  private val api: EventNotificationsApiController = EventNotificationsApiController()

  /**
   * To test EventNotificationsApiController.createEventNotification
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun createEventNotificationTest() {
    val xFapiFinancialId: kotlin.String = TODO()
    val body: kotlin.String = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val response: ResponseEntity<Unit> = api.createEventNotification(xFapiFinancialId, body, xFapiInteractionId)

    // TODO: test validations
  }
}
