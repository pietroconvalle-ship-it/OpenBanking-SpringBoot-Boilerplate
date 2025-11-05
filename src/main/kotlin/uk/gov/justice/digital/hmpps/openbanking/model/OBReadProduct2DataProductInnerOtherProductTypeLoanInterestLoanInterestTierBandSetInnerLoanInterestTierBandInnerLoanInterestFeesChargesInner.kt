package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner
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
 * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
 * @param loanInterestFeeChargeDetail 
 * @param loanInterestFeeChargeCap 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("LoanInterestFeeChargeDetail", required = true) val loanInterestFeeChargeDetail: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("LoanInterestFeeChargeCap") val loanInterestFeeChargeCap: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner>? = null
) {

}

