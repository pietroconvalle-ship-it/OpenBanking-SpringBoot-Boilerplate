package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBFrequency61Type
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
 * Regularity with which credit transfer instructions are to be created and processed
 * @param type 
 * @param countPerPeriod Number of instructions to be created and processed during the specified period .Specifies a frequency in terms of a count per period within a specified frequency type. Note: should not be used alongside `PointInTime`
 * @param pointInTime Exact2NumericText - Further information on the exact point in time the event should take place. Specifies a frequency in terms of an exact point in time or moment within a specified frequency type. Note: should not be used alongside `CountPerSide`
 */
data class OBFrequency61(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Type", required = true) val type: OBFrequency61Type,

    @Schema(example = "1", description = "Number of instructions to be created and processed during the specified period .Specifies a frequency in terms of a count per period within a specified frequency type. Note: should not be used alongside `PointInTime`")
    @get:JsonProperty("CountPerPeriod") val countPerPeriod: kotlin.Int? = null,

    @get:Size(max=2)
    @Schema(example = "00", description = "Exact2NumericText - Further information on the exact point in time the event should take place. Specifies a frequency in terms of an exact point in time or moment within a specified frequency type. Note: should not be used alongside `CountPerSide`")
    @get:JsonProperty("PointInTime") val pointInTime: kotlin.String? = null
) {

}

