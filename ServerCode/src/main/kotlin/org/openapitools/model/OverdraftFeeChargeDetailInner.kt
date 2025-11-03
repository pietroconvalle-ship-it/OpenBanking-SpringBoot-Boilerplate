package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OtherApplicationFrequency
import org.openapitools.model.OtherCalculationFrequency
import org.openapitools.model.OtherFeeRateType
import org.openapitools.model.OtherFeeType
import org.openapitools.model.OverdraftFeeChargeCapInner
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
 * Details about the fees/charges
 * @param feeType Overdraft fee type
 * @param applicationFrequency Frequency at which the overdraft charge is applied to the account
 * @param negotiableIndicator Indicates whether fee and charges are negotiable
 * @param overdraftControlIndicator Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.
 * @param incrementalBorrowingAmount Every additional tranche of an overdraft balance to which an overdraft fee is applied
 * @param feeAmount Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
 * @param feeRate Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
 * @param feeRateType Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
 * @param calculationFrequency How often is the overdraft fee/charge calculated for the account.
 * @param notes Free text for capturing any other info related to Overdraft Fees Charge Details
 * @param overdraftFeeChargeCap Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
 * @param otherFeeType 
 * @param otherFeeRateType 
 * @param otherApplicationFrequency 
 * @param otherCalculationFrequency 
 */
data class OverdraftFeeChargeDetailInner(

    @Schema(example = "null", required = true, description = "Overdraft fee type")
    @get:JsonProperty("FeeType", required = true) val feeType: OverdraftFeeChargeDetailInner.FeeType,

    @Schema(example = "null", required = true, description = "Frequency at which the overdraft charge is applied to the account")
    @get:JsonProperty("ApplicationFrequency", required = true) val applicationFrequency: OverdraftFeeChargeDetailInner.ApplicationFrequency,

    @Schema(example = "null", description = "Indicates whether fee and charges are negotiable")
    @get:JsonProperty("NegotiableIndicator") val negotiableIndicator: kotlin.Boolean? = null,

    @Schema(example = "null", description = "Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.")
    @get:JsonProperty("OverdraftControlIndicator") val overdraftControlIndicator: kotlin.Boolean? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Every additional tranche of an overdraft balance to which an overdraft fee is applied")
    @get:JsonProperty("IncrementalBorrowingAmount") val incrementalBorrowingAmount: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)")
    @get:JsonProperty("FeeAmount") val feeAmount: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
    @get:JsonProperty("FeeRate") val feeRate: kotlin.String? = null,

    @Schema(example = "null", description = "Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
    @get:JsonProperty("FeeRateType") val feeRateType: OverdraftFeeChargeDetailInner.FeeRateType? = null,

    @Schema(example = "null", description = "How often is the overdraft fee/charge calculated for the account.")
    @get:JsonProperty("CalculationFrequency") val calculationFrequency: OverdraftFeeChargeDetailInner.CalculationFrequency? = null,

    @Schema(example = "null", description = "Free text for capturing any other info related to Overdraft Fees Charge Details")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")
    @get:JsonProperty("OverdraftFeeChargeCap") val overdraftFeeChargeCap: kotlin.collections.List<OverdraftFeeChargeCapInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherFeeType") val otherFeeType: OtherFeeType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherFeeRateType") val otherFeeRateType: OtherFeeRateType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherApplicationFrequency") val otherApplicationFrequency: OtherApplicationFrequency? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherCalculationFrequency") val otherCalculationFrequency: OtherCalculationFrequency? = null
) {

    /**
    * Overdraft fee type
    * Values: ArrangedOverdraft,AnnualReview,EmergencyBorrowing,BorrowingItem,OverdraftRenewal,OverdraftSetup,Surcharge,TempOverdraft,UnauthorisedBorrowing,UnauthorisedPaidTrans,Other,UnauthorisedUnpaidTrans
    */
    enum class FeeType(val value: kotlin.String) {

        @JsonProperty("ArrangedOverdraft") ArrangedOverdraft("ArrangedOverdraft"),
        @JsonProperty("AnnualReview") AnnualReview("AnnualReview"),
        @JsonProperty("EmergencyBorrowing") EmergencyBorrowing("EmergencyBorrowing"),
        @JsonProperty("BorrowingItem") BorrowingItem("BorrowingItem"),
        @JsonProperty("OverdraftRenewal") OverdraftRenewal("OverdraftRenewal"),
        @JsonProperty("OverdraftSetup") OverdraftSetup("OverdraftSetup"),
        @JsonProperty("Surcharge") Surcharge("Surcharge"),
        @JsonProperty("TempOverdraft") TempOverdraft("TempOverdraft"),
        @JsonProperty("UnauthorisedBorrowing") UnauthorisedBorrowing("UnauthorisedBorrowing"),
        @JsonProperty("UnauthorisedPaidTrans") UnauthorisedPaidTrans("UnauthorisedPaidTrans"),
        @JsonProperty("Other") Other("Other"),
        @JsonProperty("UnauthorisedUnpaidTrans") UnauthorisedUnpaidTrans("UnauthorisedUnpaidTrans")
    }

    /**
    * Frequency at which the overdraft charge is applied to the account
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
    * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
    * Values: Gross,Other
    */
    enum class FeeRateType(val value: kotlin.String) {

        @JsonProperty("Gross") Gross("Gross"),
        @JsonProperty("Other") Other("Other")
    }

    /**
    * How often is the overdraft fee/charge calculated for the account.
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

