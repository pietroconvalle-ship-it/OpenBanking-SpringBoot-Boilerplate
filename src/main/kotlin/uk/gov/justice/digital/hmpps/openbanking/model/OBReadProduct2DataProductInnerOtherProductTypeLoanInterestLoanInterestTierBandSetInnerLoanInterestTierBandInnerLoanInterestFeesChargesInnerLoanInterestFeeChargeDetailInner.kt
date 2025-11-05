package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBFeeFrequency1Code2
import uk.gov.justice.digital.hmpps.openbanking.model.OBFeeFrequency1Code3
import uk.gov.justice.digital.hmpps.openbanking.model.OBFeeType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBInterestRateType1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.OBOtherCodeType15
import uk.gov.justice.digital.hmpps.openbanking.model.OBOtherCodeType16
import uk.gov.justice.digital.hmpps.openbanking.model.OBOtherCodeType17
import uk.gov.justice.digital.hmpps.openbanking.model.OBOtherFeeChargeDetailType
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
 * Other fees/charges details
 * @param feeType 
 * @param applicationFrequency 
 * @param calculationFrequency 
 * @param negotiableIndicator Fee/charge which is usually negotiable rather than a fixed amount
 * @param feeAmount Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
 * @param feeRate Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
 * @param feeRateType 
 * @param notes 
 * @param otherFeeType 
 * @param otherFeeRateType 
 * @param otherApplicationFrequency 
 * @param otherCalculationFrequency 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("FeeType", required = true) val feeType: OBFeeType1Code,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ApplicationFrequency", required = true) val applicationFrequency: OBFeeFrequency1Code2,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CalculationFrequency", required = true) val calculationFrequency: OBFeeFrequency1Code3,

    @Schema(example = "null", description = "Fee/charge which is usually negotiable rather than a fixed amount")
    @get:JsonProperty("NegotiableIndicator") val negotiableIndicator: kotlin.Boolean? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
    @get:JsonProperty("FeeAmount") val feeAmount: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)")
    @get:JsonProperty("FeeRate") val feeRate: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("FeeRateType") val feeRateType: OBInterestRateType1Code1? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherFeeType") val otherFeeType: OBOtherFeeChargeDetailType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherFeeRateType") val otherFeeRateType: OBOtherCodeType15? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherApplicationFrequency") val otherApplicationFrequency: OBOtherCodeType16? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherCalculationFrequency") val otherCalculationFrequency: OBOtherCodeType17? = null
) {

}

