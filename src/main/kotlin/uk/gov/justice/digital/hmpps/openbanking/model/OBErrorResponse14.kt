package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBError14
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
 * An array of detail error codes, and messages, and URLs to documentation to help remediation.
 * @param errors 
 * @param id A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.
 * @param code Deprecated <br>High level textual error code, to help categorise the errors.
 * @param message Deprecated <br>Brief Error message
 */
data class OBErrorResponse14(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Errors", required = true) val errors: kotlin.collections.List<OBError14>,

    @get:Size(min=1,max=40)
    @Schema(example = "null", description = "A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.")
    @get:JsonProperty("Id") val id: kotlin.String? = null,

    @get:Size(min=1,max=40)
    @Schema(example = "400 BadRequest", description = "Deprecated <br>High level textual error code, to help categorise the errors.")
    @get:JsonProperty("Code") val code: kotlin.String? = null,

    @get:Size(min=1,max=500)
    @Schema(example = "There is something wrong with the request parameters provided", description = "Deprecated <br>Brief Error message")
    @get:JsonProperty("Message") val message: kotlin.String? = null
) {

}

