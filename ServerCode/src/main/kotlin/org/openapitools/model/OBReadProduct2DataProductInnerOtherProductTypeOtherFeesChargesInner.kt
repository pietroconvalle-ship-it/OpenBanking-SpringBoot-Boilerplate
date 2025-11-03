package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner
import org.openapitools.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner
import org.openapitools.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType
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
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 * @param feeChargeDetail 
 * @param tariffType TariffType which defines the fee and charges.
 * @param tariffName Name of the tariff
 * @param otherTariffType 
 * @param feeChargeCap 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("FeeChargeDetail", required = true) val feeChargeDetail: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner>,

    @Schema(example = "null", description = "TariffType which defines the fee and charges.")
    @get:JsonProperty("TariffType") val tariffType: OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.TariffType? = null,

    @get:Size(min=1,max=350)
    @Schema(example = "null", description = "Name of the tariff")
    @get:JsonProperty("TariffName") val tariffName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherTariffType") val otherTariffType: OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("FeeChargeCap") val feeChargeCap: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner>? = null
) {

    /**
    * TariffType which defines the fee and charges.
    * Values: TTEL,TTMX,TTOT
    */
    enum class TariffType(val value: kotlin.String) {

        @JsonProperty("TTEL") TTEL("TTEL"),
        @JsonProperty("TTMX") TTMX("TTMX"),
        @JsonProperty("TTOT") TTOT("TTOT")
    }

}

