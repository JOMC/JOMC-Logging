
  ${project.organization.name} - ${project.name} - README.txt
  Version ${project.version} Build ${buildNumber}
  ${project.url}

  ${project.description}

    See the output of the 'testsuite' application for further information.
    For launching that application use of the scripts found in the 'bin'
    directory is recommended.

    Prior to launching, the environment variable CLASSPATH_PREFIX needs to be
    setup to contain a classpath entry of the logging implementation to test.

    bin/testsuite org.jomc.logging.it.LoggerTest (Unix)
    bin/testsuite.bat org.jomc.logging.it.LoggerTest (Windows)

    The 'lib/ext' directory contains Java archives needed to run the application
    with JDK 1.5.

    export JAVA_OPTS="-Djava.ext.dirs='path to lib/ext directory'".
    bin/testsuite org.jomc.logging.it.LoggerTest (Unix)
    bin/testsuite.bat org.jomc.logging.it.LoggerTest (Windows)
