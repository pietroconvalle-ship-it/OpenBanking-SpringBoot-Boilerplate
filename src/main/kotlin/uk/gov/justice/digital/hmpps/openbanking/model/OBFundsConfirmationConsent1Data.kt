package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBFundsConfirmationConsent1DataDebtorAccount

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
  @get:JsonProperty("ExpirationDateTime") val expirationDateTime: java.time.OffsetDateTime? = null,
)
