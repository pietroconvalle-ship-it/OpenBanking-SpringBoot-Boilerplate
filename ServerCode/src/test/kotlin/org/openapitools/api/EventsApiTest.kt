package org.openapitools.api

import org.openapitools.model.OBErrorResponse13
import org.openapitools.model.OBEventPolling1
import org.openapitools.model.OBEventPollingResponse1
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

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
