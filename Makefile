#!/usr/bin/env bash
build:
	mvn clean --quiet -Dspring.profiles.active=prod package --quiet spring-boot:repackage --quiet -Dspring.profiles.active=prod -Dmaven.test.skip=true
	cp "target/app.jar" "app.jar";
	rm -rf target
