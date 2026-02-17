def call() {

    script {
        echo "Starting build process..."

        sh "echo Building project..."
        sh "sleep 2"

        echo "Build completed successfully ✅"
    }
}

