package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.TierBandInner
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
 * @param tierBandMethod The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the BCA balance
 * @param destination Describes whether accrued interest is payable only to the BCA or to another bank account
 * @param tierBand Tier Band Details
 * @param calculationMethod Methods of calculating interest
 * @param notes Optional additional notes to supplement the Tier Band Set details
 */
data class TierBandSetInner(

    @Schema(example = "null", required = true, description = "The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the BCA balance")
    @get:JsonProperty("TierBandMethod", required = true) val tierBandMethod: TierBandSetInner.TierBandMethod,

    @Schema(example = "null", required = true, description = "Describes whether accrued interest is payable only to the BCA or to another bank account")
    @get:JsonProperty("Destination", required = true) val destination: TierBandSetInner.Destination,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Tier Band Details")
    @get:JsonProperty("TierBand", required = true) val tierBand: kotlin.collections.List<TierBandInner>,

    @Schema(example = "null", description = "Methods of calculating interest")
    @get:JsonProperty("CalculationMethod") val calculationMethod: TierBandSetInner.CalculationMethod? = null,

    @Schema(example = "null", description = "Optional additional notes to supplement the Tier Band Set details")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null
) {

    /**
    * The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the BCA balance
    * Values: Banded,Tiered,Whole
    */
    enum class TierBandMethod(val value: kotlin.String) {

        @JsonProperty("Banded") Banded("Banded"),
        @JsonProperty("Tiered") Tiered("Tiered"),
        @JsonProperty("Whole") Whole("Whole")
    }

    /**
    * Describes whether accrued interest is payable only to the BCA or to another bank account
    * Values: PayAway,SelfCredit
    */
    enum class Destination(val value: kotlin.String) {

        @JsonProperty("PayAway") PayAway("PayAway"),
        @JsonProperty("SelfCredit") SelfCredit("SelfCredit")
    }

    /**
    * Methods of calculating interest
    * Values: Compound,SimpleInterest
    */
    enum class CalculationMethod(val value: kotlin.String) {

        @JsonProperty("Compound") Compound("Compound"),
        @JsonProperty("SimpleInterest") SimpleInterest("SimpleInterest")
    }

}

