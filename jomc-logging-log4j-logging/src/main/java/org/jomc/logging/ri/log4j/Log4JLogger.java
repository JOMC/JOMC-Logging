// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Copyright (c) 2009 The JOMC Project
 *   Copyright (c) 2005 Christian Schulte <cs@jomc.org>
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
package org.jomc.logging.ri.log4j;

import org.jomc.logging.Logger;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Log4J logging system implementation.
 * <p><b>Specifications</b><ul>
 * <li>{@code org.jomc.logging.Logger} {@code 1.0} {@code Multiton}</li>
 * </ul></p>
 * <p><b>Properties</b><ul>
 * <li>"{@link #getName name}"
 * <blockquote>Property of type {@code java.lang.String}.
 * <p>Name of the component events are logged for.</p>
 * </blockquote></li>
 * </ul></p>
 *
 * @author <a href="mailto:cs@jomc.org">Christian Schulte</a> 1.0
 * @version $Id$
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                             comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-10/jomc-tools" )
// </editor-fold>
// SECTION-END
public class Log4JLogger implements Logger
{
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code Log4JLogger} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-10/jomc-tools" )
    public Log4JLogger()
    {
        // SECTION-START[Default Constructor]
        super();
        // SECTION-END
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Dependencies]
    // SECTION-END
    // SECTION-START[Properties]
    // <editor-fold defaultstate="collapsed" desc=" Generated Properties ">

    /**
     * Gets the value of the {@code name} property.
     * @return Name of the component events are logged for.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-10/jomc-tools" )
    public java.lang.String getName()
    {
        final java.lang.String _p = (java.lang.String) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "name" );
        assert _p != null : "'name' property not found.";
        return _p;
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Log4JLogger]

    public boolean isDebugEnabled()
    {
        return this.getLogger().isEnabledFor( org.apache.log4j.Level.DEBUG );
    }

    public void debug( final String string )
    {
        this.getLogger().debug( string );
    }

    public void debug( final Throwable throwable )
    {
        this.getLogger().debug( throwable.getMessage(), throwable );
    }

    public void debug( final String message, final Throwable throwable )
    {
        this.getLogger().debug( message, throwable );
    }

    public boolean isErrorEnabled()
    {
        return this.getLogger().isEnabledFor( org.apache.log4j.Level.ERROR );
    }

    public void error( final String string )
    {
        this.getLogger().error( string );
    }

    public void error( final Throwable throwable )
    {
        this.getLogger().error( throwable.getMessage(), throwable );
    }

    public void error( final String message, final Throwable throwable )
    {
        this.getLogger().error( message, throwable );
    }

    public boolean isFatalEnabled()
    {
        return this.getLogger().isEnabledFor( org.apache.log4j.Level.FATAL );
    }

    public void fatal( final String string )
    {
        this.getLogger().fatal( string );
    }

    public void fatal( final Throwable throwable )
    {
        this.getLogger().fatal( throwable.getMessage(), throwable );
    }

    public void fatal( final String message, final Throwable throwable )
    {
        this.getLogger().fatal( message, throwable );
    }

    public boolean isInfoEnabled()
    {
        return this.getLogger().isEnabledFor( org.apache.log4j.Level.INFO );
    }

    public void info( final String string )
    {
        this.getLogger().info( string );
    }

    public void info( final Throwable throwable )
    {
        this.getLogger().info( throwable.getMessage(), throwable );
    }

    public void info( final String message, final Throwable throwable )
    {
        this.getLogger().info( message, throwable );
    }

    public boolean isTraceEnabled()
    {
        return this.getLogger().isEnabledFor( org.apache.log4j.Level.TRACE );
    }

    public void trace( final String string )
    {
        this.getLogger().trace( string );
    }

    public void trace( final Throwable throwable )
    {
        this.getLogger().trace( throwable.getMessage(), throwable );
    }

    public void trace( final String message, final Throwable throwable )
    {
        this.getLogger().trace( message, throwable );
    }

    public boolean isWarnEnabled()
    {
        return this.getLogger().isEnabledFor( org.apache.log4j.Level.WARN );
    }

    public void warn( final String string )
    {
        this.getLogger().warn( string );
    }

    public void warn( final Throwable throwable )
    {
        this.getLogger().warn( throwable.getMessage(), throwable );
    }

    public void warn( final String message, final Throwable throwable )
    {
        this.getLogger().warn( message, throwable );
    }

    /**
     * Requests a Log4J logger for the name given by property {@code name}.
     *
     * @return The Log4J logger for the name given by property {@code name}.
     */
    public org.apache.log4j.Logger getLogger()
    {
        return org.apache.log4j.Logger.getLogger( this.getName() );
    }

    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}
