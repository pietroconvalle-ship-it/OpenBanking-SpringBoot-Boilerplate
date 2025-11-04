package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBPostalAddress7
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
 * Ultimate party that owes an amount of money to the (ultimate) creditor.
 * @param name Name by which a party is known and which is usually used to identify that party.
 * @param identification Identification assigned by an institution.
 * @param LEI Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".
 * @param schemeName Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param postalAddress 
 */
data class OBUltimateDebtor1(

    @get:Size(min=1,max=140)
    @Schema(example = "null", description = "Name by which a party is known and which is usually used to identify that party.")
    @get:JsonProperty("Name") val name: kotlin.String? = null,

    @get:Size(min=1,max=256)
    @Schema(example = "null", description = "Identification assigned by an institution.")
    @get:JsonProperty("Identification") val identification: kotlin.String? = null,

    @get:Pattern(regexp="^[A-Z0-9]{18,18}[0-9]{2,2}$")
    @get:Size(min=1,max=20)
    @Schema(example = "IZ9Q00LZEVUKWCQY6X15", description = "Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".")
    @get:JsonProperty("LEI") val LEI: kotlin.String? = null,

    @Schema(example = "null", description = "Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("SchemeName") val schemeName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PostalAddress") val postalAddress: OBPostalAddress7? = null
) {

}

