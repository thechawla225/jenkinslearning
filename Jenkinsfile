pipeline{
    agent any
    environment{
        RELEASE="20.04"
    }
    stages
    {
        stage("Build")
        {
            environment{
                LOG_LEVEL='INFO'
            }
            parallel{
        
            stage('linux-arm64')
            {
                steps{
                    echo "Buidling release ${RELEASE} for ${STAGE_NAME} with log level"
                }
            }
            
            stage('linux-amd64')
            {
                steps{
                    echo "Buidling release ${RELEASE} for ${STAGE_NAME} with log level"
                }
            }
            
            stage('windows-amd64')
            {
                steps{
                    echo "Buidling release ${RELEASE} for ${STAGE_NAME} with log level"
                }
            }
       } 
       
        }

        stage('Test')
        {
              steps{
                echo "Testing $RELEASE"
                writeFile file: "test-results.txt", text: "passed"
            }
        }
        stage("Deploy")
        {
            input{
                message 'Deploy?'
                ok 'Do it'
                parameters
                {
                    string(name: 'TARGET_ENVIRONMENT', defaultValue: 'PROD', description: 'Target deployment environment')
                }
            }
            steps{
                echo "Deploying release ${RELEASE} to environment ${TARGET_ENVIRONMENT}" 
            }
        }
    }
    post{
        success{
            archiveArtifacts 'test-results.txt'
        }
    }
}