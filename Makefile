#!/usr/bin/env bash
build:
	mvn clean --quiet package -Dspring.profiles.active=prod --quiet spring-boot:repackage -Dspring.profiles.active=prod --quiet
	cp "target/app.jar" "app.jar";
	rm -rf target
