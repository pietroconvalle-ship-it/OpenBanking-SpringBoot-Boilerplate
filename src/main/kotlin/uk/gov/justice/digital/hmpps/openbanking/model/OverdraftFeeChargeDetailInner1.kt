package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern
import uk.gov.justice.digital.hmpps.openbanking.model.OtherApplicationFrequency
import uk.gov.justice.digital.hmpps.openbanking.model.OtherCalculationFrequency
import uk.gov.justice.digital.hmpps.openbanking.model.OtherFeeRateType
import uk.gov.justice.digital.hmpps.openbanking.model.OtherFeeType
import uk.gov.justice.digital.hmpps.openbanking.model.OverdraftFeeChargeCap

/**
 * Details about the fees/charges
 * @param feeType Overdraft fee type
 * @param applicationFrequency Frequency at which the overdraft charge is applied to the account
 * @param overdraftControlIndicator Specifies for the overdraft control feature/benefit
 * @param incrementalBorrowingAmount Every additional tranche of an overdraft balance to which an overdraft fee is applied
 * @param feeAmount Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
 * @param feeRate Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
 * @param feeRateType Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
 * @param calculationFrequency How often is the overdraft fee/charge calculated for the account.
 * @param notes Free text for capturing any other info related to Overdraft Fees Charge Details
 * @param otherFeeType
 * @param otherFeeRateType
 * @param otherApplicationFrequency
 * @param otherCalculationFrequency
 * @param overdraftFeeChargeCap
 */
data class OverdraftFeeChargeDetailInner1(

  @Schema(example = "null", required = true, description = "Overdraft fee type")
  @get:JsonProperty("FeeType", required = true) val feeType: OverdraftFeeChargeDetailInner1.FeeType,

  @Schema(example = "null", required = true, description = "Frequency at which the overdraft charge is applied to the account")
  @get:JsonProperty("ApplicationFrequency", required = true) val applicationFrequency: OverdraftFeeChargeDetailInner1.ApplicationFrequency,

  @Schema(example = "null", description = "Specifies for the overdraft control feature/benefit")
  @get:JsonProperty("OverdraftControlIndicator") val overdraftControlIndicator: kotlin.Boolean? = null,

  @get:Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
  @Schema(example = "null", description = "Every additional tranche of an overdraft balance to which an overdraft fee is applied")
  @get:JsonProperty("IncrementalBorrowingAmount") val incrementalBorrowingAmount: kotlin.String? = null,

  @get:Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
  @Schema(example = "null", description = "Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)")
  @get:JsonProperty("FeeAmount") val feeAmount: kotlin.String? = null,

  @get:Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
  @Schema(example = "null", description = "Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
  @get:JsonProperty("FeeRate") val feeRate: kotlin.String? = null,

  @Schema(example = "null", description = "Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
  @get:JsonProperty("FeeRateType") val feeRateType: OverdraftFeeChargeDetailInner1.FeeRateType? = null,

  @Schema(example = "null", description = "How often is the overdraft fee/charge calculated for the account.")
  @get:JsonProperty("CalculationFrequency") val calculationFrequency: OverdraftFeeChargeDetailInner1.CalculationFrequency? = null,

  @Schema(example = "null", description = "Free text for capturing any other info related to Overdraft Fees Charge Details")
  @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

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
  @get:JsonProperty("OtherCalculationFrequency") val otherCalculationFrequency: OtherCalculationFrequency? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("OverdraftFeeChargeCap") val overdraftFeeChargeCap: OverdraftFeeChargeCap? = null,
) {

  /**
   * Overdraft fee type
   * Values: ArrangedOverdraft,EmergencyBorrowing,BorrowingItem,OverdraftRenewal,AnnualReview,OverdraftSetup,Surcharge,TempOverdraft,UnauthorisedBorrowing,UnauthorisedPaidTrans,Other,UnauthorisedUnpaidTrans
   */
  enum class FeeType(@get:JsonValue val value: kotlin.String) {

    ArrangedOverdraft("ArrangedOverdraft"),
    EmergencyBorrowing("EmergencyBorrowing"),
    BorrowingItem("BorrowingItem"),
    OverdraftRenewal("OverdraftRenewal"),
    AnnualReview("AnnualReview"),
    OverdraftSetup("OverdraftSetup"),
    Surcharge("Surcharge"),
    TempOverdraft("TempOverdraft"),
    UnauthorisedBorrowing("UnauthorisedBorrowing"),
    UnauthorisedPaidTrans("UnauthorisedPaidTrans"),
    Other("Other"),
    UnauthorisedUnpaidTrans("UnauthorisedUnpaidTrans"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): FeeType = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OverdraftFeeChargeDetailInner1'")
    }
  }

  /**
   * Frequency at which the overdraft charge is applied to the account
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
    Yearly("Yearly"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): ApplicationFrequency = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OverdraftFeeChargeDetailInner1'")
    }
  }

  /**
   * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   * Values: LinkedBaseRate,Gross,Net,Other
   */
  enum class FeeRateType(@get:JsonValue val value: kotlin.String) {

    LinkedBaseRate("LinkedBaseRate"),
    Gross("Gross"),
    Net("Net"),
    Other("Other"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): FeeRateType = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OverdraftFeeChargeDetailInner1'")
    }
  }

  /**
   * How often is the overdraft fee/charge calculated for the account.
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
    Yearly("Yearly"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): CalculationFrequency = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OverdraftFeeChargeDetailInner1'")
    }
  }
}
