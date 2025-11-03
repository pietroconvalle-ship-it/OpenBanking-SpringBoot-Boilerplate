package org.openapitools.api

import org.openapitools.model.OBErrorResponse11
import org.openapitools.model.OBWriteDomesticStandingOrder3
import org.openapitools.model.OBWriteDomesticStandingOrderResponse6
import org.openapitools.model.OBWritePaymentDetailsResponse1
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class DomesticStandingOrdersApiTest {

    private val api: DomesticStandingOrdersApiController = DomesticStandingOrdersApiController()

    /**
     * To test DomesticStandingOrdersApiController.createDomesticStandingOrders
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createDomesticStandingOrdersTest() {
        val authorization: kotlin.String = TODO()
        val xIdempotencyKey: kotlin.String = TODO()
        val xJwsSignature: kotlin.String = TODO()
        val obWriteDomesticStandingOrder3: OBWriteDomesticStandingOrder3 = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteDomesticStandingOrderResponse6> = api.createDomesticStandingOrders(authorization, xIdempotencyKey, xJwsSignature, obWriteDomesticStandingOrder3, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test DomesticStandingOrdersApiController.getDomesticStandingOrdersDomesticStandingOrderId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getDomesticStandingOrdersDomesticStandingOrderIdTest() {
        val domesticStandingOrderId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWriteDomesticStandingOrderResponse6> = api.getDomesticStandingOrdersDomesticStandingOrderId(domesticStandingOrderId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test DomesticStandingOrdersApiController.getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetailsTest() {
        val domesticStandingOrderId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBWritePaymentDetailsResponse1> = api.getDomesticStandingOrdersDomesticStandingOrderIdPaymentDetails(domesticStandingOrderId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
