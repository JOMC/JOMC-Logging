// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 * Java Object Management and Configuration
 * Copyright (C) Christian Schulte <cs@schulte.it>, 2005-206
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   o Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   o Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in
 *     the documentation and/or other materials provided with the
 *     distribution.
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 * AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * $JOMC$
 *
 */
// </editor-fold>
// SECTION-END
package org.jomc.logging.ri.slf4j;

import java.util.logging.Level;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Object management and configuration logging system implementation backed by Slf4J.
 *
 * <dl>
 *   <dt><b>Identifier:</b></dt><dd>org.jomc.logging.ri.slf4j.Slf4JLogger</dd>
 *   <dt><b>Name:</b></dt><dd>JOMC Logging ⁑ Slf4J Logging</dd>
 *   <dt><b>Specifications:</b></dt>
 *     <dd>org.jomc.logging.Logger @ 1.1</dd>
 *     <dd>org.jomc.spi.Listener @ 1.0</dd>
 *   <dt><b>Abstract:</b></dt><dd>No</dd>
 *   <dt><b>Final:</b></dt><dd>No</dd>
 *   <dt><b>Stateless:</b></dt><dd>Yes</dd>
 * </dl>
 *
 * @author <a href="mailto:cs@schulte.it">Christian Schulte</a> 1.0
 * @version 1.4-SNAPSHOT
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.9", comments = "See http://www.jomc.org/jomc/1.9/jomc-tools-1.9" )
// </editor-fold>
// SECTION-END
public final class Slf4JLogger
    implements org.jomc.logging.Logger,
               org.jomc.spi.Listener
{
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">
    /** Creates a new {@code Slf4JLogger} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.9", comments = "See http://www.jomc.org/jomc/1.9/jomc-tools-1.9" )
    public Slf4JLogger()
    {
        // SECTION-START[Default Constructor]
        super();
        // SECTION-END
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Logger]

    public boolean isConfigEnabled()
    {
        return this.getLogger().isDebugEnabled();
    }

    public void config( final String message )
    {
        this.getLogger().debug( message );
    }

    public void config( final Throwable throwable )
    {
        this.getLogger().debug( throwable.getMessage(), throwable );
    }

    public void config( final String message, final Throwable throwable )
    {
        this.getLogger().debug( message, throwable );
    }

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
        return this.getLogger().isErrorEnabled();
    }

    public void fatal( final String message )
    {
        this.getLogger().error( message );
    }

    public void fatal( final Throwable throwable )
    {
        this.getLogger().error( throwable.getMessage(), throwable );
    }

    public void fatal( final String message, final Throwable throwable )
    {
        this.getLogger().error( message, throwable );
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
            if ( level.intValue() <= Level.FINEST.intValue() )
            {
                this.getObjectManagementLogger().trace( message, throwable );
            }
            else if ( level.intValue() <= Level.FINER.intValue() )
            {
                this.getObjectManagementLogger().debug( message, throwable );
            }
            else if ( level.intValue() <= Level.FINE.intValue() )
            {
                this.getObjectManagementLogger().debug( message, throwable );
            }
            else if ( level.intValue() <= Level.CONFIG.intValue() )
            {
                this.getObjectManagementLogger().config( message, throwable );
            }
            else if ( level.intValue() <= Level.INFO.intValue() )
            {
                this.getObjectManagementLogger().info( message, throwable );
            }
            else if ( level.intValue() <= Level.WARNING.intValue() )
            {
                this.getObjectManagementLogger().warn( message, throwable );
            }
            else if ( level.intValue() <= Level.SEVERE.intValue() )
            {
                this.getObjectManagementLogger().error( message, throwable );
            }
            else if ( level.intValue() < Level.OFF.intValue() )
            {
                this.getObjectManagementLogger().fatal( message, throwable );
            }
        }
    }
    // SECTION-END
    // SECTION-START[Slf4JLogger]

    /**
     * Gets the Slf4J logger backing the instance.
     *
     * @return The Slf4J logger backing the instance.
     *
     * @see #getName()
     * @see org.slf4j.LoggerFactory#getLogger(java.lang.String)
     */
    public org.slf4j.Logger getLogger()
    {
        return org.slf4j.LoggerFactory.getLogger( this.getName() );
    }

    // SECTION-END
    // SECTION-START[Dependencies]
    // <editor-fold defaultstate="collapsed" desc=" Generated Dependencies ">
    /**
     * Gets the {@code <ObjectManagementLogger>} dependency.
     * <p>
     *   This method returns the {@code <JOMC Logging ⁑ Slf4J Logging>} object of the {@code <org.jomc.logging.Logger>} specification at specification level 1.1.
     *   That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.
     * </p>
     * <p><strong>Properties:</strong>
     *   <table border="1" width="100%" cellpadding="3" cellspacing="0">
     *     <tr class="TableSubHeadingColor">
     *       <th align="left" scope="col" nowrap><b>Name</b></th>
     *       <th align="left" scope="col" nowrap><b>Type</b></th>
     *       <th align="left" scope="col" nowrap><b>Documentation</b></th>
     *     </tr>
     *     <tr class="TableRow">
     *       <td align="left" valign="top" nowrap>{@code <name>}</td>
     *       <td align="left" valign="top" nowrap>{@code java.lang.String}</td>
     *       <td align="left" valign="top">Name of the logger object management events are logged with.</td>
     *     </tr>
     *   </table>
     * </p>
     * <dl>
     *   <dt><b>Final:</b></dt><dd>No</dd>
     * </dl>
     * @return Logger object management events are logged with.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @SuppressWarnings({"unchecked", "unused", "PMD.UnnecessaryFullyQualifiedName"})
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.9", comments = "See http://www.jomc.org/jomc/1.9/jomc-tools-1.9" )
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
     * Gets the value of the {@code <name>} property.
     * <p><dl>
     *   <dt><b>Final:</b></dt><dd>No</dd>
     * </dl></p>
     * @return Name of the component events are logged for.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @SuppressWarnings({"unchecked", "unused", "PMD.UnnecessaryFullyQualifiedName"})
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.9", comments = "See http://www.jomc.org/jomc/1.9/jomc-tools-1.9" )
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
