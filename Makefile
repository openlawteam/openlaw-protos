LIB_DIR    := libs
SCALA_DIST := $(LIB_DIR)/scala

# External Service Module
EXTERNAL_SERVICE_SCALA_ROOT 	:= ${SCALA_DIST}/external-service
EXTERNAL_SERVICE_SCALA_OUTPUT 	:= ${EXTERNAL_SERVICE_SCALA_ROOT}/src/main/scala
EXTERNAL_SERVICE_PACKAGE 		:= integration/framework/openlaw
EXTERNAL_SERVICE_SCALA_PATH 	:= ${EXTERNAL_SERVICE_SCALA_OUTPUT}/${EXTERNAL_SERVICE_PACKAGE}

clean-es-scala:
	@echo 'Deleting scala classes...'
	rm -rf ${EXTERNAL_SERVICE_SCALA_PATH}
	rm -rf ${EXTERNAL_SERVICE_SCALA_ROOT}/build/libs
	@echo 'Scala files deleted with success'

build-es-scala:
	@echo 'Generating scala classes from ExternalService.proto...'
	docker run -u `id -u` --rm -it -v $(PWD):/src openlaw/protocore protoc \
			--doc_out=${SCALA_DIST} --doc_opt=markdown,README.md \
			--scala_out=flat_package,grpc:${EXTERNAL_SERVICE_SCALA_OUTPUT} \
			ExternalService.proto
	@ls '${EXTERNAL_SERVICE_SCALA_PATH}'
	@echo 'Files generated with success'
	@echo 'Building library...'
	docker run -u `id -u` --rm -it \
			-v $(PWD)/${EXTERNAL_SERVICE_SCALA_ROOT}:/home/gradle/project \
			-w /home/gradle/project gradle gradle build
	@echo 'Library built with success'

publish-es-scala:
	@echo 'Releasing scala external-service scala library...'
	docker run -u `id -u` --rm -it \
	 		-v $(PWD)/${EXTERNAL_SERVICE_SCALA_ROOT}:/home/gradle/project \
	 		-w /home/gradle/project gradle gradle publish
	@echo 'Library released with success'

.PHONY: clean-es-scala build-es-scala publish-es-scala