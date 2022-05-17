#!/usr/bin/env bash
build:
	mvn clean --quiet package --quiet spring-boot:repackage  --quiet -Dmaven.test.skip=true -Drun.jvmArguments="-Xms128m -Xmx128m" -Drun.profiles=prod
	cp "target/app.jar" "app.jar";
	rm -rf target
