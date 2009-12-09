
  ${project.organization.name} - ${project.name} - README.txt
  Version ${project.version} Build ${buildNumber}
  ${project.url}

  ${project.description}

    See the output of the 'testrunner' application for further information.
    For launching that application use of the scripts found in the 'bin'
    directory is recommended.

    Prior to launching, the environment variable CLASSPATH_PREFIX needs to be
    setup to contain the modules of the logging implementation to test.

    bin/testrunner (Unix)
    bin/testrunner.bat (Windows)

    The 'lib/ext' directory contains Java archives needed to run the application
    with JDK 1.5.

    export JAVA_OPTS="-Djava.ext.dirs='path to lib/ext directory'".
    bin/testrunner (Unix)
    bin/testrunner.bat (Windows)
