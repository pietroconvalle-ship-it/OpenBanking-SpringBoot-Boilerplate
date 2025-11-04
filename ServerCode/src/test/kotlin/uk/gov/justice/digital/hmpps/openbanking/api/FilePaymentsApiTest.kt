package uk.gov.justice.digital.hmpps.openbanking.api

import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse11
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteFile2
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteFileResponse3
import uk.gov.justice.digital.hmpps.openbanking.model.OBWritePaymentDetailsResponse1
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class FilePaymentsApiTest {

    private val api: FilePaymentsApiController = FilePaymentsApiController()

    /**
     * To test FilePaymentsApiController.createFilePayments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createFilePaymentsTest() {
        val authorization: kotlin.String = TODO()
        val xIdempotencyKey: kotlin.String = TODO()
        val xJwsSignature: kotlin.String = TODO()
        val obWriteFile2: OBWriteFile2 = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteFileResponse3> = api.createFilePayments(authorization, xIdempotencyKey, xJwsSignature, obWriteFile2, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test FilePaymentsApiController.getFilePaymentsFilePaymentId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFilePaymentsFilePaymentIdTest() {
        val filePaymentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteFileResponse3> = api.getFilePaymentsFilePaymentId(filePaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test FilePaymentsApiController.getFilePaymentsFilePaymentIdPaymentDetails
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFilePaymentsFilePaymentIdPaymentDetailsTest() {
        val filePaymentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWritePaymentDetailsResponse1> = api.getFilePaymentsFilePaymentIdPaymentDetails(filePaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test FilePaymentsApiController.getFilePaymentsFilePaymentIdReportFile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getFilePaymentsFilePaymentIdReportFileTest() {
        val filePaymentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<kotlin.Any> = api.getFilePaymentsFilePaymentIdReportFile(filePaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
