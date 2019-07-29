# Samples projects for Kodein Framework

### **Kodein-DI**

#### Coffee-Maker (multiplatform Application)

> Based on Dagger's example

##### Common multiplatform library

`di:coffee-maker:common`: Kotlin MPP sharable library with Kodein-DI implementation 

```bash
./gradlew :di:coffee-maker:common:build
```

##### Android

`di:coffee-maker:android`: Android application with Kodein-DI implementation 
    
```bash
./gradlew :di:coffee-maker:android:assembleDebug
``` 
> Or run it through your IDE

##### Native CLI 

`di:coffee-maker:console`: Sample for native CLI with Kodein-DI implementation 

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
  
##### JavaScript

`di:coffee-maker:js`: Sample for JavaScript browser application with Kodein-DI implementation 

```bash
./gradlew :di:coffee-maker:js:browserRun
```
  
##### Java

`di:coffee-maker:jvm`: Sample for Java Jar application with Kodein-DI implementation 

```bash
./gradlew :di:coffee-maker:jvm:jar && java -jar di/coffee-maker/jvm/build/libs/jvm.jar
```

#### Standalone applications
##### Ktor

`di:standalone:ktor`: Sample for Ktor server application with Kodein-DI implementation 

```bash
./gradlew :di:standalone:ktor:run 
```
And navigate to [http://localhost:8000/](http://localhost:8000/) to see the sample home page.

##### TornadoFX

> _NB: The TornadoFX project is made to be run with a JDK8, as superior JDKs doesn't have JavaFX anymore_ 

`di:standalone:tornadofx`: Sample for TornadoFX integration of Kodein-DI 

```bash
./gradlew :di:standalone:tornadofx:run
```