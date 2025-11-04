package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBFeeFrequency1Code4
import uk.gov.justice.digital.hmpps.openbanking.model.OBMinMaxType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner
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
 * Details about any caps (minimum/maximum charges) that apply to a particular fee/charge
 * @param feeType 
 * @param minMaxType 
 * @param feeCapOccurrence fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
 * @param feeCapAmount Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
 * @param cappingPeriod 
 * @param notes 
 * @param otherFeeType 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner(

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("FeeType", required = true) val feeType: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.FeeType>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("MinMaxType", required = true) val minMaxType: OBMinMaxType1Code,

    @Schema(example = "null", description = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")
    @get:JsonProperty("FeeCapOccurrence") val feeCapOccurrence: kotlin.Int? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
    @get:JsonProperty("FeeCapAmount") val feeCapAmount: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CappingPeriod") val cappingPeriod: OBFeeFrequency1Code4? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherFeeType") val otherFeeType: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner>? = null
) {

    /**
    * 
    * Values: FEPF,FTOT,FYAF,FYAM,FYAQ,FYCP,FYDB,FYMI,FYXX
    */
    enum class FeeType(val value: kotlin.String) {

        @JsonProperty("FEPF") FEPF("FEPF"),
        @JsonProperty("FTOT") FTOT("FTOT"),
        @JsonProperty("FYAF") FYAF("FYAF"),
        @JsonProperty("FYAM") FYAM("FYAM"),
        @JsonProperty("FYAQ") FYAQ("FYAQ"),
        @JsonProperty("FYCP") FYCP("FYCP"),
        @JsonProperty("FYDB") FYDB("FYDB"),
        @JsonProperty("FYMI") FYMI("FYMI"),
        @JsonProperty("FYXX") FYXX("FYXX")
    }

}

