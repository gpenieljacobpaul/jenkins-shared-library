#!/usr/bin/env groovy

package com.example

class Docker implements Serializable {
    def script

    Docker(script) {
        this.script = script
    }

    def dockerBuild(String Image) {
        script.echo "building the docker image for the branch $script.BRANCH_NAME"
        script.sh "docker build -t $Image ."
        }

    def dockerLogin() {
        script.withCredentials([script.usernamePassword(credentialsId: 'docker', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
            script.sh "echo $script.PASS | docker login -u $script.USER --password-stdin"
        }
    }

    def dockerPush(String Image) {
        script.sh "docker push $Image"
    }
}