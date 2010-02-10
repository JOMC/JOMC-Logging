// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Copyright (c) 2010 The JOMC Project
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
package org.jomc.logging.ri.commons;

import java.util.logging.Level;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Commons logging system implementation.
 * <p><b>Specifications</b><ul>
 * <li>{@code org.jomc.logging.Logger} {@code 1.0} {@code Multiton}</li>
 * <li>{@code org.jomc.spi.Listener} {@code 1.0} {@code Multiton}</li>
 * </ul></p>
 * <p><b>Properties</b><ul>
 * <li>"{@link #getName name}"
 * <blockquote>Property of type {@code java.lang.String}.
 * <p>Name of the component events are logged for.</p>
 * </blockquote></li>
 * </ul></p>
 * <p><b>Dependencies</b><ul>
 * <li>"{@link #getObjectManagementLogger ObjectManagementLogger}"<blockquote>
 * Dependency on {@code org.jomc.logging.Logger} at specification level 1.0 bound to an instance.</blockquote></li>
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
                             comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-17-SNAPSHOT/jomc-tools" )
// </editor-fold>
// SECTION-END
public class CommonsLogger
    implements
    org.jomc.logging.Logger,
    org.jomc.spi.Listener
{
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code CommonsLogger} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-17-SNAPSHOT/jomc-tools" )
    public CommonsLogger()
    {
        // SECTION-START[Default Constructor]
        super();
        // SECTION-END
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Logger]

    public boolean isDebugEnabled()
    {
        return this.getLogger().isDebugEnabled();
    }

    public void debug( final String message )
    {
        this.getLogger().debug( message );
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
        return this.getLogger().isErrorEnabled();
    }

    public void error( final String message )
    {
        this.getLogger().error( message );
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
        return this.getLogger().isFatalEnabled();
    }

    public void fatal( final String message )
    {
        this.getLogger().fatal( message );
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
        return this.getLogger().isInfoEnabled();
    }

    public void info( final String message )
    {
        this.getLogger().info( message );
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
        return this.getLogger().isTraceEnabled();
    }

    public void trace( final String message )
    {
        this.getLogger().trace( message );
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
        return this.getLogger().isWarnEnabled();
    }

    public void warn( final String message )
    {
        this.getLogger().warn( message );
    }

    public void warn( final Throwable throwable )
    {
        this.getLogger().warn( throwable.getMessage(), throwable );
    }

    public void warn( final String message, final Throwable throwable )
    {
        this.getLogger().warn( message, throwable );
    }

    // SECTION-END
    // SECTION-START[Listener]
    public void onLog( final Level level, final String message, final Throwable throwable )
    {
        if ( level != null )
        {
            if ( level.equals( Level.CONFIG ) || level.equals( Level.FINE ) )
            {
                this.getObjectManagementLogger().debug( message, throwable );
            }
            else if ( level.equals( Level.FINER ) || level.equals( Level.FINEST ) )
            {
                this.getObjectManagementLogger().trace( message, throwable );
            }
            else if ( level.equals( Level.INFO ) )
            {
                this.getObjectManagementLogger().info( message, throwable );
            }
            else if ( level.equals( Level.SEVERE ) )
            {
                this.getObjectManagementLogger().error( message, throwable );
            }
            else if ( level.equals( Level.WARNING ) )
            {
                this.getObjectManagementLogger().warn( message, throwable );
            }
            else
            {
                this.getObjectManagementLogger().trace( message, throwable );
            }
        }
    }

    // SECTION-END
    // SECTION-START[CommonsLogger]
    /**
     * Requests a commons logging logger for the name given by property
     * {@code name}.
     *
     * @return the commons logging logger for the name given by property
     * {@code name}.
     */
    public Log getLogger()
    {
        return LogFactory.getLog( this.getName() );
    }

    // SECTION-END
    // SECTION-START[Dependencies]
    // <editor-fold defaultstate="collapsed" desc=" Generated Dependencies ">

    /**
     * Gets the {@code ObjectManagementLogger} dependency.
     * <p>This method returns the "{@code JOMC Logging Commons Logging}" object of the {@code org.jomc.logging.Logger} specification at specification level 1.0.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * <p><b>Properties</b><dl>
     * <dt>"{@code name}"</dt>
     * <dd>Property of type {@code java.lang.String}.
     * </dd>
     * </dl>
     * @return The {@code ObjectManagementLogger} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-17-SNAPSHOT/jomc-tools" )
    private org.jomc.logging.Logger getObjectManagementLogger()
    {
        final org.jomc.logging.Logger _d = (org.jomc.logging.Logger) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "ObjectManagementLogger" );
        assert _d != null : "'ObjectManagementLogger' dependency not found.";
        return _d;
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Properties]
    // <editor-fold defaultstate="collapsed" desc=" Generated Properties ">

    /**
     * Gets the value of the {@code name} property.
     * @return Name of the component events are logged for.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-17-SNAPSHOT/jomc-tools" )
    public java.lang.String getName()
    {
        final java.lang.String _p = (java.lang.String) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "name" );
        assert _p != null : "'name' property not found.";
        return _p;
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}
