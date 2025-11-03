package org.openapitools.api

import org.openapitools.model.OBErrorResponse1
import org.openapitools.model.OBErrorResponse12
import org.openapitools.model.OBReadBalance1
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class BalancesApiTest {

    private val api: BalancesApiController = BalancesApiController()

    /**
     * To test BalancesApiController.getBalances
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBalancesTest() {
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadBalance1> = api.getBalances(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
