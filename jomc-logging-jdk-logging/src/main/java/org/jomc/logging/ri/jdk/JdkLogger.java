// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Copyright (C) Christian Schulte, 2005-07-25
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
 *   THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 *   INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 *   AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 *   THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *   INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *   NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *   DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *   THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *   (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *   THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *   $JOMC$
 *
 */
// </editor-fold>
// SECTION-END
package org.jomc.logging.ri.jdk;

import java.util.logging.Level;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Object management and configuration logging system implementation backed by JDK Logging.
 *
 * <p>
 *   This implementation is identified by identifier {@code <org.jomc.logging.ri.jdk.JdkLogger>}.
 *   It provides objects named {@code <JOMC Logging JDK Logging>} of the following specifications:
 *
 *   <ul>
 *     <li>{@code <org.jomc.logging.Logger>} at specification level 1.0.</li>
 *     <li>{@code <org.jomc.spi.Listener>} at specification level 1.0.</li>
 *   </ul>
 *
 *   No state is retained across operations due to flag {@code <stateless>}.
 * </p>
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.0
 * @version 1.1-SNAPSHOT
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
// </editor-fold>
// SECTION-END
public final class JdkLogger
    implements
    org.jomc.logging.Logger,
    org.jomc.spi.Listener
{
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code JdkLogger} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    public JdkLogger()
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
        return this.getLogger().isLoggable( Level.FINE );
    }

    public void debug( final String message )
    {
        this.log( Level.FINE, message, null );
    }

    public void debug( final Throwable throwable )
    {
        this.log( Level.FINE, throwable.getMessage(), throwable );
    }

    public void debug( final String message, final Throwable throwable )
    {
        this.log( Level.FINE, message, throwable );
    }

    public boolean isErrorEnabled()
    {
        return this.getLogger().isLoggable( Level.SEVERE );
    }

    public void error( final String message )
    {
        this.log( Level.SEVERE, message, null );
    }

    public void error( final Throwable throwable )
    {
        this.log( Level.SEVERE, throwable.getMessage(), throwable );
    }

    public void error( final String message, final Throwable throwable )
    {
        this.log( Level.SEVERE, message, throwable );
    }

    public boolean isFatalEnabled()
    {
        return this.getLogger().isLoggable( Level.SEVERE );
    }

    public void fatal( final String message )
    {
        this.log( Level.SEVERE, message, null );
    }

    public void fatal( final Throwable throwable )
    {
        this.log( Level.SEVERE, throwable.getMessage(), throwable );
    }

    public void fatal( final String message, final Throwable throwable )
    {
        this.log( Level.SEVERE, message, throwable );
    }

    public boolean isInfoEnabled()
    {
        return this.getLogger().isLoggable( Level.INFO );
    }

    public void info( final String message )
    {
        this.log( Level.INFO, message, null );
    }

    public void info( final Throwable throwable )
    {
        this.log( Level.INFO, throwable.getMessage(), throwable );
    }

    public void info( final String message, final Throwable throwable )
    {
        this.log( Level.INFO, message, throwable );
    }

    public boolean isTraceEnabled()
    {
        return this.getLogger().isLoggable( Level.FINEST );
    }

    public void trace( final String message )
    {
        this.log( Level.FINEST, message, null );
    }

    public void trace( final Throwable throwable )
    {
        this.log( Level.FINEST, throwable.getMessage(), throwable );
    }

    public void trace( final String message, final Throwable throwable )
    {
        this.log( Level.FINEST, message, throwable );
    }

    public boolean isWarnEnabled()
    {
        return this.getLogger().isLoggable( Level.WARNING );
    }

    public void warn( final String message )
    {
        this.log( Level.WARNING, message, null );
    }

    public void warn( final Throwable throwable )
    {
        this.log( Level.WARNING, throwable.getMessage(), throwable );
    }

    public void warn( final String message, final Throwable throwable )
    {
        this.log( Level.WARNING, message, throwable );
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
    // SECTION-START[JdkLogger]
    /**
     * Requests the JDK logger for the name given by property {@code name}.
     *
     * @return the JDK logger for the name given by property {@code name}.
     */
    public java.util.logging.Logger getLogger()
    {
        return java.util.logging.Logger.getLogger( this.getName() );
    }

    private void log( final Level level, final String msg, final Throwable t )
    {
        if ( this.getLogger().isLoggable( level ) )
        {
            StackTraceElement caller;
            final Throwable x = new Throwable();
            final StackTraceElement[] elements = x.getStackTrace();

            String cname = "unknown";
            String method = "unknown";

            if ( elements != null && elements.length >= this.getStackDepth() )
            {
                caller = elements[this.getStackDepth()];
                cname = caller.getClassName();
                method = caller.getMethodName();
            }

            if ( t == null )
            {
                this.getLogger().logp( level, cname, method, msg );
            }
            else
            {
                this.getLogger().logp( level, cname, method, msg, t );
            }
        }
    }

    // SECTION-END
    // SECTION-START[Dependencies]
    // <editor-fold defaultstate="collapsed" desc=" Generated Dependencies ">

    /**
     * Gets the {@code <ObjectManagementLogger>} dependency.
     * <p>
     *   This method returns the {@code <JOMC Logging JDK Logging>} object of the {@code <org.jomc.logging.Logger>} specification at specification level 1.0.
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
     *     <tr class="TableRow">
     *       <td align="left" valign="top" nowrap>{@code <stackDepth>}</td>
     *       <td align="left" valign="top" nowrap>{@code int}</td>
     *       <td align="left" valign="top"></td>
     *     </tr>
     *   </table>
     * </p>
     * @return Logger object management events are logged with.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
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
     * @return Name of the component events are logged for.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    public java.lang.String getName()
    {
        final java.lang.String _p = (java.lang.String) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "name" );
        assert _p != null : "'name' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code <stackDepth>} property.
     * @return Number of frames between the logger and the frame of the caller.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private int getStackDepth()
    {
        final java.lang.Integer _p = (java.lang.Integer) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "stackDepth" );
        assert _p != null : "'stackDepth' property not found.";
        return _p.intValue();
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}
