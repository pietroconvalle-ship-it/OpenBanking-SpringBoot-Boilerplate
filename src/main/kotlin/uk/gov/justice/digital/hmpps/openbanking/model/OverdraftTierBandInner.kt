package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OverdraftFeesChargesInner
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
 * Provides overdraft details for a specific tier or band
 * @param tierValueMin Minimum value of Overdraft Tier/Band
 * @param identification Unique and unambiguous identification of a  Tier Band for a overdraft.
 * @param tierValueMax Maximum value of Overdraft Tier/Band
 * @param EAR EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.
 * @param representativeAPR An annual percentage rate (APR) is the annual rate charged for borrowing or earned through an investment. APR is expressed as a percentage that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction but does not take compounding into account.
 * @param agreementLengthMin Specifies the minimum length of a band for a fixed overdraft agreement
 * @param agreementLengthMax Specifies the maximum length of a band for a fixed overdraft agreement
 * @param agreementPeriod Specifies the period of a fixed length overdraft agreement
 * @param overdraftInterestChargingCoverage Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is £2k and the interest tiers are:- 0-£500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the ‘Whole’ of the account balance,  and in the 2nd that it is ‘Tiered’.
 * @param bankGuaranteedIndicator Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it’s part of a government scheme, or whether the rate may vary dependent on the applicant’s circumstances.
 * @param notes Optional additional notes to supplement the Tier/band details
 * @param overdraftFeesCharges Overdraft fees and charges
 */
data class OverdraftTierBandInner(

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", required = true, description = "Minimum value of Overdraft Tier/Band")
    @get:JsonProperty("TierValueMin", required = true) val tierValueMin: kotlin.String,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Unique and unambiguous identification of a  Tier Band for a overdraft.")
    @get:JsonProperty("Identification") val identification: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Maximum value of Overdraft Tier/Band")
    @get:JsonProperty("TierValueMax") val tierValueMax: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.")
    @get:JsonProperty("EAR") val EAR: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "An annual percentage rate (APR) is the annual rate charged for borrowing or earned through an investment. APR is expressed as a percentage that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction but does not take compounding into account.")
    @get:JsonProperty("RepresentativeAPR") val representativeAPR: kotlin.String? = null,

    @Schema(example = "null", description = "Specifies the minimum length of a band for a fixed overdraft agreement")
    @get:JsonProperty("AgreementLengthMin") val agreementLengthMin: kotlin.Float? = null,

    @Schema(example = "null", description = "Specifies the maximum length of a band for a fixed overdraft agreement")
    @get:JsonProperty("AgreementLengthMax") val agreementLengthMax: kotlin.Float? = null,

    @Schema(example = "null", description = "Specifies the period of a fixed length overdraft agreement")
    @get:JsonProperty("AgreementPeriod") val agreementPeriod: OverdraftTierBandInner.AgreementPeriod? = null,

    @Schema(example = "null", description = "Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is £2k and the interest tiers are:- 0-£500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the ‘Whole’ of the account balance,  and in the 2nd that it is ‘Tiered’.")
    @get:JsonProperty("OverdraftInterestChargingCoverage") val overdraftInterestChargingCoverage: OverdraftTierBandInner.OverdraftInterestChargingCoverage? = null,

    @Schema(example = "null", description = "Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it’s part of a government scheme, or whether the rate may vary dependent on the applicant’s circumstances.")
    @get:JsonProperty("BankGuaranteedIndicator") val bankGuaranteedIndicator: kotlin.Boolean? = null,

    @Schema(example = "null", description = "Optional additional notes to supplement the Tier/band details")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Overdraft fees and charges")
    @get:JsonProperty("OverdraftFeesCharges") val overdraftFeesCharges: kotlin.collections.List<OverdraftFeesChargesInner>? = null
) {

    /**
    * Specifies the period of a fixed length overdraft agreement
    * Values: Day,Half_Year,Month,Quarter,Week,Year
    */
    enum class AgreementPeriod(val value: kotlin.String) {

        @JsonProperty("Day") Day("Day"),
        @JsonProperty("Half Year") Half_Year("Half Year"),
        @JsonProperty("Month") Month("Month"),
        @JsonProperty("Quarter") Quarter("Quarter"),
        @JsonProperty("Week") Week("Week"),
        @JsonProperty("Year") Year("Year")
    }

    /**
    * Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is £2k and the interest tiers are:- 0-£500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the ‘Whole’ of the account balance,  and in the 2nd that it is ‘Tiered’.
    * Values: Banded,Tiered,Whole
    */
    enum class OverdraftInterestChargingCoverage(val value: kotlin.String) {

        @JsonProperty("Banded") Banded("Banded"),
        @JsonProperty("Tiered") Tiered("Tiered"),
        @JsonProperty("Whole") Whole("Whole")
    }

}

