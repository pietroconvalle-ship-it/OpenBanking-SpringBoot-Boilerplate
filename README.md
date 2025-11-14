### OpenBanking Server SpringBoot boilerplate

##### OpenApi spec
This code was generated using the `OpenBanking spec v4`
> https://github.com/OpenBankingUK/read-write-api-specs/tree/master/dist/openapi

The separate files were merged into a single one using `openapi-merge`
> https://github.com/robertmassaioli/openapi-merge

##### Code Gen
Code was generated using `OpenApi Generator 7` for `kotling-spring` with the parameters `UseSpringBoot3` and `gradleBuildFile` set to `true`

Post code generation build.gradle.kts was updated to support java21 and the latest springboot stable.


### Generate code to latest spec

Install openapi-generator from brew:
`brew install openapi-generator`

Copy the latest openapi spec from github to the folder `OpenApiSpec`

Update `OpenApiSpec/openapi-merge.json` to include new files or exclude files that aren't anymore required

**From the root of the project** run `make generate` to re-generate the code


### Authorization
JWT authorization is provided by hmpps-auth in docker compose

to get a token:
```
curl -X POST "http://localhost:8090/auth/oauth/token?grant_type=client_credentials" -H 'Content-Type: application/json' -H "Authorization: Basic $(echo -n hmpps-prisoner-finance-poc-api-1:clientsecret | base64)"
```

The permissions are defined in `config/OpenApiConfiguration.ket`

Permissions need to be set on each endpoint by adding the annotations:

```
  @SecurityRequirement(name = "bearer-jwt", scopes = [ROLE_PRISONER_FINANCE_SYNC])
  @PreAuthorize("hasAnyAuthority('$ROLE_PRISONER_FINANCE_SYNC')")
  fun yourendpoint(...
```
Replace the permission with the adequate ones.


OpenBanking also requires `x-jws-signature` but they are not currently implemented by this codebase.