package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner
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
 * @param agreementLengthMin Specifies the minimum length of a band for a fixed overdraft agreement
 * @param agreementLengthMax Specifies the maximum length of a band for a fixed overdraft agreement
 * @param agreementPeriod Specifies the period of a fixed length overdraft agreement
 * @param overdraftInterestChargingCoverage Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is  2k and the interest tiers are:- 0- 500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the  Whole  of the account balance,  and in the 2nd that it is  Tiered .
 * @param bankGuaranteedIndicator Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it s part of a government scheme, or whether the rate may vary dependent on the applicant s circumstances.
 * @param notes 
 * @param overdraftFeesCharges 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner(

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

    @Schema(example = "null", description = "Specifies the minimum length of a band for a fixed overdraft agreement")
    @get:JsonProperty("AgreementLengthMin") val agreementLengthMin: kotlin.Int? = null,

    @Schema(example = "null", description = "Specifies the maximum length of a band for a fixed overdraft agreement")
    @get:JsonProperty("AgreementLengthMax") val agreementLengthMax: kotlin.Int? = null,

    @Schema(example = "null", description = "Specifies the period of a fixed length overdraft agreement")
    @get:JsonProperty("AgreementPeriod") val agreementPeriod: OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.AgreementPeriod? = null,

    @Schema(example = "null", description = "Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is  2k and the interest tiers are:- 0- 500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the  Whole  of the account balance,  and in the 2nd that it is  Tiered .")
    @get:JsonProperty("OverdraftInterestChargingCoverage") val overdraftInterestChargingCoverage: OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.OverdraftInterestChargingCoverage? = null,

    @Schema(example = "null", description = "Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it s part of a government scheme, or whether the rate may vary dependent on the applicant s circumstances.")
    @get:JsonProperty("BankGuaranteedIndicator") val bankGuaranteedIndicator: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OverdraftFeesCharges") val overdraftFeesCharges: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner>? = null
) {

    /**
    * Specifies the period of a fixed length overdraft agreement
    * Values: PACT,PDAY,PHYR,PMTH,PQTR,PWEK,PYER
    */
    enum class AgreementPeriod(val value: kotlin.String) {

        @JsonProperty("PACT") PACT("PACT"),
        @JsonProperty("PDAY") PDAY("PDAY"),
        @JsonProperty("PHYR") PHYR("PHYR"),
        @JsonProperty("PMTH") PMTH("PMTH"),
        @JsonProperty("PQTR") PQTR("PQTR"),
        @JsonProperty("PWEK") PWEK("PWEK"),
        @JsonProperty("PYER") PYER("PYER")
    }

    /**
    * Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is  2k and the interest tiers are:- 0- 500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the  Whole  of the account balance,  and in the 2nd that it is  Tiered .
    * Values: INBA,INTI,INWH
    */
    enum class OverdraftInterestChargingCoverage(val value: kotlin.String) {

        @JsonProperty("INBA") INBA("INBA"),
        @JsonProperty("INTI") INTI("INTI"),
        @JsonProperty("INWH") INWH("INWH")
    }

}

