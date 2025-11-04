package uk.gov.justice.digital.hmpps.openbanking.api

import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse1
import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse12
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadDirectDebit2
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
