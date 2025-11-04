package uk.gov.justice.digital.hmpps.openbanking.model

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
 * Resource links to other available versions of the resource.
 * @param version Resource version.
 * @param link Resource link.
 */
data class OBEventLink1(

    @get:Size(min=1,max=10)
    @Schema(example = "null", required = true, description = "Resource version.")
    @get:JsonProperty("version", required = true) val version: kotlin.String,

    @Schema(example = "null", required = true, description = "Resource link.")
    @get:JsonProperty("link", required = true) val link: kotlin.String
) {

}

