package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBInterestCalculationMethod1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBOtherCodeType10
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner
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
 * The group of tiers or bands for which debit interest can be applied.
 * @param tierBandMethod The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance
 * @param calculationMethod 
 * @param loanInterestTierBand 
 * @param identification Loan interest tierbandset identification. Used by  loan providers for internal use purpose.
 * @param notes 
 * @param otherCalculationMethod 
 * @param loanInterestFeesCharges 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner(

    @Schema(example = "null", required = true, description = "The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance")
    @get:JsonProperty("TierBandMethod", required = true) val tierBandMethod: OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.TierBandMethod,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CalculationMethod", required = true) val calculationMethod: OBInterestCalculationMethod1Code,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("LoanInterestTierBand", required = true) val loanInterestTierBand: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner>,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Loan interest tierbandset identification. Used by  loan providers for internal use purpose.")
    @get:JsonProperty("Identification") val identification: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherCalculationMethod") val otherCalculationMethod: OBOtherCodeType10? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("LoanInterestFeesCharges") val loanInterestFeesCharges: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner>? = null
) {

    /**
    * The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance
    * Values: INBA,INTI,INWH
    */
    enum class TierBandMethod(val value: kotlin.String) {

        @JsonProperty("INBA") INBA("INBA"),
        @JsonProperty("INTI") INTI("INTI"),
        @JsonProperty("INWH") INWH("INWH")
    }

}

