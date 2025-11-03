package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBInterestCalculationMethod1Code
import org.openapitools.model.OBOtherCodeType10
import org.openapitools.model.OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner
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
 * The group of tiers or bands for which credit interest can be applied.
 * @param tierBandMethod The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance
 * @param destination Describes whether accrued interest is payable only to the BCA or to another bank account
 * @param tierBand 
 * @param calculationMethod 
 * @param notes 
 * @param otherCalculationMethod 
 * @param otherDestination 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner(

    @Schema(example = "null", required = true, description = "The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance")
    @get:JsonProperty("TierBandMethod", required = true) val tierBandMethod: OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.TierBandMethod,

    @Schema(example = "null", required = true, description = "Describes whether accrued interest is payable only to the BCA or to another bank account")
    @get:JsonProperty("Destination", required = true) val destination: OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.Destination,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("TierBand", required = true) val tierBand: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CalculationMethod") val calculationMethod: OBInterestCalculationMethod1Code? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherCalculationMethod") val otherCalculationMethod: OBOtherCodeType10? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherDestination") val otherDestination: OBOtherCodeType10? = null
) {

    /**
    * The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance
    * Values: INBA,INTI,INWH
    */
    enum class TierBandMethod(val value: kotlin.String) {

        @JsonProperty("INBA") INBA("INBA"),
        @JsonProperty("INTI") INTI("INTI"),
        @JsonProperty("INWH") INWH("INWH")
    }

    /**
    * Describes whether accrued interest is payable only to the BCA or to another bank account
    * Values: INOT,INPA,INSC
    */
    enum class Destination(val value: kotlin.String) {

        @JsonProperty("INOT") INOT("INOT"),
        @JsonProperty("INPA") INPA("INPA"),
        @JsonProperty("INSC") INSC("INSC")
    }

}

