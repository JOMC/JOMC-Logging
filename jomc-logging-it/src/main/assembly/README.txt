
  ${project.organization.name} - ${project.name} - README.txt
  Version ${project.version} (${build.date})
  ${project.url}

  ${project.description}

    See the output of the 'test-logger' application for further information.
    For launching that application use of the scripts found in the 'bin'
    directory is recommended.

    Prior to launching, the environment variable CLASSPATH_PREFIX needs to be
    setup to contain the modules of the logging implementation to test.
    Alternatively you can unpack the classes into the 'etc' directory.

    bin/test-logger (Unix)
    bin/test-logger.bat (Windows)

  JDK 1.5

    The 'lib/jdk5/ext' directory contains JDK extensions to setup using the
    'java.ext.dirs' system property or another mechanism compatible to the JDK
    in use.

    The 'lib/jdk5/endorsed' directory contains updates to libraries part of the
    JDK to setup via the 'java.endorsed.dirs' system property or another
    mechanism compatible to the JDK in use. Use of these libraries may become
    necessary when encountering problems with the XML parsers of the JDK.

    export JAVA_OPTS="-Djava.ext.dirs=lib/jdk5/ext \
                      -Djava.endorsed.dirs=lib/jdk5/endorsed".

    bin/test-logger (Unix)
    bin/test-logger.bat (Windows)
