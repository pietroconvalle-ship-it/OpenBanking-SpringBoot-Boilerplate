package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema

/**
 * The authorisation type request from the TPP.
 * @param authorisationType Type of authorisation flow requested. For a full list of values refer to `OBInternalAuthorisation1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param completionDateTime Date and time at which the requested authorisation flow must be completed. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 */
data class OBWriteDomesticConsentResponse5DataAuthorisation(

  @Schema(example = "null", required = true, description = "Type of authorisation flow requested. For a full list of values refer to `OBInternalAuthorisation1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("AuthorisationType", required = true) val authorisationType: OBWriteDomesticConsentResponse5DataAuthorisation.AuthorisationType,

  @Schema(example = "null", description = "Date and time at which the requested authorisation flow must be completed. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @get:JsonProperty("CompletionDateTime") val completionDateTime: java.time.OffsetDateTime? = null,
) {

  /**
   * Type of authorisation flow requested. For a full list of values refer to `OBInternalAuthorisation1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * Values: Any,Single
   */
  enum class AuthorisationType(@get:JsonValue val value: kotlin.String) {

    Any("Any"),
    Single("Single"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): AuthorisationType = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBWriteDomesticConsentResponse5DataAuthorisation'")
    }
  }
}
