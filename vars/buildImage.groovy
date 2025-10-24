#!/usr/bin/env groovy

import com.example.Docker

def call(String Image) {
    return new Docker(this).dockerBuild(Image)
//    echo "building the docker image for the branch $BRANCH_NAME"
//    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
//        sh "docker build -t $Image ."
//        sh "echo $PASS | docker login -u $USER --password-stdin"
//        sh "docker push $Image"
//    }
}