package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBReadBalance1DataBalanceInner
import org.openapitools.model.OBReadBalance1DataTotalValue
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
 * @param balance 
 * @param totalValue 
 */
data class OBReadBalance1Data(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Balance", required = true) val balance: kotlin.collections.List<OBReadBalance1DataBalanceInner>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("TotalValue") val totalValue: OBReadBalance1DataTotalValue? = null
) {

}

