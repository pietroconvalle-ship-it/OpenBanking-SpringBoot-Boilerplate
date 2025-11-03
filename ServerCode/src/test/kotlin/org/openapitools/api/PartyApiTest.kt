package org.openapitools.api

import org.openapitools.model.OBErrorResponse1
import org.openapitools.model.OBErrorResponse12
import org.openapitools.model.OBReadParty2
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class PartyApiTest {

    private val api: PartyApiController = PartyApiController()

    /**
     * To test PartyApiController.getParty
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPartyTest() {
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadParty2> = api.getParty(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
