package org.openapitools.model

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
 * Links relevant to the payload
 * @param self 
 * @param first 
 * @param prev 
 * @param next 
 * @param last 
 */
data class Links1(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Self", required = true) val self: java.net.URI,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("First") val first: java.net.URI? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Prev") val prev: java.net.URI? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Next") val next: java.net.URI? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Last") val last: java.net.URI? = null
) {

}

