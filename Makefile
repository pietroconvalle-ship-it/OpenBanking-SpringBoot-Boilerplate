.PHONY: generate

generate:
	openapi-generator generate \
		-i OpenApiV4Spec/openbankingmerged.swagger.json \
		-g kotlin-spring \
		-o . \
		--api-package uk.gov.justice.digital.hmpps.openbanking.api \
		--model-package uk.gov.justice.digital.hmpps.openbanking.model \
		--additional-properties useSpringBoot3=true,gradleBuildFile=false,basePackage=uk.gov.justice.digital.hmpps.openbanking,configPackage=uk.gov.justice.digital.hmpps.openbanking.config

build:
	./gradlew build

run: build
	./gradlew bootRun