# Samples projects for Kodein Framework

### **Kodein-DI**

##### Android application

`di:android`: Android application with Kodein-DI implementation 
    
```bash
./gradlew :di:coffee-maker:android:assembleDebug
``` 
> Or run it through your IDE

##### Multiplateform library

`di:common`: Kotlin MPP sharable library with Kodein-DI implementation 

```bash
./gradlew :di:coffee-maker:common:build
```
    
##### Native CLI application 

`di:console`: Sample for native CLI with Kodein-DI implementation 

> Linux
```bash
./gradlew :di:coffee-maker:console:runReleaseExecutableLinuxX64
```
> OSX
```bash
./gradlew :di:coffee-maker:console:runReleaseExecutableMacosX64
```
> Windows
```bash
./gradlew :di:coffee-maker:console:runReleaseExecutableMingwX64
```
  
##### JavaScript application

`di:js`: Sample for JavaScript browser application with Kodein-DI implementation 

```bash
./gradlew :di:coffee-maker:js:browserRun
```
  
##### Java application

`di:jvm`: Sample for Java Jar application with Kodein-DI implementation 

```bash
./gradlew :di:coffee-maker:jvm:jar && java -jar di/coffee-maker/jvm/build/libs/jvm.jar
```

##### Ktor application

`di:ktor`: Sample for Ktor server application with Kodein-DI implementation 

```bash
./gradlew :di:standalone:ktor:run 
```
And navigate to [http://localhost:8000/](http://localhost:8000/) to see the sample home page.

##### TornadoFX application

> _NB: The TornadoFX project is made to be run with a JDK8, as superior JDKs doesn't have JavaFX anymore_ 

`di:tornadofx`: Sample for TornadoFX integration of Kodein-DI 

```bash
./gradlew :di:standalone:tornadofx:run
```