#!/bin/bash

#starts an application with enabled debug logging
cd "$(dirname "$0")"
java -Dlog4j.configurationFile=../config/log4j2.xml -jar ../application-skeleton.jar
