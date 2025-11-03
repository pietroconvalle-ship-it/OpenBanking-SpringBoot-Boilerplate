package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OtherApplicationFrequency
import org.openapitools.model.OtherBankInterestType
import org.openapitools.model.OtherCalculationFrequency
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
 * Tier Band Details
 * @param tierValueMinimum Minimum deposit value for which the credit interest tier applies.
 * @param applicationFrequency How often is interest applied to the BCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's BCA.
 * @param fixedVariableInterestRateType Type of interest rate, Fixed or Variable
 * @param AER The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A
 * @param identification Unique and unambiguous identification of a  Tier Band for a BCA.
 * @param tierValueMaximum Maximum deposit value for which the credit interest tier applies.
 * @param calculationFrequency How often is credit interest calculated for the account.
 * @param depositInterestAppliedCoverage Amount on which Interest applied.
 * @param bankInterestRateType Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.
 * @param bankInterestRate Bank Interest for the BCA product
 * @param notes Optional additional notes to supplement the Tier Band details
 * @param otherBankInterestType 
 * @param otherApplicationFrequency 
 * @param otherCalculationFrequency 
 */
data class TierBandInner(

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", required = true, description = "Minimum deposit value for which the credit interest tier applies.")
    @get:JsonProperty("TierValueMinimum", required = true) val tierValueMinimum: kotlin.String,

    @Schema(example = "null", required = true, description = "How often is interest applied to the BCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's BCA.")
    @get:JsonProperty("ApplicationFrequency", required = true) val applicationFrequency: TierBandInner.ApplicationFrequency,

    @Schema(example = "null", required = true, description = "Type of interest rate, Fixed or Variable")
    @get:JsonProperty("FixedVariableInterestRateType", required = true) val fixedVariableInterestRateType: TierBandInner.FixedVariableInterestRateType,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", required = true, description = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A")
    @get:JsonProperty("AER", required = true) val AER: kotlin.String,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Unique and unambiguous identification of a  Tier Band for a BCA.")
    @get:JsonProperty("Identification") val identification: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Maximum deposit value for which the credit interest tier applies.")
    @get:JsonProperty("TierValueMaximum") val tierValueMaximum: kotlin.String? = null,

    @Schema(example = "null", description = "How often is credit interest calculated for the account.")
    @get:JsonProperty("CalculationFrequency") val calculationFrequency: TierBandInner.CalculationFrequency? = null,

    @Schema(example = "null", description = "Amount on which Interest applied.")
    @get:JsonProperty("DepositInterestAppliedCoverage") val depositInterestAppliedCoverage: TierBandInner.DepositInterestAppliedCoverage? = null,

    @Schema(example = "null", description = "Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.")
    @get:JsonProperty("BankInterestRateType") val bankInterestRateType: TierBandInner.BankInterestRateType? = null,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Bank Interest for the BCA product")
    @get:JsonProperty("BankInterestRate") val bankInterestRate: kotlin.String? = null,

    @Schema(example = "null", description = "Optional additional notes to supplement the Tier Band details")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherBankInterestType") val otherBankInterestType: OtherBankInterestType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherApplicationFrequency") val otherApplicationFrequency: OtherApplicationFrequency? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherCalculationFrequency") val otherCalculationFrequency: OtherCalculationFrequency? = null
) {

    /**
    * How often is interest applied to the BCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's BCA.
    * Values: Daily,HalfYearly,Monthly,Other,Quarterly,PerStatementDate,Weekly,Yearly
    */
    enum class ApplicationFrequency(val value: kotlin.String) {

        @JsonProperty("Daily") Daily("Daily"),
        @JsonProperty("HalfYearly") HalfYearly("HalfYearly"),
        @JsonProperty("Monthly") Monthly("Monthly"),
        @JsonProperty("Other") Other("Other"),
        @JsonProperty("Quarterly") Quarterly("Quarterly"),
        @JsonProperty("PerStatementDate") PerStatementDate("PerStatementDate"),
        @JsonProperty("Weekly") Weekly("Weekly"),
        @JsonProperty("Yearly") Yearly("Yearly")
    }

    /**
    * Type of interest rate, Fixed or Variable
    * Values: Fixed,Variable
    */
    enum class FixedVariableInterestRateType(val value: kotlin.String) {

        @JsonProperty("Fixed") Fixed("Fixed"),
        @JsonProperty("Variable") Variable("Variable")
    }

    /**
    * How often is credit interest calculated for the account.
    * Values: Daily,HalfYearly,Monthly,Other,Quarterly,PerStatementDate,Weekly,Yearly
    */
    enum class CalculationFrequency(val value: kotlin.String) {

        @JsonProperty("Daily") Daily("Daily"),
        @JsonProperty("HalfYearly") HalfYearly("HalfYearly"),
        @JsonProperty("Monthly") Monthly("Monthly"),
        @JsonProperty("Other") Other("Other"),
        @JsonProperty("Quarterly") Quarterly("Quarterly"),
        @JsonProperty("PerStatementDate") PerStatementDate("PerStatementDate"),
        @JsonProperty("Weekly") Weekly("Weekly"),
        @JsonProperty("Yearly") Yearly("Yearly")
    }

    /**
    * Amount on which Interest applied.
    * Values: Banded,Tiered,Whole
    */
    enum class DepositInterestAppliedCoverage(val value: kotlin.String) {

        @JsonProperty("Banded") Banded("Banded"),
        @JsonProperty("Tiered") Tiered("Tiered"),
        @JsonProperty("Whole") Whole("Whole")
    }

    /**
    * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.
    * Values: Gross,Other
    */
    enum class BankInterestRateType(val value: kotlin.String) {

        @JsonProperty("Gross") Gross("Gross"),
        @JsonProperty("Other") Other("Other")
    }

}

