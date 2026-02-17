def call(List allowedBranches = ["main"]) {

    script {
        def currentBranch = env.BRANCH_NAME ?: "unknown"

        echo "Current Branch: ${currentBranch}"

        if (!allowedBranches.contains(currentBranch)) {
            error "Branch ${currentBranch} is not allowed to run this pipeline."
        }

        echo "Branch validation passed ✅"
    }
}

