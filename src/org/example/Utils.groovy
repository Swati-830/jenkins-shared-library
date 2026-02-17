package org.example

class Utils implements Serializable {

    def steps

    Utils(steps) {
        this.steps = steps
    }

    def printMessage(msg) {
        steps.echo "Message: ${msg}"
    }
}


