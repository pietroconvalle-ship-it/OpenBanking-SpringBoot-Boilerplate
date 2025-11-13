package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalScheduled3DataInitiation

/**
 *
 * @param consentId OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
 * @param initiation
 */
data class OBWriteInternationalScheduled3Data(

  @get:Size(min = 1, max = 128)
  @Schema(example = "null", required = true, description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
  @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Initiation", required = true) val initiation: OBWriteInternationalScheduled3DataInitiation,
)
