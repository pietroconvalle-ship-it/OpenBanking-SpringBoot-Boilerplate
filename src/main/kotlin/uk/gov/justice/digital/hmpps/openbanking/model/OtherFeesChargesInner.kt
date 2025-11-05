package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.FeeChargeCapInner
import uk.gov.justice.digital.hmpps.openbanking.model.FeeChargeDetailInner
import uk.gov.justice.digital.hmpps.openbanking.model.OtherTariffType
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
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 * @param feeChargeDetail Other fees/charges details
 * @param tariffType TariffType which defines the fee and charges.
 * @param tariffName Name of the tariff
 * @param otherTariffType 
 * @param feeChargeCap Details about any caps (maximum charges) that apply to a particular or group of fee/charge
 */
data class OtherFeesChargesInner(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Other fees/charges details")
    @get:JsonProperty("FeeChargeDetail", required = true) val feeChargeDetail: kotlin.collections.List<FeeChargeDetailInner>,

    @Schema(example = "null", description = "TariffType which defines the fee and charges.")
    @get:JsonProperty("TariffType") val tariffType: OtherFeesChargesInner.TariffType? = null,

    @get:Size(min=1,max=350)
    @Schema(example = "null", description = "Name of the tariff")
    @get:JsonProperty("TariffName") val tariffName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherTariffType") val otherTariffType: OtherTariffType? = null,

    @field:Valid
    @Schema(example = "null", description = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")
    @get:JsonProperty("FeeChargeCap") val feeChargeCap: kotlin.collections.List<FeeChargeCapInner>? = null
) {

    /**
    * TariffType which defines the fee and charges.
    * Values: Electronic,Mixed,Other
    */
    enum class TariffType(val value: kotlin.String) {

        @JsonProperty("Electronic") Electronic("Electronic"),
        @JsonProperty("Mixed") Mixed("Mixed"),
        @JsonProperty("Other") Other("Other")
    }

}

