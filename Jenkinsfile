echo "Executing build on branch ${env.BRANCH_NAME}"

node {
	try {
		stage ('merge master') {
			echo "Merging feature into master"
			git url: "https://github.com/DJG-GX/Multiple-module-test.git", branch: "master"
			bat "git merge origin/feature"
			bat "git push"
			steps.git url: "https://github.com/DJG-GX/Multiple-module-test.git", branch: "origin/feature"
		}
	} catch (error){
        throw error
    }
}