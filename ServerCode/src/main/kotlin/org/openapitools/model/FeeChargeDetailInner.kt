package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.FeeApplicableRange
import org.openapitools.model.FeeChargeCapInner
import org.openapitools.model.OtherApplicationFrequency1
import org.openapitools.model.OtherCalculationFrequency1
import org.openapitools.model.OtherFeeCategoryType
import org.openapitools.model.OtherFeeRateType1
import org.openapitools.model.OtherFeeType1
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
 * @param feeCategory Categorisation of fees and charges into standard categories.
 * @param feeType Fee/Charge Type
 * @param applicationFrequency How frequently the fee/charge is applied to the account
 * @param negotiableIndicator Fee/charge which is usually negotiable rather than a fixed amount
 * @param feeAmount Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
 * @param feeRate Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
 * @param feeRateType Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
 * @param calculationFrequency How frequently the fee/charge is calculated
 * @param notes Optional additional notes to supplement the fee/charge details.
 * @param feeChargeCap Details about any caps (maximum charges) that apply to a particular or group of fee/charge
 * @param otherFeeCategoryType 
 * @param otherFeeType 
 * @param otherFeeRateType 
 * @param otherApplicationFrequency 
 * @param otherCalculationFrequency 
 * @param feeApplicableRange 
 */
data class FeeChargeDetailInner(

    @Schema(example = "null", required = true, description = "Categorisation of fees and charges into standard categories.")
    @get:JsonProperty("FeeCategory", required = true) val feeCategory: FeeChargeDetailInner.FeeCategory,

    @Schema(example = "null", required = true, description = "Fee/Charge Type")
    @get:JsonProperty("FeeType", required = true) val feeType: FeeChargeDetailInner.FeeType,

    @Schema(example = "null", required = true, description = "How frequently the fee/charge is applied to the account")
    @get:JsonProperty("ApplicationFrequency", required = true) val applicationFrequency: FeeChargeDetailInner.ApplicationFrequency,

    @Schema(example = "null", description = "Fee/charge which is usually negotiable rather than a fixed amount")
    @get:JsonProperty("NegotiableIndicator") val negotiableIndicator: kotlin.Boolean? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
    @get:JsonProperty("FeeAmount") val feeAmount: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)")
    @get:JsonProperty("FeeRate") val feeRate: kotlin.String? = null,

    @Schema(example = "null", description = "Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)")
    @get:JsonProperty("FeeRateType") val feeRateType: FeeChargeDetailInner.FeeRateType? = null,

    @Schema(example = "null", description = "How frequently the fee/charge is calculated")
    @get:JsonProperty("CalculationFrequency") val calculationFrequency: FeeChargeDetailInner.CalculationFrequency? = null,

    @Schema(example = "null", description = "Optional additional notes to supplement the fee/charge details.")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")
    @get:JsonProperty("FeeChargeCap") val feeChargeCap: kotlin.collections.List<FeeChargeCapInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherFeeCategoryType") val otherFeeCategoryType: OtherFeeCategoryType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherFeeType") val otherFeeType: OtherFeeType1? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherFeeRateType") val otherFeeRateType: OtherFeeRateType1? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherApplicationFrequency") val otherApplicationFrequency: OtherApplicationFrequency1? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherCalculationFrequency") val otherCalculationFrequency: OtherCalculationFrequency1? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("FeeApplicableRange") val feeApplicableRange: FeeApplicableRange? = null
) {

    /**
    * Categorisation of fees and charges into standard categories.
    * Values: Other,Servicing
    */
    enum class FeeCategory(val value: kotlin.String) {

        @JsonProperty("Other") Other("Other"),
        @JsonProperty("Servicing") Servicing("Servicing")
    }

    /**
    * Fee/Charge Type
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
    * How frequently the fee/charge is applied to the account
    * Values: OnClosing,OnOpening,ChargingPeriod,Daily,PerItem,Monthly,OnAnniversary,Other,PerHundredPounds,PerHour,PerOccurrence,PerSheet,PerTransaction,PerTransactionAmount,PerTransactionPercentage,Quarterly,SixMonthly,StatementMonthly,Weekly,Yearly
    */
    enum class ApplicationFrequency(val value: kotlin.String) {

        @JsonProperty("OnClosing") OnClosing("OnClosing"),
        @JsonProperty("OnOpening") OnOpening("OnOpening"),
        @JsonProperty("ChargingPeriod") ChargingPeriod("ChargingPeriod"),
        @JsonProperty("Daily") Daily("Daily"),
        @JsonProperty("PerItem") PerItem("PerItem"),
        @JsonProperty("Monthly") Monthly("Monthly"),
        @JsonProperty("OnAnniversary") OnAnniversary("OnAnniversary"),
        @JsonProperty("Other") Other("Other"),
        @JsonProperty("PerHundredPounds") PerHundredPounds("PerHundredPounds"),
        @JsonProperty("PerHour") PerHour("PerHour"),
        @JsonProperty("PerOccurrence") PerOccurrence("PerOccurrence"),
        @JsonProperty("PerSheet") PerSheet("PerSheet"),
        @JsonProperty("PerTransaction") PerTransaction("PerTransaction"),
        @JsonProperty("PerTransactionAmount") PerTransactionAmount("PerTransactionAmount"),
        @JsonProperty("PerTransactionPercentage") PerTransactionPercentage("PerTransactionPercentage"),
        @JsonProperty("Quarterly") Quarterly("Quarterly"),
        @JsonProperty("SixMonthly") SixMonthly("SixMonthly"),
        @JsonProperty("StatementMonthly") StatementMonthly("StatementMonthly"),
        @JsonProperty("Weekly") Weekly("Weekly"),
        @JsonProperty("Yearly") Yearly("Yearly")
    }

    /**
    * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
    * Values: Gross,Other
    */
    enum class FeeRateType(val value: kotlin.String) {

        @JsonProperty("Gross") Gross("Gross"),
        @JsonProperty("Other") Other("Other")
    }

    /**
    * How frequently the fee/charge is calculated
    * Values: OnClosing,OnOpening,ChargingPeriod,Daily,PerItem,Monthly,OnAnniversary,Other,PerHundredPounds,PerHour,PerOccurrence,PerSheet,PerTransaction,PerTransactionAmount,PerTransactionPercentage,Quarterly,SixMonthly,StatementMonthly,Weekly,Yearly
    */
    enum class CalculationFrequency(val value: kotlin.String) {

        @JsonProperty("OnClosing") OnClosing("OnClosing"),
        @JsonProperty("OnOpening") OnOpening("OnOpening"),
        @JsonProperty("ChargingPeriod") ChargingPeriod("ChargingPeriod"),
        @JsonProperty("Daily") Daily("Daily"),
        @JsonProperty("PerItem") PerItem("PerItem"),
        @JsonProperty("Monthly") Monthly("Monthly"),
        @JsonProperty("OnAnniversary") OnAnniversary("OnAnniversary"),
        @JsonProperty("Other") Other("Other"),
        @JsonProperty("PerHundredPounds") PerHundredPounds("PerHundredPounds"),
        @JsonProperty("PerHour") PerHour("PerHour"),
        @JsonProperty("PerOccurrence") PerOccurrence("PerOccurrence"),
        @JsonProperty("PerSheet") PerSheet("PerSheet"),
        @JsonProperty("PerTransaction") PerTransaction("PerTransaction"),
        @JsonProperty("PerTransactionAmount") PerTransactionAmount("PerTransactionAmount"),
        @JsonProperty("PerTransactionPercentage") PerTransactionPercentage("PerTransactionPercentage"),
        @JsonProperty("Quarterly") Quarterly("Quarterly"),
        @JsonProperty("SixMonthly") SixMonthly("SixMonthly"),
        @JsonProperty("StatementMonthly") StatementMonthly("StatementMonthly"),
        @JsonProperty("Weekly") Weekly("Weekly"),
        @JsonProperty("Yearly") Yearly("Yearly")
    }

}

