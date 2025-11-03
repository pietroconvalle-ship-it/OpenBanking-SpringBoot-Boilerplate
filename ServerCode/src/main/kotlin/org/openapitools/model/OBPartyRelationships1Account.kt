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
 * Relationship to the Account resource.
 * @param related Absolute URI to the related resource.
 * @param id Unique identification as assigned by the ASPSP to uniquely identify the related resource.
 */
data class OBPartyRelationships1Account(

    @field:Valid
    @Schema(example = "https://api.alphabank.com/open-banking/v4.0/aisp/accounts/89019", required = true, description = "Absolute URI to the related resource.")
    @get:JsonProperty("Related", required = true) val related: java.net.URI,

    @get:Size(min=1,max=40)
    @Schema(example = "89019", required = true, description = "Unique identification as assigned by the ASPSP to uniquely identify the related resource.")
    @get:JsonProperty("Id", required = true) val id: kotlin.String
) {

}

