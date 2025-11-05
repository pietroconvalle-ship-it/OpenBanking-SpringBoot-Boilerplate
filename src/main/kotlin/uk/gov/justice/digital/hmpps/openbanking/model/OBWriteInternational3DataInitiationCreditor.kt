package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBPostalAddress71
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
 * Party to which an amount of money is due.
 * @param name Name by which a party is known and which is usually used to identify that party.
 * @param LEI Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".
 * @param postalAddress 
 */
data class OBWriteInternational3DataInitiationCreditor(

    @get:Size(min=1,max=140)
    @Schema(example = "null", description = "Name by which a party is known and which is usually used to identify that party.")
    @get:JsonProperty("Name") val name: kotlin.String? = null,

    @get:Pattern(regexp="^[0-9]{4}[0]{2}[A-Z0-9]{12}[0-9]{2}")
    @get:Size(min=1,max=20)
    @Schema(example = "null", description = "Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".")
    @get:JsonProperty("LEI") val LEI: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PostalAddress") val postalAddress: OBPostalAddress71? = null
) {

}

