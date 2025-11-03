package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OverdraftFeeChargeCapInner
import org.openapitools.model.OverdraftFeeChargeDetailInner
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
 * Overdraft fees and charges details
 * @param overdraftFeeChargeDetail Details about the fees/charges
 * @param overdraftFeeChargeCap Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
 */
data class OverdraftFeesChargesInner1(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Details about the fees/charges")
    @get:JsonProperty("OverdraftFeeChargeDetail", required = true) val overdraftFeeChargeDetail: kotlin.collections.List<OverdraftFeeChargeDetailInner>,

    @field:Valid
    @Schema(example = "null", description = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")
    @get:JsonProperty("OverdraftFeeChargeCap") val overdraftFeeChargeCap: kotlin.collections.List<OverdraftFeeChargeCapInner>? = null
) {

}

