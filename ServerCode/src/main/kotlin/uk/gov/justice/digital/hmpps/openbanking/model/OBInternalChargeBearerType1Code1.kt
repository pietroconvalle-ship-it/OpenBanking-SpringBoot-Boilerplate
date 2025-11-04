package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
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
* Specifies which party/parties will bear the charges associated with the processing of the payment transaction.
* Values: BorneByCreditor,BorneByDebtor,FollowingServiceLevel,Shared
*/
enum class OBInternalChargeBearerType1Code1(val value: kotlin.String) {

    @JsonProperty("BorneByCreditor") BorneByCreditor("BorneByCreditor"),
    @JsonProperty("BorneByDebtor") BorneByDebtor("BorneByDebtor"),
    @JsonProperty("FollowingServiceLevel") FollowingServiceLevel("FollowingServiceLevel"),
    @JsonProperty("Shared") Shared("Shared")
}

