package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * 
 * @param statusReasonCode Specifies the status reason in a code form.  For a full list of values refer to `OBExternalStatusReason1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusReasonDescription Description supporting the StatusReasonCode.
 * @param path Path is optional but relevant when the status reason refers to an object/field and hence conditional to provide JSON path.
 */
data class OBStatusReason1(

    @get:Size(min=1,max=4)
    @Schema(example = "ERIN", description = "Specifies the status reason in a code form.  For a full list of values refer to `OBExternalStatusReason1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("StatusReasonCode") val statusReasonCode: kotlin.String? = null,

    @get:Size(min=1,max=500)
    @Schema(example = "null", description = "Description supporting the StatusReasonCode.")
    @get:JsonProperty("StatusReasonDescription") val statusReasonDescription: kotlin.String? = null,

    @get:Size(min=1,max=500)
    @Schema(example = "null", description = "Path is optional but relevant when the status reason refers to an object/field and hence conditional to provide JSON path.")
    @get:JsonProperty("Path") val path: kotlin.String? = null
) {

}

