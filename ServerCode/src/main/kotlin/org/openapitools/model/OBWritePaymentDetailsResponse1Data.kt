package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBWritePaymentDetails1
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param paymentStatus 
 */
data class OBWritePaymentDetailsResponse1Data(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PaymentStatus") val paymentStatus: kotlin.collections.List<OBWritePaymentDetails1>? = null
) {

}

