package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBPostalAddress7
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
 * Financial institution servicing an account for the debtor.
 * @param schemeName Name of the identification scheme, in a coded form as published in an external list.<br/> For a full list of enumeration values refer to `OBInternalFinancialInstitutionIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param identification Unique and unambiguous identification of a financial institution or a branch of a financial institution.
 * @param name Name by which an agent is known and which is usually used to identify that agent.
 * @param LEI Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".
 * @param postalAddress 
 */
data class OBBranchAndFinancialInstitutionIdentification62(

    @Schema(example = "UK.OBIE.BICFI", description = "Name of the identification scheme, in a coded form as published in an external list.<br/> For a full list of enumeration values refer to `OBInternalFinancialInstitutionIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("SchemeName") val schemeName: kotlin.String? = null,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Unique and unambiguous identification of a financial institution or a branch of a financial institution.")
    @get:JsonProperty("Identification") val identification: kotlin.String? = null,

    @get:Size(min=1,max=140)
    @Schema(example = "Agent Name", description = "Name by which an agent is known and which is usually used to identify that agent.")
    @get:JsonProperty("Name") val name: kotlin.String? = null,

    @get:Pattern(regexp="^[A-Z0-9]{18,18}[0-9]{2,2}$")
    @get:Size(min=1,max=20)
    @Schema(example = "IZ9Q00LZEVUKWCQY6X15", description = "Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".")
    @get:JsonProperty("LEI") val LEI: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PostalAddress") val postalAddress: OBPostalAddress7? = null
) {

}

