#!/bin/bash
set -e
nohup java -jar ../target/kotlin-rest.jar &
exec $@