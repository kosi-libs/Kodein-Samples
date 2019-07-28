# Samples projects for Kodein Framework

> _NB: The JVM projects are made to be run with a JDK8_ 
>
### **Kodein-DI**

##### Android application

`di:android`: Android application with Kodein-DI implementation 
    
```bash
./gradlew :di:android:assembleDebug
``` 
> Or run it through your IDE

##### Multiplateform library

`di:common`: Kotlin MPP sharable library with Kodein-DI implementation 

```bash
./gradlew :di:common:build
```
    
##### Native CLI application 

`di:console`: Sample for native CLI with Kodein-DI implementation 

> Linux
```bash
./gradlew :di:console:runReleaseExecutableLinuxX64
```
> OSX
```bash
./gradlew :di:console:runReleaseExecutableMacosX64
```
> Windows
```bash
./gradlew :di:console:runReleaseExecutableMingwX64
```
  
##### JavaScript application

`di:js`: Sample for JavaScript browser application with Kodein-DI implementation 

```bash
./gradlew :di:js:browserRun
```
  
##### Java application

`di:jvm`: Sample for Java Jar application with Kodein-DI implementation 

```bash
./gradlew :di:jvm:jar && java -jar di/jvm/build/libs/jvm.jar
```

##### Ktor application

`di:ktor`: Sample for Ktor server application with Kodein-DI implementation 

```bash
./gradlew :di:ktor:run 
```
And navigate to [http://localhost:8000/](http://localhost:8000/) to see the sample home page.

##### TornadoFX application

`di:tornadofx`: Sample for TornadoFX integration of Kodein-DI 

```bash
./gradlew :di:tornadofx:run
```