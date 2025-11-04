package uk.gov.justice.digital.hmpps.openbanking.api

import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse12
import uk.gov.justice.digital.hmpps.openbanking.model.OBFundsConfirmation1
import uk.gov.justice.digital.hmpps.openbanking.model.OBFundsConfirmationResponse1
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class FundsConfirmationsApiTest {

    private val api: FundsConfirmationsApiController = FundsConfirmationsApiController()

    /**
     * To test FundsConfirmationsApiController.createFundsConfirmations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createFundsConfirmationsTest() {
        val authorization: kotlin.String = TODO()
        val obFundsConfirmation1: OBFundsConfirmation1 = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBFundsConfirmationResponse1> = api.createFundsConfirmations(authorization, obFundsConfirmation1, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
