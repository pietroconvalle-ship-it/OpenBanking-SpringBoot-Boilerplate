package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.FeeApplicableRange
import uk.gov.justice.digital.hmpps.openbanking.model.FeeChargeCapInner1
import uk.gov.justice.digital.hmpps.openbanking.model.OtherApplicationFrequency1
import uk.gov.justice.digital.hmpps.openbanking.model.OtherCalculationFrequency1
import uk.gov.justice.digital.hmpps.openbanking.model.OtherFeeCategoryType
import uk.gov.justice.digital.hmpps.openbanking.model.OtherFeeRateType1
import uk.gov.justice.digital.hmpps.openbanking.model.OtherFeeType1
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
 * @param feeAmount Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
 * @param feeRate Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
 * @param feeRateType Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
 * @param calculationFrequency How frequently the fee/charge is calculated
 * @param notes Optional additional notes to supplement the fee/charge details.
 * @param otherFeeCategoryType 
 * @param otherFeeType 
 * @param otherFeeRateType 
 * @param otherApplicationFrequency 
 * @param otherCalculationFrequency 
 * @param feeChargeCap Details about any caps (maximum charges) that apply to a particular fee/charge
 * @param feeApplicableRange 
 */
data class FeeChargeDetailInner1(

    @Schema(example = "null", required = true, description = "Categorisation of fees and charges into standard categories.")
    @get:JsonProperty("FeeCategory", required = true) val feeCategory: FeeChargeDetailInner1.FeeCategory,

    @Schema(example = "null", required = true, description = "Fee/Charge Type")
    @get:JsonProperty("FeeType", required = true) val feeType: FeeChargeDetailInner1.FeeType,

    @Schema(example = "null", required = true, description = "How frequently the fee/charge is applied to the account")
    @get:JsonProperty("ApplicationFrequency", required = true) val applicationFrequency: FeeChargeDetailInner1.ApplicationFrequency,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
    @get:JsonProperty("FeeAmount") val feeAmount: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)")
    @get:JsonProperty("FeeRate") val feeRate: kotlin.String? = null,

    @Schema(example = "null", description = "Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)")
    @get:JsonProperty("FeeRateType") val feeRateType: FeeChargeDetailInner1.FeeRateType? = null,

    @Schema(example = "null", description = "How frequently the fee/charge is calculated")
    @get:JsonProperty("CalculationFrequency") val calculationFrequency: FeeChargeDetailInner1.CalculationFrequency? = null,

    @Schema(example = "null", description = "Optional additional notes to supplement the fee/charge details.")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

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
    @Schema(example = "null", description = "Details about any caps (maximum charges) that apply to a particular fee/charge")
    @get:JsonProperty("FeeChargeCap") val feeChargeCap: kotlin.collections.List<FeeChargeCapInner1>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("FeeApplicableRange") val feeApplicableRange: FeeApplicableRange? = null
) {

    /**
    * Categorisation of fees and charges into standard categories.
    * Values: Other,Servicing
    */
    enum class FeeCategory(@get:JsonValue val value: kotlin.String) {

        Other("Other"),
        Servicing("Servicing");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): FeeCategory {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'FeeChargeDetailInner1'")
            }
        }
    }

    /**
    * Fee/Charge Type
    * Values: ServiceCAccountFee,ServiceCAccountFeeMonthly,ServiceCOther,Other
    */
    enum class FeeType(@get:JsonValue val value: kotlin.String) {

        ServiceCAccountFee("ServiceCAccountFee"),
        ServiceCAccountFeeMonthly("ServiceCAccountFeeMonthly"),
        ServiceCOther("ServiceCOther"),
        Other("Other");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): FeeType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'FeeChargeDetailInner1'")
            }
        }
    }

    /**
    * How frequently the fee/charge is applied to the account
    * Values: AccountClosing,AccountOpening,AcademicTerm,ChargingPeriod,Daily,PerItem,Monthly,OnAccountAnniversary,Other,PerHour,PerOccurrence,PerSheet,PerTransaction,PerTransactionAmount,PerTransactionPercentage,Quarterly,SixMonthly,StatementMonthly,Weekly,Yearly
    */
    enum class ApplicationFrequency(@get:JsonValue val value: kotlin.String) {

        AccountClosing("AccountClosing"),
        AccountOpening("AccountOpening"),
        AcademicTerm("AcademicTerm"),
        ChargingPeriod("ChargingPeriod"),
        Daily("Daily"),
        PerItem("PerItem"),
        Monthly("Monthly"),
        OnAccountAnniversary("OnAccountAnniversary"),
        Other("Other"),
        PerHour("PerHour"),
        PerOccurrence("PerOccurrence"),
        PerSheet("PerSheet"),
        PerTransaction("PerTransaction"),
        PerTransactionAmount("PerTransactionAmount"),
        PerTransactionPercentage("PerTransactionPercentage"),
        Quarterly("Quarterly"),
        SixMonthly("SixMonthly"),
        StatementMonthly("StatementMonthly"),
        Weekly("Weekly"),
        Yearly("Yearly");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ApplicationFrequency {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'FeeChargeDetailInner1'")
            }
        }
    }

    /**
    * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
    * Values: LinkedBaseRate,Gross,Net,Other
    */
    enum class FeeRateType(@get:JsonValue val value: kotlin.String) {

        LinkedBaseRate("LinkedBaseRate"),
        Gross("Gross"),
        Net("Net"),
        Other("Other");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): FeeRateType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'FeeChargeDetailInner1'")
            }
        }
    }

    /**
    * How frequently the fee/charge is calculated
    * Values: AccountClosing,AccountOpening,AcademicTerm,ChargingPeriod,Daily,PerItem,Monthly,OnAccountAnniversary,Other,PerHour,PerOccurrence,PerSheet,PerTransaction,PerTransactionAmount,PerTransactionPercentage,Quarterly,SixMonthly,StatementMonthly,Weekly,Yearly
    */
    enum class CalculationFrequency(@get:JsonValue val value: kotlin.String) {

        AccountClosing("AccountClosing"),
        AccountOpening("AccountOpening"),
        AcademicTerm("AcademicTerm"),
        ChargingPeriod("ChargingPeriod"),
        Daily("Daily"),
        PerItem("PerItem"),
        Monthly("Monthly"),
        OnAccountAnniversary("OnAccountAnniversary"),
        Other("Other"),
        PerHour("PerHour"),
        PerOccurrence("PerOccurrence"),
        PerSheet("PerSheet"),
        PerTransaction("PerTransaction"),
        PerTransactionAmount("PerTransactionAmount"),
        PerTransactionPercentage("PerTransactionPercentage"),
        Quarterly("Quarterly"),
        SixMonthly("SixMonthly"),
        StatementMonthly("StatementMonthly"),
        Weekly("Weekly"),
        Yearly("Yearly");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CalculationFrequency {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'FeeChargeDetailInner1'")
            }
        }
    }

}

