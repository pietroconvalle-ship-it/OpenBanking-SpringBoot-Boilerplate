package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBEventResourceUpdate1
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
 * Events.
 * @param urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate 
 */
data class OBEvent1(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("urn:uk:org:openbanking:events:resource-update", required = true) val urnColonUkColonOrgColonOpenbankingColonEventsColonResourceUpdate: OBEventResourceUpdate1
) {

}

