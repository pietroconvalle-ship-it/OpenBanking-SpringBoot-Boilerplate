package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Size

/**
 *
 * @param errorCode Low level textual error code, for all enum values see `OBInternalErrorResponseError1Code` [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param message A description of the error that occurred. e.g., 'A mandatory field isn't supplied' or 'RequestedExecutionDateTime must be in future' OBL doesn't standardise this field
 * @param path Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency
 * @param url URL to help remediate the problem, or provide more information, or to API Reference, or help etc
 */
data class OBError11(

  @get:Size(min = 4, max = 4)
  @Schema(example = "U001", required = true, description = "Low level textual error code, for all enum values see `OBInternalErrorResponseError1Code` [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("ErrorCode", required = true) val errorCode: kotlin.String,

  @get:Size(min = 1, max = 500)
  @Schema(example = "null", description = "A description of the error that occurred. e.g., 'A mandatory field isn't supplied' or 'RequestedExecutionDateTime must be in future' OBL doesn't standardise this field")
  @get:JsonProperty("Message") val message: kotlin.String? = null,

  @get:Size(min = 1, max = 500)
  @Schema(example = "null", description = "Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency")
  @get:JsonProperty("Path") val path: kotlin.String? = null,

  @Schema(example = "null", description = "URL to help remediate the problem, or provide more information, or to API Reference, or help etc")
  @get:JsonProperty("Url") val url: kotlin.String? = null,
)
