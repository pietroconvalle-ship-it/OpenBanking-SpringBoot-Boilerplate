package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBCommunicationMethod
import org.openapitools.model.OBFileFormat
import org.openapitools.model.OBFrequency2
import org.openapitools.model.OBPostalAddress7
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
 * Frequency and format of statments for an account
 * @param frequency 
 * @param communicationMethod 
 * @param format 
 * @param deliveryAddress 
 */
data class StatementFrequencyAndFormatInner(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Frequency") val frequency: OBFrequency2? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CommunicationMethod") val communicationMethod: OBCommunicationMethod? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Format") val format: OBFileFormat? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("DeliveryAddress") val deliveryAddress: OBPostalAddress7? = null
) {

}

