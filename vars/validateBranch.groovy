def call(List allowedBranches = ["main"]) {

    script {
        def currentBranch = env.BRANCH_NAME

        if (!currentBranch) {
            echo "No branch detected (normal pipeline job). Skipping validation ✅"
            return
        }

        echo "Current Branch: ${currentBranch}"

        if (!allowedBranches.contains(currentBranch)) {
            error "Branch ${currentBranch} is not allowed to run this pipeline."
        }

        echo "Branch validation passed ✅"
    }
}
