package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * The authorisation type request from the TPP.
 * @param authorisationType Type of authorisation flow requested. For a full set of values refer to `OBInternalAuthorisation1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param completionDateTime Date and time at which the requested authorisation flow must be completed. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 */
data class OBWriteDomesticConsent4DataAuthorisation(

    @Schema(example = "null", required = true, description = "Type of authorisation flow requested. For a full set of values refer to `OBInternalAuthorisation1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("AuthorisationType", required = true) val authorisationType: OBWriteDomesticConsent4DataAuthorisation.AuthorisationType,

    @Schema(example = "null", description = "Date and time at which the requested authorisation flow must be completed. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("CompletionDateTime") val completionDateTime: java.time.OffsetDateTime? = null
) {

    /**
    * Type of authorisation flow requested. For a full set of values refer to `OBInternalAuthorisation1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: Any,Single
    */
    enum class AuthorisationType(val value: kotlin.String) {

        @JsonProperty("Any") Any("Any"),
        @JsonProperty("Single") Single("Single")
    }

}

