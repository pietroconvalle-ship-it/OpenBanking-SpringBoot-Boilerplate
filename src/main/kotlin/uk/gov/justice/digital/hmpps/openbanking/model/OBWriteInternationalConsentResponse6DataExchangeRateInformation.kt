package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Further detailed information on the exchange rate that has been used in the payment transaction.
 * @param unitCurrency Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
 * @param exchangeRate The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.
 * @param rateType Specifies the type used to complete the currency exchange.
 * @param contractIdentification Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.
 * @param expirationDateTime Specified date and time the exchange rate agreement will expire. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 */
data class OBWriteInternationalConsentResponse6DataExchangeRateInformation(

    @get:Pattern(regexp="^[A-Z]{3,3}$")
    @Schema(example = "null", required = true, description = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.")
    @get:JsonProperty("UnitCurrency", required = true) val unitCurrency: kotlin.String,

    @Schema(example = "null", required = true, description = "The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.")
    @get:JsonProperty("ExchangeRate", required = true) val exchangeRate: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "Specifies the type used to complete the currency exchange.")
    @get:JsonProperty("RateType", required = true) val rateType: OBWriteInternationalConsentResponse6DataExchangeRateInformation.RateType,

    @get:Size(min=1,max=256)
    @Schema(example = "null", description = "Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.")
    @get:JsonProperty("ContractIdentification") val contractIdentification: kotlin.String? = null,

    @Schema(example = "null", description = "Specified date and time the exchange rate agreement will expire. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("ExpirationDateTime") val expirationDateTime: java.time.OffsetDateTime? = null
) {

    /**
    * Specifies the type used to complete the currency exchange.
    * Values: Actual,Agreed,Indicative
    */
    enum class RateType(val value: kotlin.String) {

        @JsonProperty("Actual") Actual("Actual"),
        @JsonProperty("Agreed") Agreed("Agreed"),
        @JsonProperty("Indicative") Indicative("Indicative")
    }

}

