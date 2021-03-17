pipeline 
{
	agent any
	tools 
	{
		maven 'JenkinsMaven'
	}

	stages 
	{
		stage("Checkout code from SCM") 
		{
			steps
			{
				echo "SCM  Stage"
				git branch: 'jenkins_job', 
				changelog: false, 
				credentialsId: 'pcfawsDevops', 
				url: 'https://github.com/pcfawsDevops/aws.git'
			}
		}
		stage("Build") 
		{
			steps

			{ 
				sh ''' 
				echo "Build Stage"
				mvn clean package
				'''		
				
			}
		}
		stage("Test") 
		{
			steps
			{
				echo "Test Stage"
			}
		}
		stage("Deploy") 
		{
			steps
			{
				echo "Deploy Stage"
			}
		}
	}
}
