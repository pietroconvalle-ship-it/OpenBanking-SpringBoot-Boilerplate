package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OtherFeeTypeInner
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
 * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
 * @param feeType Fee/charge type which is being capped
 * @param minMaxType Min Max type
 * @param feeCapOccurrence fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
 * @param feeCapAmount Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
 * @param cappingPeriod Period e.g. day, week, month etc. for which the fee/charge is capped
 * @param notes Free text for adding  extra details for fee charge cap
 * @param otherFeeType Other fee type code which is not available in the standard code set
 */
data class FeeChargeCapInner(

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Fee/charge type which is being capped")
    @get:JsonProperty("FeeType", required = true) val feeType: kotlin.collections.List<FeeChargeCapInner.FeeType>,

    @Schema(example = "null", required = true, description = "Min Max type")
    @get:JsonProperty("MinMaxType", required = true) val minMaxType: FeeChargeCapInner.MinMaxType,

    @Schema(example = "null", description = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")
    @get:JsonProperty("FeeCapOccurrence") val feeCapOccurrence: kotlin.Float? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
    @get:JsonProperty("FeeCapAmount") val feeCapAmount: kotlin.String? = null,

    @Schema(example = "null", description = "Period e.g. day, week, month etc. for which the fee/charge is capped")
    @get:JsonProperty("CappingPeriod") val cappingPeriod: FeeChargeCapInner.CappingPeriod? = null,

    @Schema(example = "null", description = "Free text for adding  extra details for fee charge cap")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Other fee type code which is not available in the standard code set")
    @get:JsonProperty("OtherFeeType") val otherFeeType: kotlin.collections.List<OtherFeeTypeInner>? = null
) {

    /**
    * Fee/charge type which is being capped
    * Values: Other,ServiceCAccountFee,ServiceCAccountFeeMonthly,ServiceCAccountFeeQuarterly,ServiceCFixedTariff,ServiceCBusiDepAccBreakage,ServiceCMinimumMonthlyFee,ServiceCOther
    */
    enum class FeeType(val value: kotlin.String) {

        @JsonProperty("Other") Other("Other"),
        @JsonProperty("ServiceCAccountFee") ServiceCAccountFee("ServiceCAccountFee"),
        @JsonProperty("ServiceCAccountFeeMonthly") ServiceCAccountFeeMonthly("ServiceCAccountFeeMonthly"),
        @JsonProperty("ServiceCAccountFeeQuarterly") ServiceCAccountFeeQuarterly("ServiceCAccountFeeQuarterly"),
        @JsonProperty("ServiceCFixedTariff") ServiceCFixedTariff("ServiceCFixedTariff"),
        @JsonProperty("ServiceCBusiDepAccBreakage") ServiceCBusiDepAccBreakage("ServiceCBusiDepAccBreakage"),
        @JsonProperty("ServiceCMinimumMonthlyFee") ServiceCMinimumMonthlyFee("ServiceCMinimumMonthlyFee"),
        @JsonProperty("ServiceCOther") ServiceCOther("ServiceCOther")
    }

    /**
    * Min Max type
    * Values: Minimum,Maximum
    */
    enum class MinMaxType(val value: kotlin.String) {

        @JsonProperty("Minimum") Minimum("Minimum"),
        @JsonProperty("Maximum") Maximum("Maximum")
    }

    /**
    * Period e.g. day, week, month etc. for which the fee/charge is capped
    * Values: Day,Half_Year,Month,Quarter,Week,Year
    */
    enum class CappingPeriod(val value: kotlin.String) {

        @JsonProperty("Day") Day("Day"),
        @JsonProperty("Half Year") Half_Year("Half Year"),
        @JsonProperty("Month") Month("Month"),
        @JsonProperty("Quarter") Quarter("Quarter"),
        @JsonProperty("Week") Week("Week"),
        @JsonProperty("Year") Year("Year")
    }

}

