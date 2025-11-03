package org.openapitools.api

import org.openapitools.model.OBErrorResponse1
import org.openapitools.model.OBErrorResponse12
import org.openapitools.model.OBReadTransaction6
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class TransactionsApiTest {

    private val api: TransactionsApiController = TransactionsApiController()

    /**
     * To test TransactionsApiController.getTransactions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getTransactionsTest() {
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val fromBookingDateTime: java.time.OffsetDateTime? = TODO()
        val toBookingDateTime: java.time.OffsetDateTime? = TODO()
        val response: ResponseEntity<OBReadTransaction6> = api.getTransactions(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, fromBookingDateTime, toBookingDateTime)

        // TODO: test validations
    }
}
