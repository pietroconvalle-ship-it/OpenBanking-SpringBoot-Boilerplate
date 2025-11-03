package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBMinMaxType1Code
import org.openapitools.model.OBPeriod1Code
import org.openapitools.model.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner
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
 * RepaymentFeeChargeCap sets daily, weekly, monthly, yearly limits on the fees that are charged
 * @param feeType 
 * @param minMaxType 
 * @param feeCapOccurrence fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
 * @param feeCapAmount Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
 * @param cappingPeriod 
 * @param notes 
 * @param otherFeeType 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner(

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("FeeType", required = true) val feeType: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner.FeeType>,

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
    @get:JsonProperty("CappingPeriod") val cappingPeriod: OBPeriod1Code? = null,

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

