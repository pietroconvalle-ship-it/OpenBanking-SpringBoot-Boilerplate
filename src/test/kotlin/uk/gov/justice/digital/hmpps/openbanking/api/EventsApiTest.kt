package uk.gov.justice.digital.hmpps.openbanking.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity
import uk.gov.justice.digital.hmpps.openbanking.model.OBEventPolling1
import uk.gov.justice.digital.hmpps.openbanking.model.OBEventPollingResponse1

class EventsApiTest {

  private val api: EventsApiController = EventsApiController()

  /**
   * To test EventsApiController.createEvents
   *
   * @throws ApiException
   *          if the Api call fails
   */
  @Test
  fun createEventsTest() {
    val authorization: kotlin.String = TODO()
    val obEventPolling1: OBEventPolling1 = TODO()
    val xFapiAuthDate: kotlin.String? = TODO()
    val xFapiCustomerIpAddress: kotlin.String? = TODO()
    val xFapiInteractionId: kotlin.String? = TODO()
    val xCustomerUserAgent: kotlin.String? = TODO()
    val response: ResponseEntity<OBEventPollingResponse1> = api.createEvents(authorization, obEventPolling1, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

    // TODO: test validations
  }
}
