package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Size

/**
 * Set of elements to fully identify a proprietary bank transaction code.
 * @param code Proprietary bank transaction code to identify the underlying transaction.
 * @param issuer Identification of the issuer of the proprietary bank transaction code.
 */
data class ProprietaryBankTransactionCodeStructure1(

  @get:Size(min = 1, max = 35)
  @Schema(example = "null", required = true, description = "Proprietary bank transaction code to identify the underlying transaction.")
  @get:JsonProperty("Code", required = true) val code: kotlin.String,

  @get:Size(min = 1, max = 35)
  @Schema(example = "null", description = "Identification of the issuer of the proprietary bank transaction code.")
  @get:JsonProperty("Issuer") val issuer: kotlin.String? = null,
)
