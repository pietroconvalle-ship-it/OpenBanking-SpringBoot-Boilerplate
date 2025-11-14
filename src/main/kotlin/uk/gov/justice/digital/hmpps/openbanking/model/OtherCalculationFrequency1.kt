package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size

/**
 * Other calculation frequency which is not available in standard code set.
 * @param name Long name associated with the code
 * @param description Description to describe the purpose of the code
 * @param code The four letter Mnemonic used within an XML file to identify a code
 */
data class OtherCalculationFrequency1(

  @get:Size(min = 1, max = 70)
  @Schema(example = "null", required = true, description = "Long name associated with the code")
  @get:JsonProperty("Name", required = true) val name: kotlin.String,

  @get:Size(min = 1, max = 350)
  @Schema(example = "null", required = true, description = "Description to describe the purpose of the code")
  @get:JsonProperty("Description", required = true) val description: kotlin.String,

  @get:Pattern(regexp = "^\\w{0,4}$")
  @get:Size(min = 0, max = 4)
  @Schema(example = "null", description = "The four letter Mnemonic used within an XML file to identify a code")
  @get:JsonProperty("Code") val code: kotlin.String? = null,
)
