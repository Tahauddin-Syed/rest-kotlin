#!/bin/bash
set -e
nohup java -jar ./kotlin-rest.jar &
exec $@