package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBEvent1
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
 * The resource-update event.
 * @param iss Issuer.
 * @param iat Issued At. 
 * @param jti JWT ID.
 * @param aud Audience.
 * @param sub Subject
 * @param txn Transaction Identifier.
 * @param toe Time of Event.
 * @param events 
 */
data class OBEventNotification1(

    @Schema(example = "null", required = true, description = "Issuer.")
    @get:JsonProperty("iss", required = true) val iss: kotlin.String,

    @get:Min(value=0)
    @Schema(example = "null", required = true, description = "Issued At. ")
    @get:JsonProperty("iat", required = true) val iat: kotlin.Int,

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "JWT ID.")
    @get:JsonProperty("jti", required = true) val jti: kotlin.String,

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Audience.")
    @get:JsonProperty("aud", required = true) val aud: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "Subject")
    @get:JsonProperty("sub", required = true) val sub: java.net.URI,

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Transaction Identifier.")
    @get:JsonProperty("txn", required = true) val txn: kotlin.String,

    @get:Min(value=0)
    @Schema(example = "null", required = true, description = "Time of Event.")
    @get:JsonProperty("toe", required = true) val toe: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("events", required = true) val events: OBEvent1
) {

}

