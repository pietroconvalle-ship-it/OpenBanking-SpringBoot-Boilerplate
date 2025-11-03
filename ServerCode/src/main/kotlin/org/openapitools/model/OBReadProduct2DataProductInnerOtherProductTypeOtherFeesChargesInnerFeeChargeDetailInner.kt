package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBFeeCategory1Code
import org.openapitools.model.OBFeeFrequency1Code2
import org.openapitools.model.OBFeeFrequency1Code3
import org.openapitools.model.OBFeeType1Code
import org.openapitools.model.OBInterestRateType1Code1
import org.openapitools.model.OBOtherCodeType10
import org.openapitools.model.OBOtherCodeType16
import org.openapitools.model.OBOtherCodeType17
import org.openapitools.model.OBOtherCodeType18
import org.openapitools.model.OBOtherFeeChargeDetailType
import org.openapitools.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange
import org.openapitools.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner
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
 * @param feeCategory 
 * @param feeType 
 * @param applicationFrequency 
 * @param negotiableIndicator Fee/charge which is usually negotiable rather than a fixed amount
 * @param feeAmount Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
 * @param feeRate Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
 * @param feeRateType 
 * @param calculationFrequency 
 * @param notes 
 * @param feeChargeCap 
 * @param otherFeeCategoryType 
 * @param otherFeeType 
 * @param otherFeeRateType 
 * @param otherApplicationFrequency 
 * @param otherCalculationFrequency 
 * @param feeApplicableRange 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("FeeCategory", required = true) val feeCategory: OBFeeCategory1Code,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("FeeType", required = true) val feeType: OBFeeType1Code,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ApplicationFrequency", required = true) val applicationFrequency: OBFeeFrequency1Code2,

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

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CalculationFrequency") val calculationFrequency: OBFeeFrequency1Code3? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("FeeChargeCap") val feeChargeCap: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherFeeCategoryType") val otherFeeCategoryType: OBOtherCodeType10? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherFeeType") val otherFeeType: OBOtherFeeChargeDetailType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherFeeRateType") val otherFeeRateType: OBOtherCodeType18? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherApplicationFrequency") val otherApplicationFrequency: OBOtherCodeType16? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherCalculationFrequency") val otherCalculationFrequency: OBOtherCodeType17? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("FeeApplicableRange") val feeApplicableRange: OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange? = null
) {

}

