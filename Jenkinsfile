echo "Executing build on branch ${env.BRANCH_NAME}"

node {
	try {
		stage ('merge master') {
			echo "Merging feature into master"
			git url: "https://github.com/DJG-GX/Multiple-module-test.git", branch: "merge"
			git url: "https://github.com/DJG-GX/Multiple-module-test.git", branch: "master"
			bat "git merge origin/merge"
			bat "git push --set-upstream origin master"
			git url: "https://github.com/DJG-GX/Multiple-module-test.git", branch: "merge"
		}
	} catch (error){
		throw error
	}
}