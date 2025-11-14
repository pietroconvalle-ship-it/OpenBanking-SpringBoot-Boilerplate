package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadBalance1DataBalanceInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadBalance1DataTotalValue

/**
 *
 * @param balance
 * @param totalValue
 */
data class OBReadBalance1Data(

  @field:Valid
  @get:Size(min = 1)
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Balance", required = true) val balance: kotlin.collections.List<OBReadBalance1DataBalanceInner>,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("TotalValue") val totalValue: OBReadBalance1DataTotalValue? = null,
)
