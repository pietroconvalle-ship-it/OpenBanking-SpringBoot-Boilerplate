package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OverdraftFeesChargesInner2
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
 * @param overdraftInterestChargingCoverage Interest charged on whole amount or tiered/banded
 * @param bankGuaranteedIndicator Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically
 * @param EAR EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.
 * @param representativeAPR An annual percentage rate (APR) is the annual rate charged for borrowing or earned through an investment. APR is expressed as a percentage that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction but does not take compounding into account.
 * @param notes Optional additional notes to supplement the Tier/band details
 * @param overdraftFeesCharges Overdraft fees and charges
 */
data class OverdraftTierBandInner1(

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", required = true, description = "Minimum value of Overdraft Tier/Band")
    @get:JsonProperty("TierValueMin", required = true) val tierValueMin: kotlin.String,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Unique and unambiguous identification of a  Tier Band for a overdraft.")
    @get:JsonProperty("Identification") val identification: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Maximum value of Overdraft Tier/Band")
    @get:JsonProperty("TierValueMax") val tierValueMax: kotlin.String? = null,

    @Schema(example = "null", description = "Interest charged on whole amount or tiered/banded")
    @get:JsonProperty("OverdraftInterestChargingCoverage") val overdraftInterestChargingCoverage: OverdraftTierBandInner1.OverdraftInterestChargingCoverage? = null,

    @Schema(example = "null", description = "Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically")
    @get:JsonProperty("BankGuaranteedIndicator") val bankGuaranteedIndicator: kotlin.Boolean? = null,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.")
    @get:JsonProperty("EAR") val EAR: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "An annual percentage rate (APR) is the annual rate charged for borrowing or earned through an investment. APR is expressed as a percentage that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction but does not take compounding into account.")
    @get:JsonProperty("RepresentativeAPR") val representativeAPR: kotlin.String? = null,

    @Schema(example = "null", description = "Optional additional notes to supplement the Tier/band details")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Overdraft fees and charges")
    @get:JsonProperty("OverdraftFeesCharges") val overdraftFeesCharges: kotlin.collections.List<OverdraftFeesChargesInner2>? = null
) {

    /**
    * Interest charged on whole amount or tiered/banded
    * Values: Tiered,Whole
    */
    enum class OverdraftInterestChargingCoverage(@get:JsonValue val value: kotlin.String) {

        Tiered("Tiered"),
        Whole("Whole");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): OverdraftInterestChargingCoverage {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OverdraftTierBandInner1'")
            }
        }
    }

}

