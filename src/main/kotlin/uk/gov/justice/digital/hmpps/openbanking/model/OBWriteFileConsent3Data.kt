package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBSCASupportData1
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteFile2DataInitiation

/**
 *
 * @param initiation
 * @param authorisation
 * @param scASupportData
 */
data class OBWriteFileConsent3Data(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Initiation", required = true) val initiation: OBWriteFile2DataInitiation,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Authorisation") val authorisation: OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("SCASupportData") val scASupportData: OBSCASupportData1? = null,
)
