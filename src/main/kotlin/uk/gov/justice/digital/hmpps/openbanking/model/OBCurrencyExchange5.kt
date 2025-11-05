package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBCurrencyExchange5InstructedAmount
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
 * Set of elements used to provide details on the currency exchange.
 * @param sourceCurrency Currency from which an amount is to be converted in a currency conversion.
 * @param exchangeRate Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).
 * @param targetCurrency Currency into which an amount is to be converted in a currency conversion.
 * @param unitCurrency Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
 * @param contractIdentification Unique identification to unambiguously identify the foreign exchange contract.
 * @param quotationDate Date and time at which an exchange rate is quoted. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param instructedAmount 
 */
data class OBCurrencyExchange5(

    @get:Pattern(regexp="^[A-Z]{3,3}$")
    @Schema(example = "null", required = true, description = "Currency from which an amount is to be converted in a currency conversion.")
    @get:JsonProperty("SourceCurrency", required = true) val sourceCurrency: kotlin.String,

    @Schema(example = "null", required = true, description = "Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).")
    @get:JsonProperty("ExchangeRate", required = true) val exchangeRate: java.math.BigDecimal,

    @get:Pattern(regexp="^[A-Z]{3,3}$")
    @Schema(example = "null", description = "Currency into which an amount is to be converted in a currency conversion.")
    @get:JsonProperty("TargetCurrency") val targetCurrency: kotlin.String? = null,

    @get:Pattern(regexp="^[A-Z]{3,3}$")
    @Schema(example = "null", description = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.")
    @get:JsonProperty("UnitCurrency") val unitCurrency: kotlin.String? = null,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Unique identification to unambiguously identify the foreign exchange contract.")
    @get:JsonProperty("ContractIdentification") val contractIdentification: kotlin.String? = null,

    @Schema(example = "null", description = "Date and time at which an exchange rate is quoted. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("QuotationDate") val quotationDate: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("InstructedAmount") val instructedAmount: OBCurrencyExchange5InstructedAmount? = null
) {

}

