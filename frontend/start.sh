#!/bin/bash

REPOSITORY_DIR=$(pwd)

cd "$REPOSITORY_DIR" || exit
docker run --rm -it -p 3000:3000 todo-list
