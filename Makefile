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
	@echo 'Generating scala classes from...'
	@ls | grep proto
	docker run -u `id -u` --rm -it -v $(PWD):/src openlaw/protocore protoc \
			--doc_out=${SCALA_DIST} --doc_opt=markdown,README.md \
			--scala_out=flat_package,grpc:${EXTERNAL_SERVICE_SCALA_OUTPUT} \
			*.proto
	@ls '${EXTERNAL_SERVICE_SCALA_PATH}'
	@echo 'Files generated with success'
	@echo 'Building library...'
	docker run -u `id -u` --rm -it \
			-v $(PWD)/${EXTERNAL_SERVICE_SCALA_ROOT}:/home/gradle/project \
			-w /home/gradle/project gradle:6.4.1 gradle build
	@echo 'Library built with success'

publish-es-scala:
	@echo 'Publishing scala external-service scala library to Bintray...'
	docker run -u `id -u` --rm -it \
			-e 'BINTRAY_USER=${BINTRAY_USER}' -e 'BINTRAY_KEY=${BINTRAY_KEY}' \
	 		-v $(PWD)/${EXTERNAL_SERVICE_SCALA_ROOT}:/home/gradle/project \
	 		-w /home/gradle/project gradle:6.4.1 gradle bintrayUpload --info
	@echo 'Library published with success'

.PHONY: clean-es-scala build-es-scala publish-es-scala