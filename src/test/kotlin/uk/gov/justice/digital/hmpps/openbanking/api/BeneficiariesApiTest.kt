package uk.gov.justice.digital.hmpps.openbanking.api

import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse1
import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse12
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadBeneficiary5
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class BeneficiariesApiTest {

    private val api: BeneficiariesApiController = BeneficiariesApiController()

    /**
     * To test BeneficiariesApiController.getBeneficiaries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBeneficiariesTest() {
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadBeneficiary5> = api.getBeneficiaries(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
