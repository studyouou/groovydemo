#!/usr/bin/env bash


java -Dspring.datasource.url="jdbc:mysql://192.168.43.201/groovydemo?useUnicode=true&characterEncoding=utf-8&useSSL=false" \
 -Dspring.datasource.username=root \
 -Dspring.datasource.password=mysql123 \
 -Ddata.drop=false -Ddata.init=true \
 -Ddata.dir=D:/choerodons/groovy-demo/src/main/resources/ \
 -jar D:/googledate/choerodon-tool-config-0.11.1.RELEASE.jar