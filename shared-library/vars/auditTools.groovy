//this library needs to be published in a seprate repo
// the files should be in a directory called vars

// name of the file has to be the name with which it has to be referenced
def call() //name of the method has to be call always

{
    node{
        // wrapping in node, gives freedeom to use as a step
        sh '''
        git version 
        '''
    }
}