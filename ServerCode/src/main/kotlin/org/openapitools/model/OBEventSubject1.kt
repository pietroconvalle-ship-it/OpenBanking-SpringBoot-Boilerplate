package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBEventLink1
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
 * The resource-update event.
 * @param subjectType Subject type for the updated resource. 
 * @param httpColonOpenbankingOrgUkRid Resource Id for the updated resource.
 * @param httpColonOpenbankingOrgUkRty Resource Type for the updated resource.
 * @param httpColonOpenbankingOrgUkRlk Resource links to other available versions of the resource.
 */
data class OBEventSubject1(

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Subject type for the updated resource. ")
    @get:JsonProperty("subject_type", required = true) val subjectType: kotlin.String,

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Resource Id for the updated resource.")
    @get:JsonProperty("http://openbanking.org.uk/rid", required = true) val httpColonOpenbankingOrgUkRid: kotlin.String,

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Resource Type for the updated resource.")
    @get:JsonProperty("http://openbanking.org.uk/rty", required = true) val httpColonOpenbankingOrgUkRty: kotlin.String,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Resource links to other available versions of the resource.")
    @get:JsonProperty("http://openbanking.org.uk/rlk", required = true) val httpColonOpenbankingOrgUkRlk: kotlin.collections.List<OBEventLink1>
) {

}

