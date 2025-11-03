package org.openapitools.api

import org.openapitools.model.OBErrorResponse1
import org.openapitools.model.OBErrorResponse12
import org.openapitools.model.OBReadProduct2
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ProductsApiTest {

    private val api: ProductsApiController = ProductsApiController()

    /**
     * To test ProductsApiController.getProducts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getProductsTest() {
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadProduct2> = api.getProducts(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }
}
