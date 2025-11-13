package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Size

/**
 *
 * @param statusReasonCode Specifies the status reason in a code form.   For a full description see `OBExternalStatusReason1Code` [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusReasonDescription Description supporting the StatusReasonCode.
 * @param path Recommended but optional reference to JSON path if relevant to the StatusReasonCode.
 */
data class OBStatusReason(

  @get:Size(min = 1, max = 4)
  @Schema(example = "U004", description = "Specifies the status reason in a code form.   For a full description see `OBExternalStatusReason1Code` [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("StatusReasonCode") val statusReasonCode: kotlin.String? = null,

  @get:Size(min = 1, max = 500)
  @Schema(example = "Permissions field is missing", description = "Description supporting the StatusReasonCode.")
  @get:JsonProperty("StatusReasonDescription") val statusReasonDescription: kotlin.String? = null,

  @get:Size(min = 1, max = 500)
  @Schema(example = "Data.Permissions", description = "Recommended but optional reference to JSON path if relevant to the StatusReasonCode.")
  @get:JsonProperty("Path") val path: kotlin.String? = null,
)
