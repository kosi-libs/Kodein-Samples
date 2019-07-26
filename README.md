# Samples projects for Kodein Framework

- **Kodein-DI**
    - `di:common`: Kotlin MPP sharable library with Kodein-DI implementation 
    
    `./gradlew :di:common:build`
    
    - `di:console`: Sample for native CLI with Kodein-DI implementation 
    
    `./gradlew :di:console:runReleaseExecutableLinuxX64`
    
    `./gradlew :di:console:runReleaseExecutableMacosX64`
    
    `./gradlew :di:console:runReleaseExecutableMingwX64`
  
    - `di:js`: Sample for JavaScript browser application with Kodein-DI implementation 
    
    `./gradlew :di:js:browserRun`
  
    - `di:jvm`: Sample for Java Jar application with Kodein-DI implementation 
    
    `./gradlew :di:jvm:jar && java -jar di/jvm/build/libs/jvm.jar`
    
    - `di:ktor`: Sample for Ktor server application with Kodein-DI implementation 
    
    `./gradlew :demo:demo-ktor:run` - And navigate to [http://localhost:8000/](http://localhost:8000/) to see the sample home page.  

    - `di:tornadofx`: Sample for TornadoFX integration of Kodein-DI 
    
    `./gradlew :di:tornadofx:run`

> _NB: The JVM projects are made to be run with a JDK8_ 