def call(String status) {

    script {
        if (status == "SUCCESS") {
            echo "🎉 Build Succeeded!"
        } else if (status == "FAILURE") {
            echo "❌ Build Failed!"
        } else {
            echo "ℹ️ Build Status: ${status}"
        }
    }
}

