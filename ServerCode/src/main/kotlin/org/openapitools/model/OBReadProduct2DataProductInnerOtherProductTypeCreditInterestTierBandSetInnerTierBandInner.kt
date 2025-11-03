package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBInterestFixedVariableType1Code
import org.openapitools.model.OBOtherCodeType11
import org.openapitools.model.OBOtherCodeType12
import org.openapitools.model.OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType
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
 * @param applicationFrequency How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's account.
 * @param fixedVariableInterestRateType 
 * @param AER The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A
 * @param identification Unique and unambiguous identification of a  Tier Band for the Product.
 * @param tierValueMaximum Maximum deposit value for which the credit interest tier applies.
 * @param calculationFrequency How often is credit interest calculated for the account.
 * @param depositInterestAppliedCoverage Amount on which Interest applied.
 * @param bankInterestRateType Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder's account.
 * @param bankInterestRate Bank Interest for the product
 * @param notes 
 * @param otherBankInterestType 
 * @param otherApplicationFrequency 
 * @param otherCalculationFrequency 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner(

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", required = true, description = "Minimum deposit value for which the credit interest tier applies.")
    @get:JsonProperty("TierValueMinimum", required = true) val tierValueMinimum: kotlin.String,

    @Schema(example = "null", required = true, description = "How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's account.")
    @get:JsonProperty("ApplicationFrequency", required = true) val applicationFrequency: OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.ApplicationFrequency,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("FixedVariableInterestRateType", required = true) val fixedVariableInterestRateType: OBInterestFixedVariableType1Code,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", required = true, description = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A")
    @get:JsonProperty("AER", required = true) val AER: kotlin.String,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Unique and unambiguous identification of a  Tier Band for the Product.")
    @get:JsonProperty("Identification") val identification: kotlin.String? = null,

    @get:Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Maximum deposit value for which the credit interest tier applies.")
    @get:JsonProperty("TierValueMaximum") val tierValueMaximum: kotlin.String? = null,

    @Schema(example = "null", description = "How often is credit interest calculated for the account.")
    @get:JsonProperty("CalculationFrequency") val calculationFrequency: OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.CalculationFrequency? = null,

    @Schema(example = "null", description = "Amount on which Interest applied.")
    @get:JsonProperty("DepositInterestAppliedCoverage") val depositInterestAppliedCoverage: OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.DepositInterestAppliedCoverage? = null,

    @Schema(example = "null", description = "Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder's account.")
    @get:JsonProperty("BankInterestRateType") val bankInterestRateType: OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.BankInterestRateType? = null,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "null", description = "Bank Interest for the product")
    @get:JsonProperty("BankInterestRate") val bankInterestRate: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherBankInterestType") val otherBankInterestType: OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherApplicationFrequency") val otherApplicationFrequency: OBOtherCodeType11? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherCalculationFrequency") val otherCalculationFrequency: OBOtherCodeType12? = null
) {

    /**
    * How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's account.
    * Values: FQAT,FQDY,FQHY,FQMY,FQOT,FQQY,FQSD,FQWY,FQYY
    */
    enum class ApplicationFrequency(val value: kotlin.String) {

        @JsonProperty("FQAT") FQAT("FQAT"),
        @JsonProperty("FQDY") FQDY("FQDY"),
        @JsonProperty("FQHY") FQHY("FQHY"),
        @JsonProperty("FQMY") FQMY("FQMY"),
        @JsonProperty("FQOT") FQOT("FQOT"),
        @JsonProperty("FQQY") FQQY("FQQY"),
        @JsonProperty("FQSD") FQSD("FQSD"),
        @JsonProperty("FQWY") FQWY("FQWY"),
        @JsonProperty("FQYY") FQYY("FQYY")
    }

    /**
    * How often is credit interest calculated for the account.
    * Values: FQAT,FQDY,FQHY,FQMY,FQOT,FQQY,FQSD,FQWY,FQYY
    */
    enum class CalculationFrequency(val value: kotlin.String) {

        @JsonProperty("FQAT") FQAT("FQAT"),
        @JsonProperty("FQDY") FQDY("FQDY"),
        @JsonProperty("FQHY") FQHY("FQHY"),
        @JsonProperty("FQMY") FQMY("FQMY"),
        @JsonProperty("FQOT") FQOT("FQOT"),
        @JsonProperty("FQQY") FQQY("FQQY"),
        @JsonProperty("FQSD") FQSD("FQSD"),
        @JsonProperty("FQWY") FQWY("FQWY"),
        @JsonProperty("FQYY") FQYY("FQYY")
    }

    /**
    * Amount on which Interest applied.
    * Values: INBA,INTI,INWH
    */
    enum class DepositInterestAppliedCoverage(val value: kotlin.String) {

        @JsonProperty("INBA") INBA("INBA"),
        @JsonProperty("INTI") INTI("INTI"),
        @JsonProperty("INWH") INWH("INWH")
    }

    /**
    * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder's account.
    * Values: INBB,INFR,INGR,INLR,INNE,INOT
    */
    enum class BankInterestRateType(val value: kotlin.String) {

        @JsonProperty("INBB") INBB("INBB"),
        @JsonProperty("INFR") INFR("INFR"),
        @JsonProperty("INGR") INGR("INGR"),
        @JsonProperty("INLR") INLR("INLR"),
        @JsonProperty("INNE") INNE("INNE"),
        @JsonProperty("INOT") INOT("INOT")
    }

}

