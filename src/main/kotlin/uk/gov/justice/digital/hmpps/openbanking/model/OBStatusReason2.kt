package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Size

/**
 *
 * @param statusReasonCode Specifies the status reason in a code form.   For a full list of values see `OBExternalStatusReason1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusReasonDescription Description supporting the StatusReasonCode.
 * @param path Optional reference to the JSON Path of the field when status reason refers to an object/field, e.g., Data.DebtorAccount.SchemeName
 */
data class OBStatusReason2(

  @get:Size(min = 1, max = 4)
  @Schema(example = "ERIN", description = "Specifies the status reason in a code form.   For a full list of values see `OBExternalStatusReason1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("StatusReasonCode") val statusReasonCode: kotlin.String? = null,

  @get:Size(min = 1, max = 500)
  @Schema(example = "null", description = "Description supporting the StatusReasonCode.")
  @get:JsonProperty("StatusReasonDescription") val statusReasonDescription: kotlin.String? = null,

  @get:Size(min = 1, max = 500)
  @Schema(example = "null", description = "Optional reference to the JSON Path of the field when status reason refers to an object/field, e.g., Data.DebtorAccount.SchemeName")
  @get:JsonProperty("Path") val path: kotlin.String? = null,
)
