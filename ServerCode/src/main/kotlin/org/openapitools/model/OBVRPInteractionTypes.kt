package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
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
* Indicates interaction type, currently if customer is present or not present. If not provided the default is `OffSession` (customer is not present) when the individual VRP payment is made. 
* Values: InSession,OffSession
*/
enum class OBVRPInteractionTypes(val value: kotlin.String) {

    @JsonProperty("InSession") InSession("InSession"),
    @JsonProperty("OffSession") OffSession("OffSession")
}

