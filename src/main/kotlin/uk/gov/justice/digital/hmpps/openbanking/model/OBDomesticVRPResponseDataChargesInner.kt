package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBActiveOrHistoricCurrencyAndAmount1
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalChargeBearerType1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalPaymentChargeType1Code1

/**
 * Set of elements used to provide details of a charge for the payment initiation.
 * @param chargeBearer
 * @param type
 * @param amount
 */
data class OBDomesticVRPResponseDataChargesInner(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("ChargeBearer", required = true) val chargeBearer: OBInternalChargeBearerType1Code1,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Type", required = true) val type: OBInternalPaymentChargeType1Code1,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Amount", required = true) val amount: OBActiveOrHistoricCurrencyAndAmount1,
)
