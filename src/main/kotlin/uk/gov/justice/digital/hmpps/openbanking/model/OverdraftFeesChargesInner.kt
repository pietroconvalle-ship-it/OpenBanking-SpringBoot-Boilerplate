package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OverdraftFeeChargeCapInner
import uk.gov.justice.digital.hmpps.openbanking.model.OverdraftFeeChargeDetailInner
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
 * Overdraft fees and charges
 * @param overdraftFeeChargeDetail Details about the fees/charges
 * @param overdraftFeeChargeCap Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
 */
data class OverdraftFeesChargesInner(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Details about the fees/charges")
    @get:JsonProperty("OverdraftFeeChargeDetail", required = true) val overdraftFeeChargeDetail: kotlin.collections.List<OverdraftFeeChargeDetailInner>,

    @field:Valid
    @Schema(example = "null", description = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")
    @get:JsonProperty("OverdraftFeeChargeCap") val overdraftFeeChargeCap: kotlin.collections.List<OverdraftFeeChargeCapInner>? = null
) {

}

