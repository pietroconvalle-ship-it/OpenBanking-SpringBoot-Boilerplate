package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBActiveOrHistoricCurrencyAndAmount
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalChargeBearerType1Code

/**
 * Set of elements used to provide details of a charge for the payment initiation.
 * @param chargeBearer
 * @param type Charge type, in a coded form. For a full list of values refer to `OBInternalPaymentChargeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param amount
 */
data class OBWriteDomesticConsentResponse5DataChargesInner(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("ChargeBearer", required = true) val chargeBearer: OBInternalChargeBearerType1Code,

  @Schema(example = "null", required = true, description = "Charge type, in a coded form. For a full list of values refer to `OBInternalPaymentChargeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("Type", required = true) val type: kotlin.String,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Amount", required = true) val amount: OBActiveOrHistoricCurrencyAndAmount,
)
