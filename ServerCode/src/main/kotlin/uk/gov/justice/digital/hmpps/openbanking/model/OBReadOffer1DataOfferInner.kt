package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadOffer1DataOfferInnerAmount
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadOffer1DataOfferInnerFee
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
 * 
 * @param accountId A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
 * @param offerId A unique and immutable identifier used to identify the offer resource. This identifier has no meaning to the account owner.
 * @param offerType Offer type, in a coded form. For a full list of values refer to `OBExternalOfferType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param description Further details of the offer.
 * @param startDateTime Date and time at which the offer starts. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param endDateTime Date and time at which the offer ends. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param rate Rate associated with the offer type.
 * @param &#x60;value&#x60; Value associated with the offer type.
 * @param term Further details of the term of the offer.
 * @param URL URL (Uniform Resource Locator) where documentation on the offer can be found
 * @param amount 
 * @param fee 
 */
data class OBReadOffer1DataOfferInner(

    @get:Size(min=1,max=40)
    @Schema(example = "22289", required = true, description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("AccountId", required = true) val accountId: kotlin.String,

    @get:Size(min=1,max=40)
    @Schema(example = "Offer1", description = "A unique and immutable identifier used to identify the offer resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("OfferId") val offerId: kotlin.String? = null,

    @Schema(example = "LimitIncrease", description = "Offer type, in a coded form. For a full list of values refer to `OBExternalOfferType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("OfferType") val offerType: OBReadOffer1DataOfferInner.OfferType? = null,

    @get:Size(min=1,max=500)
    @Schema(example = "Credit limit increase for the account up to £10000.00", description = "Further details of the offer.")
    @get:JsonProperty("Description") val description: kotlin.String? = null,

    @Schema(example = "2024-05-29T00:00Z", description = "Date and time at which the offer starts. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("StartDateTime") val startDateTime: java.time.OffsetDateTime? = null,

    @Schema(example = "2024-06-29T00:00Z", description = "Date and time at which the offer ends. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("EndDateTime") val endDateTime: java.time.OffsetDateTime? = null,

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @Schema(example = "100.00", description = "Rate associated with the offer type.")
    @get:JsonProperty("Rate") val rate: kotlin.String? = null,

    @Schema(example = "10", description = "Value associated with the offer type.")
    @get:JsonProperty("Value") val `value`: kotlin.Int? = null,

    @get:Size(min=1,max=500)
    @Schema(example = "Starting first of the month and ending at the end of year", description = "Further details of the term of the offer.")
    @get:JsonProperty("Term") val term: kotlin.String? = null,

    @get:Size(min=1,max=256)
    @Schema(example = "http://modelbank.com/offer/offer1", description = "URL (Uniform Resource Locator) where documentation on the offer can be found")
    @get:JsonProperty("URL") val URL: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Amount") val amount: OBReadOffer1DataOfferInnerAmount? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Fee") val fee: OBReadOffer1DataOfferInnerFee? = null
) {

    /**
    * Offer type, in a coded form. For a full list of values refer to `OBExternalOfferType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: BalanceTransfer,LimitIncrease,MoneyTransfer,Other,PromotionalRate
    */
    enum class OfferType(val value: kotlin.String) {

        @JsonProperty("BalanceTransfer") BalanceTransfer("BalanceTransfer"),
        @JsonProperty("LimitIncrease") LimitIncrease("LimitIncrease"),
        @JsonProperty("MoneyTransfer") MoneyTransfer("MoneyTransfer"),
        @JsonProperty("Other") Other("Other"),
        @JsonProperty("PromotionalRate") PromotionalRate("PromotionalRate")
    }

}

