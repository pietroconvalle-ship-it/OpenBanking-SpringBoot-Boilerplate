package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner

/**
 * Details about the interest that may be payable to the SME Loan holders
 * @param loanInterestTierBandSet
 * @param notes
 */
data class OBReadProduct2DataProductInnerOtherProductTypeLoanInterest(

  @field:Valid
  @get:Size(min = 1)
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("LoanInterestTierBandSet", required = true) val loanInterestTierBandSet: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner>,

  @Schema(example = "null", description = "")
  @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,
)
