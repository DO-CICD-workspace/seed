job('ExampleJob') {
    displayName('Example Job')
    description('This is an example job created using Job DSL')

    // Configure SCM (Source Code Management)
    scm {
        git {
            remote {
                url('https://github.com/example/example.git')
            }
            branches('*/main')
        }
    }

    // Add build steps
    steps {
        shell('echo "Hello, world!"')
        // Add more build steps as needed
    }

    // Configure triggers
    triggers {
        cron('@daily')
        // Add more triggers as needed
    }

    // Configure post-build actions
    publishers {
        // Add post-build actions such as email notifications, etc.
    }

    // Configure build environment
    wrappers {
        // Add build environment configurations
    }

    // Configure build parameters
    parameters {
        // Add build parameters if needed
    }

    // Configure other job properties as needed
}
