package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBBalanceType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBCreditDebitCode2
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadBalance1DataBalanceInnerAmount
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadBalance1DataBalanceInnerCreditLineInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadBalance1DataBalanceInnerLocalAmount
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
 * Set of elements used to define the balance details.
 * @param accountId A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
 * @param creditDebitIndicator 
 * @param type 
 * @param dateTime Indicates the date (and time) of the balance. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param amount 
 * @param creditLine 
 * @param localAmount 
 */
data class OBReadBalance1DataBalanceInner(

    @get:Size(min=1,max=40)
    @Schema(example = "22289", required = true, description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("AccountId", required = true) val accountId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CreditDebitIndicator", required = true) val creditDebitIndicator: OBCreditDebitCode2,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Type", required = true) val type: OBBalanceType1Code,

    @Schema(example = "null", required = true, description = "Indicates the date (and time) of the balance. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("DateTime", required = true) val dateTime: java.time.OffsetDateTime,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Amount", required = true) val amount: OBReadBalance1DataBalanceInnerAmount,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CreditLine") val creditLine: kotlin.collections.List<OBReadBalance1DataBalanceInnerCreditLineInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("LocalAmount") val localAmount: OBReadBalance1DataBalanceInnerLocalAmount? = null
) {

}

