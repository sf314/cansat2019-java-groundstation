# cansat2019-java-groundstation
CanSat 2019 Java Ground Station

### Gist:
- basically, you need the following commands:
    - `git` (for source control)
    - `javac` (for compiling)
    - `java` (for running)
- if you use BlueJ, you can probably use that for compiling and running code

### New setup instructions:

Windows:

0. If you haven't yet, clone this repo somewhere
1. Install Git (link: https://git-scm.com/download/win). Use default settings.
2. Install the Java JDK version 9 (for access to javac, java commands).
3. Update your environment PATH variable in Windows settings:
    - Add this to the end (without quotes, of course):
      `C:\Program Files\Java\jdk-9.0.4\bin`
    - The version number may be different.
4. Look in the repo at: Java-Ground-Station\rxtx\Windows\win_x64
    - copy the .dll's to `C:\Program Files\Java\jdk-9.0.4\bin`
    - copy the .jar to `C:\Program Files\Java\jdk-9.0.4\lib`
5. Test
    - Open Git Bash
    - type `where java`. Should show path to java executable (not the block of rubbish)
    - type `where javac`. Should show path to javac executable (not the block of rubbish)

Mac:

0. If you haven't yet, clone this repo somewhere
1. If you haven't yet, install git
    - try to run `git` from terminal, and it should prompt you to install the toolchain
    - otherwise, go to https://git-scm.com/download
2. Install the Java JDK version 9 or whatever
    - If you can run `java` and `javac` from Terminal, then you're good
3. Look in the repo at Java-Ground-Station/rxtx
    - copy RXTXcomm.jar to /Library/Java/Extensions
    - copy mac_64b_librxtxSerial.jnilib to /Library/Java/Extensions
    - rename the .jnilib file to just librxtxSerial.jnilib
    - this is the updated version, as provided by moi.
4. Resolve some locking issues with 64-bit macs
    - run the following commands in terminal (use your own username):
        - sudo mkdir /var/lock
        - sudo dscl . -append /groups/_uucp GroupMembership yourUserName
        - sudo chgrp uucp /var/lock
        - sudo chmod 775 /var/lock
    - this resloves the PortInUseException issue with file locking
5. Test
    - open Terminal and make sure the following commands exist:
        - git
        - javac
        - java
        - make (optional, technically)


### Running the Ground Station

If you're on a Mac, then this should be easy, as there is a provided Makefile.

0. Open Terminal and navigate into the `src` directory of the repo.
1. Enter `make`. This compiles the code. 
2. Enter `make run`. This runs the code. 
If you wanna look at the commands used by `make`, then look at the Makefile.
I'll also update the Makefile as more files are added.

If you're on Windows, then this is gonna be easy, but slightly less so. 

0. Open Git Bash and navigate to the `src` directory of the repo.
1. To compile the code, run:
    - `javac -cp ../rxtx/RXTXcomm.jar JGroundStation.java CSPort.java`
    - I specify the classpath with the `-cp` flag, since sometimes java 
    is silly and can't find the class definitions for things. You'll also
    need to specify every single `.java` file. You'll receive some errors
2. To run the code, run:
    - `java -cp ..rxtx/RXTXcomm.jar:. JGroundStation`
    - I also specify the classpath here because otherwise it complains. Note
    how I also list specify the current using `.`. 
