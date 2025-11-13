package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBEventLink1

/**
 * The resource-update event.
 * @param subjectType Subject type for the updated resource.
 * @param httpOpenbankingOrgUkRid Resource Id for the updated resource.
 * @param httpOpenbankingOrgUkRty Resource Type for the updated resource.
 * @param httpOpenbankingOrgUkRlk Resource links to other available versions of the resource.
 */
data class OBEventSubject1(

  @get:Size(min = 1, max = 128)
  @Schema(example = "null", required = true, description = "Subject type for the updated resource. ")
  @get:JsonProperty("subject_type", required = true) val subjectType: kotlin.String,

  @get:Size(min = 1, max = 128)
  @Schema(example = "null", required = true, description = "Resource Id for the updated resource.")
  @get:JsonProperty("http://openbanking.org.uk/rid", required = true) val httpOpenbankingOrgUkRid: kotlin.String,

  @get:Size(min = 1, max = 128)
  @Schema(example = "null", required = true, description = "Resource Type for the updated resource.")
  @get:JsonProperty("http://openbanking.org.uk/rty", required = true) val httpOpenbankingOrgUkRty: kotlin.String,

  @field:Valid
  @get:Size(min = 1)
  @Schema(example = "null", required = true, description = "Resource links to other available versions of the resource.")
  @get:JsonProperty("http://openbanking.org.uk/rlk", required = true) val httpOpenbankingOrgUkRlk: kotlin.collections.List<OBEventLink1>,
)
