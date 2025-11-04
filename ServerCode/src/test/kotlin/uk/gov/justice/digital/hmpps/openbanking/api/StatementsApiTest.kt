package uk.gov.justice.digital.hmpps.openbanking.api

import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse1
import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse12
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadStatement2
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class StatementsApiTest {

    private val api: StatementsApiController = StatementsApiController()

    /**
     * To test StatementsApiController.getStatements
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getStatementsTest() {
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val fromStatementDateTime: java.time.OffsetDateTime? = TODO()
        val toStatementDateTime: java.time.OffsetDateTime? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadStatement2> = api.getStatements(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, fromStatementDateTime, toStatementDateTime, xCustomerUserAgent)

        // TODO: test validations
    }
}
