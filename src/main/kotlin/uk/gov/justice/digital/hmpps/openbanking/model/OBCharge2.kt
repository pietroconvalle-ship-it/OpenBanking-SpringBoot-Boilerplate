package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalChargeBearerType1Code1

/**
 *
 * @param chargeBearer
 */
data class OBCharge2(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("ChargeBearer", required = true) val chargeBearer: OBInternalChargeBearerType1Code1,
)
