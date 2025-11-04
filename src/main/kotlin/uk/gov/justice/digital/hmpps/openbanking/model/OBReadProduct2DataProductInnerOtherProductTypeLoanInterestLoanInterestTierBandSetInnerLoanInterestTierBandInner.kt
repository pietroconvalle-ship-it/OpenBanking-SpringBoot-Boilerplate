package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBInterestFixedVariableType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerOtherLoanProviderInterestRateType
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
 * @param tierValueMinimum Minimum loan value for which the loan interest tier applies.
 * @param tierValueMinTerm Minimum loan term for which the loan interest tier applies.
 * @param minTermPeriod The unit of period (days, weeks, months etc.) of the Minimum Term
 * @param fixedVariableInterestRateType 
 * @param repAPR The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  For SME Loan, this APR is the representative APR which includes any account fees.
 * @param identification Unique and unambiguous identification of a  Tier Band for a SME Loan.
 * @param tierValueMaximum Maximum loan value for which the loan interest tier applies.
 * @param tierValueMaxTerm Maximum loan term for which the loan interest tier applies.
 * @param maxTermPeriod The unit of period (days, weeks, months etc.) of the Maximum Term
 * @param loanProviderInterestRateType Interest rate types, other than APR, which financial institutions may use to describe the annual interest rate payable for the SME Loan.
 * @param loanProviderInterestRate Loan provider Interest for the SME Loan product
 * @param notes 
 * @param otherLoanProviderInterestRateType 
 * @param loanInterestFeesCharges 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner(

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", required = true, description = "Minimum loan value for which the loan interest tier applies.")
    @get:JsonProperty("TierValueMinimum", required = true) val tierValueMinimum: kotlin.String,

    @Schema(example = "null", required = true, description = "Minimum loan term for which the loan interest tier applies.")
    @get:JsonProperty("TierValueMinTerm", required = true) val tierValueMinTerm: kotlin.Int,

    @Schema(example = "null", required = true, description = "The unit of period (days, weeks, months etc.) of the Minimum Term")
    @get:JsonProperty("MinTermPeriod", required = true) val minTermPeriod: OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner.MinTermPeriod,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("FixedVariableInterestRateType", required = true) val fixedVariableInterestRateType: OBInterestFixedVariableType1Code,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", required = true, description = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  For SME Loan, this APR is the representative APR which includes any account fees.")
    @get:JsonProperty("RepAPR", required = true) val repAPR: kotlin.String,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Unique and unambiguous identification of a  Tier Band for a SME Loan.")
    @get:JsonProperty("Identification") val identification: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Maximum loan value for which the loan interest tier applies.")
    @get:JsonProperty("TierValueMaximum") val tierValueMaximum: kotlin.String? = null,

    @Schema(example = "null", description = "Maximum loan term for which the loan interest tier applies.")
    @get:JsonProperty("TierValueMaxTerm") val tierValueMaxTerm: kotlin.Int? = null,

    @Schema(example = "null", description = "The unit of period (days, weeks, months etc.) of the Maximum Term")
    @get:JsonProperty("MaxTermPeriod") val maxTermPeriod: OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner.MaxTermPeriod? = null,

    @Schema(example = "null", description = "Interest rate types, other than APR, which financial institutions may use to describe the annual interest rate payable for the SME Loan.")
    @get:JsonProperty("LoanProviderInterestRateType") val loanProviderInterestRateType: OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner.LoanProviderInterestRateType? = null,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Loan provider Interest for the SME Loan product")
    @get:JsonProperty("LoanProviderInterestRate") val loanProviderInterestRate: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherLoanProviderInterestRateType") val otherLoanProviderInterestRateType: OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerOtherLoanProviderInterestRateType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("LoanInterestFeesCharges") val loanInterestFeesCharges: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner>? = null
) {

    /**
    * The unit of period (days, weeks, months etc.) of the Minimum Term
    * Values: PACT,PDAY,PHYR,PMTH,PQTR,PWEK,PYER
    */
    enum class MinTermPeriod(val value: kotlin.String) {

        @JsonProperty("PACT") PACT("PACT"),
        @JsonProperty("PDAY") PDAY("PDAY"),
        @JsonProperty("PHYR") PHYR("PHYR"),
        @JsonProperty("PMTH") PMTH("PMTH"),
        @JsonProperty("PQTR") PQTR("PQTR"),
        @JsonProperty("PWEK") PWEK("PWEK"),
        @JsonProperty("PYER") PYER("PYER")
    }

    /**
    * The unit of period (days, weeks, months etc.) of the Maximum Term
    * Values: PACT,PDAY,PHYR,PMTH,PQTR,PWEK,PYER
    */
    enum class MaxTermPeriod(val value: kotlin.String) {

        @JsonProperty("PACT") PACT("PACT"),
        @JsonProperty("PDAY") PDAY("PDAY"),
        @JsonProperty("PHYR") PHYR("PHYR"),
        @JsonProperty("PMTH") PMTH("PMTH"),
        @JsonProperty("PQTR") PQTR("PQTR"),
        @JsonProperty("PWEK") PWEK("PWEK"),
        @JsonProperty("PYER") PYER("PYER")
    }

    /**
    * Interest rate types, other than APR, which financial institutions may use to describe the annual interest rate payable for the SME Loan.
    * Values: INBB,INFR,INGR,INLR,INNE,INOT
    */
    enum class LoanProviderInterestRateType(val value: kotlin.String) {

        @JsonProperty("INBB") INBB("INBB"),
        @JsonProperty("INFR") INFR("INFR"),
        @JsonProperty("INGR") INGR("INGR"),
        @JsonProperty("INLR") INLR("INLR"),
        @JsonProperty("INNE") INNE("INNE"),
        @JsonProperty("INOT") INOT("INOT")
    }

}

