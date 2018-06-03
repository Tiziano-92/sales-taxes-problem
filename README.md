# Sales taxes solution
This project contains the solution (implemented in Java language) for the Sales Taxes problem which can be viewed at this link: https://github.com/xpeppers/sales-taxes-problem/blob/master/README.md

# Requirements

1.  [Java JDK >=8](http://www.oracle.com/technetwork/java/javase/downloads/index.html). **Not the JRE**

    Ensure that the `java` command is in the PATH and is using version 8. For example:
    ```bash
    > java -version 
    java version "1.8.0_66"
    Java(TM) SE Runtime Environment (build 1.8.0_66-b17)
    Java HotSpot(TM) 64-Bit Server VM (build 25.66-b17, mixed mode)
    ```

    If the kernel cannot start with an error along the lines of
    ```text
    Exception in thread "main" java.lang.NoClassDefFoundError: jdk/jshell/JShellException
            ...
    Caused by: java.lang.ClassNotFoundException: jdk.jshell.JShellException
            ...
    ```
    then double check that `java` is referring to the command for the `jdk` and not the `jre`.

# Run Locally
1. Clone this repo.

   ```
   git clone https://gitlab.com/tiziano92/sales-taxes-problem.git
   ```
2. Go into the project's folder

   ```
   cd sales-taxes-problem
   ```
3. Visit the application at [http://localhost:8080](http://localhost:8080).