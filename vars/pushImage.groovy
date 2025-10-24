#!/usr/bin/env groovy

import com.example.Docker

def call(String Image) {
    return new Docker(this).dockerPush(Image)
}