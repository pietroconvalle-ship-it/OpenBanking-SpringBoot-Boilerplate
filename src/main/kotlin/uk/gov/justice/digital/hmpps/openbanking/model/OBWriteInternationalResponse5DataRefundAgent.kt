package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBPostalAddress71

/**
 * Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution.
 * @param schemeName Name of the identification scheme, in a coded form as published in an external list.
 * @param identification Unique and unambiguous identification of a financial institution or a branch of a financial institution.
 * @param name Name by which an agent is known and which is usually used to identify that agent.
 * @param postalAddress
 */
data class OBWriteInternationalResponse5DataRefundAgent(

  @Schema(example = "null", description = "Name of the identification scheme, in a coded form as published in an external list.")
  @get:JsonProperty("SchemeName") val schemeName: kotlin.String? = null,

  @get:Size(min = 1, max = 35)
  @Schema(example = "null", description = "Unique and unambiguous identification of a financial institution or a branch of a financial institution.")
  @get:JsonProperty("Identification") val identification: kotlin.String? = null,

  @get:Size(min = 1, max = 140)
  @Schema(example = "null", description = "Name by which an agent is known and which is usually used to identify that agent.")
  @get:JsonProperty("Name") val name: kotlin.String? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("PostalAddress") val postalAddress: OBPostalAddress71? = null,
)
