package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBPostalAddress71
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
 * Financial institution servicing an account for the creditor.
 * @param schemeName Name of the identification scheme, in a coded form as published in an external list.
 * @param identification Unique and unambiguous identification of a financial institution or a branch of a financial institution.
 * @param LEI Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".
 * @param name Name by which an agent is known and which is usually used to identify that agent.
 * @param postalAddress 
 */
data class OBWriteInternationalScheduled3DataInitiationCreditorAgent(

    @Schema(example = "null", description = "Name of the identification scheme, in a coded form as published in an external list.")
    @get:JsonProperty("SchemeName") val schemeName: kotlin.String? = null,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Unique and unambiguous identification of a financial institution or a branch of a financial institution.")
    @get:JsonProperty("Identification") val identification: kotlin.String? = null,

    @get:Pattern(regexp="^[0-9]{4}[0]{2}[A-Z0-9]{12}[0-9]{2}")
    @get:Size(min=1,max=20)
    @Schema(example = "null", description = "Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".")
    @get:JsonProperty("LEI") val LEI: kotlin.String? = null,

    @get:Size(min=1,max=140)
    @Schema(example = "null", description = "Name by which an agent is known and which is usually used to identify that agent.")
    @get:JsonProperty("Name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PostalAddress") val postalAddress: OBPostalAddress71? = null
) {

}

