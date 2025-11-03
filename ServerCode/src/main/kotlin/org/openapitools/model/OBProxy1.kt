package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ExternalProxyAccountType1Code
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
 * Specifies an alternate assumed name for the identification of the account.
 * @param identification Identification used to indicate the account identification under another specified name.
 * @param code 
 * @param type Type of the proxy identification.
 */
data class OBProxy1(

    @get:Size(min=1,max=2048)
    @Schema(example = "2360549017905188", required = true, description = "Identification used to indicate the account identification under another specified name.")
    @get:JsonProperty("Identification", required = true) val identification: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Code", required = true) val code: ExternalProxyAccountType1Code,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Type of the proxy identification.")
    @get:JsonProperty("Type") val type: kotlin.String? = null
) {

}

