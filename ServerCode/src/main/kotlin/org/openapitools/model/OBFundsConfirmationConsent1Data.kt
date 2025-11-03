package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBFundsConfirmationConsent1DataDebtorAccount
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
 * @param debtorAccount 
 * @param expirationDateTime Specified date and time the funds confirmation authorisation will expire.  If this is not populated, the authorisation will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 */
data class OBFundsConfirmationConsent1Data(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("DebtorAccount", required = true) val debtorAccount: OBFundsConfirmationConsent1DataDebtorAccount,

    @Schema(example = "null", description = "Specified date and time the funds confirmation authorisation will expire.  If this is not populated, the authorisation will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("ExpirationDateTime") val expirationDateTime: java.time.OffsetDateTime? = null
) {

}

