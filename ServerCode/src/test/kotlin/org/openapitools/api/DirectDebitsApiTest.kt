package org.openapitools.api

import org.openapitools.model.OBErrorResponse1
import org.openapitools.model.OBErrorResponse12
import org.openapitools.model.OBReadDirectDebit2
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class DirectDebitsApiTest {

    private val api: DirectDebitsApiController = DirectDebitsApiController()

    /**
     * To test DirectDebitsApiController.getDirectDebits
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getDirectDebitsTest() {
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadDirectDebit2> = api.getDirectDebits(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
