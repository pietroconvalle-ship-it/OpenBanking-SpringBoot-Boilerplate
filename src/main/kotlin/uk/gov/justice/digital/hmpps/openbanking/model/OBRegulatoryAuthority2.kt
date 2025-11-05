package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Entity requiring the regulatory reporting information. 
 * @param name Name of the entity requiring the regulatory reporting information.
 * @param countryCode Nation with its own government.
 */
data class OBRegulatoryAuthority2(

    @get:Size(min=1,max=140)
    @Schema(example = "null", description = "Name of the entity requiring the regulatory reporting information.")
    @get:JsonProperty("Name") val name: kotlin.String? = null,

    @get:Pattern(regexp="^[A-Z]{2,2}$")
    @Schema(example = "null", description = "Nation with its own government.")
    @get:JsonProperty("CountryCode") val countryCode: kotlin.String? = null
) {

}

