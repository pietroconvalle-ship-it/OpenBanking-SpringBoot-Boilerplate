package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBActiveOrHistoricCurrencyAndAmount
import org.openapitools.model.OBInternalChargeBearerType1Code
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

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
    @get:JsonProperty("Amount", required = true) val amount: OBActiveOrHistoricCurrencyAndAmount
) {

}

