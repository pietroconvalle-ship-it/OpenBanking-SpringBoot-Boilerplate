package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreditInterest1
import org.openapitools.model.OtherFeesCharges
import org.openapitools.model.Overdraft1
import org.openapitools.model.ProductDetails1
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
 * @param productDetails 
 * @param creditInterest 
 * @param overdraft 
 * @param otherFeesCharges 
 */
data class OBPCAData1(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ProductDetails") val productDetails: ProductDetails1? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CreditInterest") val creditInterest: CreditInterest1? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Overdraft") val overdraft: Overdraft1? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherFeesCharges") val otherFeesCharges: OtherFeesCharges? = null
) {

}

