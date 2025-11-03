package org.openapitools.api

import org.openapitools.model.OBErrorResponse1
import org.openapitools.model.OBErrorResponse12
import org.openapitools.model.OBReadScheduledPayment3
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ScheduledPaymentsApiTest {

    private val api: ScheduledPaymentsApiController = ScheduledPaymentsApiController()

    /**
     * To test ScheduledPaymentsApiController.getScheduledPayments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getScheduledPaymentsTest() {
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadScheduledPayment3> = api.getScheduledPayments(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
