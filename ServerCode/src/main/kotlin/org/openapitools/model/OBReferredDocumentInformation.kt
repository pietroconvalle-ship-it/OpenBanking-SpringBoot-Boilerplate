package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ExternalDocumentType1Code
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
 * @param code 
 * @param issuer dentification of the issuer of the reference document type.
 * @param number Identification of the type specified for the referred document line.
 * @param relatedDate Date associated with the referred document line.
 * @param lineDetails Set of elements used to provide the content of the referred document line.
 */
data class OBReferredDocumentInformation(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Code") val code: ExternalDocumentType1Code? = null,

    @get:Size(min=1,max=140)
    @Schema(example = "null", description = "dentification of the issuer of the reference document type.")
    @get:JsonProperty("Issuer") val issuer: kotlin.String? = null,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Identification of the type specified for the referred document line.")
    @get:JsonProperty("Number") val number: kotlin.String? = null,

    @Schema(example = "null", description = "Date associated with the referred document line.")
    @get:JsonProperty("RelatedDate") val relatedDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Set of elements used to provide the content of the referred document line.")
    @get:JsonProperty("LineDetails") val lineDetails: kotlin.collections.List<kotlin.String>? = null
) {

}

