// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Copyright (c) 2010 The JOMC Project
 *   Copyright (c) 2005 Christian Schulte <schulte2005@users.sourceforge.net>
 *   All rights reserved.
 *
 *   Redistribution and use in source and binary forms, with or without
 *   modification, are permitted provided that the following conditions
 *   are met:
 *
 *     o Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *
 *     o Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in
 *       the documentation and/or other materials provided with the
 *       distribution.
 *
 *   THIS SOFTWARE IS PROVIDED BY THE JOMC PROJECT AND CONTRIBUTORS "AS IS"
 *   AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 *   THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 *   PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE JOMC PROJECT OR
 *   CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 *   EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 *   PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 *   OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 *   WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 *   OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *   ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *   $Id$
 *
 */
// </editor-fold>
// SECTION-END
package org.jomc.logging.it;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.LogManager;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import static org.junit.Assert.fail;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Logging system test suite.
 * <p><b>Dependencies</b><ul>
 * <li>"{@link #getLocale Locale}"<blockquote>
 * Dependency on {@code java.util.Locale} at specification level 1.1 bound to an instance.</blockquote></li>
 * <li>"{@link #getLogger Logger}"<blockquote>
 * Dependency on {@code org.jomc.logging.Logger} at specification level 1.0 bound to an instance.</blockquote></li>
 * </ul></p>
 * <p><b>Messages</b><ul>
 * <li>"{@link #getTestImplementationNotFoundMessage testImplementationNotFound}"<table>
 * <tr><td valign="top">English:</td><td valign="top"><pre>No test implementation found.</pre></td></tr>
 * <tr><td valign="top">Deutsch:</td><td valign="top"><pre>Keine Test-Implementierung gefunden.</pre></td></tr>
 * </table>
 * </ul></p>
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.0
 * @version $Id$
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                             comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-19/jomc-tools" )
// </editor-fold>
// SECTION-END
public class LoggerTest
{
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code LoggerTest} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-19/jomc-tools" )
    public LoggerTest()
    {
        // SECTION-START[Default Constructor]
        super();
        // SECTION-END
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[LoggerTest]

    /**
     * Tests the {@link org.jomc.logging.Logger#isInfoEnabled() isXxxEnabled()} methods to not throw any exceptions.
     *
     * @throws Exception if testing fails.
     */
    @Test public void testIsEnabled() throws Exception
    {
        if ( this.getLogger() != null )
        {
            this.getLogger().isDebugEnabled();
            this.getLogger().isErrorEnabled();
            this.getLogger().isFatalEnabled();
            this.getLogger().isInfoEnabled();
            this.getLogger().isTraceEnabled();
            this.getLogger().isWarnEnabled();
        }
        else
        {
            fail( this.getTestImplementationNotFoundMessage( this.getLocale() ) );
        }
    }

    /**
     * Tests the various logger methods to not throw any exceptions.
     *
     * @throws Exception if testing fails.
     */
    @Test public void testLog() throws Exception
    {
        if ( this.getLogger() != null )
        {
            this.getLogger().debug( "TEST" );
            this.getLogger().debug( new Exception() );
            this.getLogger().debug( "TEST", new Exception() );

            this.getLogger().error( "TEST" );
            this.getLogger().error( new Exception() );
            this.getLogger().error( "TEST", new Exception() );

            this.getLogger().fatal( "TEST" );
            this.getLogger().fatal( new Exception() );
            this.getLogger().fatal( "TEST", new Exception() );

            this.getLogger().info( "TEST" );
            this.getLogger().info( new Exception() );
            this.getLogger().info( "TEST", new Exception() );

            this.getLogger().trace( "TEST" );
            this.getLogger().trace( new Exception() );
            this.getLogger().trace( "TEST", new Exception() );

            this.getLogger().warn( "TEST" );
            this.getLogger().warn( new Exception() );
            this.getLogger().warn( "TEST", new Exception() );
        }
        else
        {
            fail( this.getTestImplementationNotFoundMessage( this.getLocale() ) );
        }
    }

    /**
     * Test runner entry point.
     * <p>This method sets up the JDK's {@code LogManager} with properties found at classpath location
     * {@code "/logging.properties"} and executes {@link JUnitCore#main} passing the given arguments with this classes
     * name prepended.</p>
     *
     * @param args Command line arguments.
     */
    public static void main( final String... args )
    {
        try
        {
            final URL loggingProperties = LoggerTest.class.getResource( "/logging.properties" );
            if ( loggingProperties != null )
            {
                final InputStream in = loggingProperties.openStream();
                LogManager.getLogManager().readConfiguration( in );
                in.close();
            }

            final List<String> l = new ArrayList<String>( Arrays.asList( args ) );
            l.add( 0, LoggerTest.class.getName() );
            JUnitCore.main( l.toArray( new String[ l.size() ] ) );
        }
        catch ( final IOException e )
        {
            e.printStackTrace();
            System.exit( 1 );
        }
    }

    // SECTION-END
    // SECTION-START[Dependencies]
    // <editor-fold defaultstate="collapsed" desc=" Generated Dependencies ">

    /**
     * Gets the {@code Locale} dependency.
     * <p>This method returns the "{@code default}" object of the {@code java.util.Locale} specification at specification level 1.1.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code Locale} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-19/jomc-tools" )
    private java.util.Locale getLocale()
    {
        final java.util.Locale _d = (java.util.Locale) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "Locale" );
        assert _d != null : "'Locale' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code Logger} dependency.
     * <p>This method returns any available object of the {@code org.jomc.logging.Logger} specification at specification level 1.0.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * <p><b>Properties</b><dl>
     * <dt>"{@code name}"</dt>
     * <dd>Property of type {@code java.lang.String}.
     * </dd>
     * </dl>
     * @return Implementation tests are performed with.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-19/jomc-tools" )
    private org.jomc.logging.Logger getLogger()
    {
        return (org.jomc.logging.Logger) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "Logger" );
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Properties]
    // SECTION-END
    // SECTION-START[Messages]
    // <editor-fold defaultstate="collapsed" desc=" Generated Messages ">

    /**
     * Gets the text of the {@code testImplementationNotFound} message.
     * <p><b>Templates</b><br/><table>
     * <tr><td valign="top">English:</td><td valign="top"><pre>No test implementation found.</pre></td></tr>
     * <tr><td valign="top">Deutsch:</td><td valign="top"><pre>Keine Test-Implementierung gefunden.</pre></td></tr>
     * </table></p>
     * @param locale The locale of the message to return.
     * @return The text of the {@code testImplementationNotFound} message.
     *
     * @throws org.jomc.ObjectManagementException if getting the message instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-19/jomc-tools" )
    private String getTestImplementationNotFoundMessage( final java.util.Locale locale )
    {
        final String _m = org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getMessage( this, "testImplementationNotFound", locale );
        assert _m != null : "'testImplementationNotFound' message not found.";
        return _m;
    }
    // </editor-fold>
    // SECTION-END
}
