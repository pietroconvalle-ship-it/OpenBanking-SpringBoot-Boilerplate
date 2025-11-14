package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalProxyAccountType1Code

/**
 * Specifies an alternate assumed name for the identification of the account.
 * @param identification Identification used to indicate the account identification under another specified name.
 * @param code
 * @param type Type of the proxy identification.
 */
data class OBProxy1(

  @get:Size(min = 1, max = 2048)
  @Schema(example = "2360549017905188", required = true, description = "Identification used to indicate the account identification under another specified name.")
  @get:JsonProperty("Identification", required = true) val identification: kotlin.String,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Code", required = true) val code: ExternalProxyAccountType1Code,

  @get:Size(min = 1, max = 35)
  @Schema(example = "null", description = "Type of the proxy identification.")
  @get:JsonProperty("Type") val type: kotlin.String? = null,
)
