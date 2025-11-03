package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBWriteDomesticResponse5DataRefundAccount
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
 * Unambiguous identification of the refund account to which a refund will be made as a result of the transaction.
 * @param account 
 */
data class OBWriteDomesticResponse5DataRefund(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Account", required = true) val account: OBWriteDomesticResponse5DataRefundAccount
) {

}

