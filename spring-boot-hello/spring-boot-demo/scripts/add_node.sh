#!/bin/bash


curl -i -X POST -H "Content-Type: application/json" -d '{"id":1, "name":"test", "value":"1" }' http://localhost:9090/node

curl http://localhost:9090/node/1
curl http://localhost:9090/node