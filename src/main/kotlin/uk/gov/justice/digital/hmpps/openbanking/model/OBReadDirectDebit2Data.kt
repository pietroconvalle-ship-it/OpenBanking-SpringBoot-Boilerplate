package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadDirectDebit2DataDirectDebitInner

/**
 *
 * @param directDebit
 */
data class OBReadDirectDebit2Data(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("DirectDebit") val directDebit: kotlin.collections.List<OBReadDirectDebit2DataDirectDebitInner>? = null,
)
