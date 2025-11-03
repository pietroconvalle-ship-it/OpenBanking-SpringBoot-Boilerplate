package org.openapitools.api

import org.openapitools.model.OBErrorResponse11
import org.openapitools.model.OBWriteInternationalStandingOrder4
import org.openapitools.model.OBWriteInternationalStandingOrderResponse7
import org.openapitools.model.OBWritePaymentDetailsResponse1
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class InternationalStandingOrdersApiTest {

    private val api: InternationalStandingOrdersApiController = InternationalStandingOrdersApiController()

    /**
     * To test InternationalStandingOrdersApiController.createInternationalStandingOrders
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createInternationalStandingOrdersTest() {
        val authorization: kotlin.String = TODO()
        val xIdempotencyKey: kotlin.String = TODO()
        val xJwsSignature: kotlin.String = TODO()
        val obWriteInternationalStandingOrder4: OBWriteInternationalStandingOrder4 = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteInternationalStandingOrderResponse7> = api.createInternationalStandingOrders(authorization, xIdempotencyKey, xJwsSignature, obWriteInternationalStandingOrder4, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test InternationalStandingOrdersApiController.getInternationalStandingOrdersInternationalStandingOrderPaymentId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getInternationalStandingOrdersInternationalStandingOrderPaymentIdTest() {
        val internationalStandingOrderPaymentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteInternationalStandingOrderResponse7> = api.getInternationalStandingOrdersInternationalStandingOrderPaymentId(internationalStandingOrderPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test InternationalStandingOrdersApiController.getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetailsTest() {
        val internationalStandingOrderPaymentId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWritePaymentDetailsResponse1> = api.getInternationalStandingOrdersInternationalStandingOrderPaymentIdPaymentDetails(internationalStandingOrderPaymentId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
