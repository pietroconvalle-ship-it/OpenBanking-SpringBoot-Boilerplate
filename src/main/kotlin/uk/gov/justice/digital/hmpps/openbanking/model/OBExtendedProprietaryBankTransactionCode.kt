package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Size

/**
 * Additional proprietary bank transaction codes used by the ASPSP for the underlying transaction
 * @param code Proprietary bank transaction code to identify the underlying transaction.
 * @param issuer Identification of the issuer of the proprietary bank transaction code.
 * @param description Description of the code and its usage on the ASPSP channel
 */
data class OBExtendedProprietaryBankTransactionCode(

  @get:Size(min = 1, max = 35)
  @Schema(example = "null", required = true, description = "Proprietary bank transaction code to identify the underlying transaction.")
  @get:JsonProperty("Code", required = true) val code: kotlin.String,

  @get:Size(min = 1, max = 35)
  @Schema(example = "null", description = "Identification of the issuer of the proprietary bank transaction code.")
  @get:JsonProperty("Issuer") val issuer: kotlin.String? = null,

  @get:Size(min = 1, max = 500)
  @Schema(example = "null", description = "Description of the code and its usage on the ASPSP channel")
  @get:JsonProperty("Description") val description: kotlin.String? = null,
)
