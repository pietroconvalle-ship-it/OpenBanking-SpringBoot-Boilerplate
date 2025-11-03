package org.openapitools.api

import org.openapitools.model.OBErrorResponse1
import org.openapitools.model.OBErrorResponse12
import org.openapitools.model.OBReadStandingOrder6
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class StandingOrdersApiTest {

    private val api: StandingOrdersApiController = StandingOrdersApiController()

    /**
     * To test StandingOrdersApiController.getStandingOrders
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getStandingOrdersTest() {
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadStandingOrder6> = api.getStandingOrders(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
