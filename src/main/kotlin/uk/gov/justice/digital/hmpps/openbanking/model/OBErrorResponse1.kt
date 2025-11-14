package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBError1

/**
 * An array of detail error codes, and messages, and URLs to documentation to help remediation.
 * @param errors
 * @param id A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.
 * @param code Deprecated <br />High level textual error code, to help categorise the errors.
 * @param message Deprecated <br />Brief Error message
 */
data class OBErrorResponse1(

  @field:Valid
  @get:Size(min = 1)
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Errors", required = true) val errors: kotlin.collections.List<OBError1>,

  @get:Size(min = 1, max = 40)
  @Schema(example = "null", description = "A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.")
  @get:JsonProperty("Id") val id: kotlin.String? = null,

  @get:Size(min = 1, max = 40)
  @Schema(example = "400 BadRequest", description = "Deprecated <br />High level textual error code, to help categorise the errors.")
  @get:JsonProperty("Code") val code: kotlin.String? = null,

  @get:Size(min = 1, max = 500)
  @Schema(example = "There is something wrong with the request parameters provided", description = "Deprecated <br />Brief Error message")
  @get:JsonProperty("Message") val message: kotlin.String? = null,
)
