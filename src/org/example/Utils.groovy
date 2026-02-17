package org.example

class Utils implements Serializable {

    def script

    Utils(script) {
        this.script = script
    }

    def printMessage(msg) {
        script.echo "Message: ${msg}"
    }
}
