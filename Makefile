EXTERNAL_SERVICE_SCALA_ROOT := ./scala/external-service
EXTERNAL_SERVICE_SCALA_OUTPUT := ${EXTERNAL_SERVICE_SCALA_ROOT}/src/main/scala
EXTERNAL_SERVICE_PACKAGE := integration/framework/openlaw
EXTERNAL_SERVICE_SCALA_PATH := ${EXTERNAL_SERVICE_SCALA_OUTPUT}/${EXTERNAL_SERVICE_PACKAGE}

delete-scala-external-service:
	@echo 'Deleting scala classes...'
	rm -rf ${EXTERNAL_SERVICE_SCALA_PATH}
	@echo 'Scala files deleted with success'

scala-external-service:
	@echo 'Generating scala classes from ExternalService.proto...'
	docker run --user `id -u` --rm -it -v $(PWD):/src openlaw/protocore \
	protoc --scala_out=flat_package,grpc:${EXTERNAL_SERVICE_SCALA_OUTPUT} ExternalService.proto
	@ls '${EXTERNAL_SERVICE_SCALA_PATH}'
	@echo 'Files generated with success'
	@echo 'Building library...'
	${EXTERNAL_SERVICE_SCALA_ROOT}/gradlew build
	@echo 'Library built with success'

scala-build-external-service:
	@echo 'Building scala library for ExternalService.proto'
	${EXTERNAL_SERVICE_SCALA_ROOT}/gradlew build

.PHONY: scala-external-service \
		delete-scala-external-service \
		scala-build-external-service