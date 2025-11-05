package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner
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
 * Details about the interest that may be payable to the SME Loan holders
 * @param loanInterestTierBandSet 
 * @param notes 
 */
data class OBReadProduct2DataProductInnerOtherProductTypeLoanInterest(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("LoanInterestTierBandSet", required = true) val loanInterestTierBandSet: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null
) {

}

