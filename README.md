<h2>This is an emulated scenario of a stress test for a java application's RAM consumption</h2>
<p>Build the app:</p>
`docker build -t jvm-memory-test .`

<p>Run the app in a container with the following params</p>
`docker run --rm -it --memory=512m --memory-swap=512m jvm-jfr-test`

<p>Check the memory stats with:</p>
`docker stats`
