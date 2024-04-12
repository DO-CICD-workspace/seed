job('ExampleJob') {
    displayName('Example Job')
    description('This is an example job created using Job DSL')

    // Add build steps
    steps {
        shell('echo "Hello, world!"')
        // Add more build steps as needed
    }
}
