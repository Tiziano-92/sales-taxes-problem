# Sales taxes solution
This project contains the solution (implemented in Java language) for the Sales Taxes problem which can be viewed at [this link](https://github.com/xpeppers/sales-taxes-problem/blob/master/README.md).

## Requirements

1.  [Java JDK >=8](http://www.oracle.com/technetwork/java/javase/downloads/index.html). **Not the JRE**

    Ensure that the `java` command is in the PATH and is using version 8. For example:
    ```bash
    > java -version 
    java version "1.8.0_66"
    Java(TM) SE Runtime Environment (build 1.8.0_66-b17)
    Java HotSpot(TM) 64-Bit Server VM (build 25.66-b17, mixed mode)
    ```

    If the kernel cannot start, with an error along the lines of
    ```text
    Exception in thread "main" java.lang.NoClassDefFoundError: jdk/jshell/JShellException
            ...
    Caused by: java.lang.ClassNotFoundException: jdk.jshell.JShellException
            ...
    ```
    then double check that `java` is referring to the command for the `jdk` and not the `jre`.

2.  [Apache Ant](http://ant.apache.org/)
    
    Ensure that the `ant` command is in the PATH. For example:
    ```bash
        > ant -version 
        Apache Ant(TM) version 1.10.1"
    ```

## Run Locally
1.  Clone this repo.

    ```bash
        > git clone https://gitlab.com/tiziano92/sales-taxes-problem.git
    ```

2.  Go into the project's folder.

    ```bash
        > cd sales-taxes-problem
    ```
    
3.  Compile the project.

    ```bash
        > ant compile
    ```
    
4.  Run the program

    ```bash
        > ant execute.TestRunner
    ```

## Directory Tree

```
./src
├── entities
│   ├── Good.java
│   ├── ImportedGood.java
│   ├── NonImportedGood.java
│   ├── Receipt.java
│   ├── ShoppingBasket.java
├── exceptions
│   ├── GoodNotFoundException.java
│   ├── ShoppingBasketNotFoundException.java
├── good_types
│   ├── GoodType.java
├── helper
│   ├── Helper.java
├── interfaces
│   ├── GoodInterface.java
│   ├── ReceiptInterface.java
│   ├── ShoppingBasketInterface.java
├── test
    ├── ReceiptJUnit.java
    ├── TestRunner.java
    ├── result.txt
    

6 directories, 15 files
```
