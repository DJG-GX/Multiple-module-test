echo "Executing build on branch ${env.BRANCH_NAME}"

node {
	try {
		stage ('merge master') {
			echo "Merging feature into master"
			git url: "https://github.com/DJG-GX/Multiple-module-test.git", branch: "master"
			sh "git merge feature"
			sh "git push"
			steps.git url: "https://github.com/DJG-GX/Multiple-module-test.git", branch: "feature"
		}
	} catch (error){
        throw error
    }
}