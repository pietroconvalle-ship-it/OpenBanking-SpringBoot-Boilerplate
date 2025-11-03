package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBActiveOrHistoricCurrencyAndAmount1
import org.openapitools.model.OBInternalChargeBearerType1Code1
import org.openapitools.model.OBInternalPaymentChargeType1Code1
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
    @get:JsonProperty("Amount", required = true) val amount: OBActiveOrHistoricCurrencyAndAmount1
) {

}

