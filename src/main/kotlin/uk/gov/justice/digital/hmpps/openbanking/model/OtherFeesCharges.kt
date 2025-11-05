package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.FeeChargeCapInner1
import uk.gov.justice.digital.hmpps.openbanking.model.FeeChargeDetailInner1
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
 * Contains details of fees and charges which are not associated with either borrowing or features/benefits
 * @param feeChargeDetail Other fees/charges details
 * @param feeChargeCap Details about any caps (maximum charges) that apply to a particular fee/charge
 */
data class OtherFeesCharges(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Other fees/charges details")
    @get:JsonProperty("FeeChargeDetail", required = true) val feeChargeDetail: kotlin.collections.List<FeeChargeDetailInner1>,

    @field:Valid
    @Schema(example = "null", description = "Details about any caps (maximum charges) that apply to a particular fee/charge")
    @get:JsonProperty("FeeChargeCap") val feeChargeCap: kotlin.collections.List<FeeChargeCapInner1>? = null
) {

}

