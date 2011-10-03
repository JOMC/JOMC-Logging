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
package org.jomc.logging;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Logs events for a specific component.
 *
 * <p>
 *   This specification is identified by identifier {@code <org.jomc.logging.Logger>}.
 *   An application assembler may provide either no or one implementation of this specification due to
 *   multiplicity {@code <One>}.
 *   This specification does not apply to any scope. A new object is returned whenever requested.
 * </p>
 *
 * <p>
 *   Use of class {@code ObjectManager} is supported for accessing implementations.
 *   <blockquote><pre>
 * Logger object = ObjectManagerFactory.getObjectManager( getClass().getClassLoader() ).getObject( Logger.class );
 * Logger object = ObjectManagerFactory.getObjectManager( getClass().getClassLoader() ).getObject( Logger.class, "<i>implementation name</i>" );
 *   </pre></blockquote>
 * </p>
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.0
 * @version 1.0
 * @see org.jomc.ObjectManagerFactory
 * @see org.jomc.ObjectManager
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
// </editor-fold>
// SECTION-END
public interface Logger
{
    // SECTION-START[Logger]

    /**
     * Getter for property {@code debugEnabled}.
     *
     * @return {@code true} if logging debug messages is enabled; {@code false} if logging debug messages is disabled.
     */
    boolean isDebugEnabled();

    /**
     * Logs a message at log level {@code debug}.
     *
     * @param message The message to log.
     */
    void debug( String message );

    /**
     * Logs an exception at log level {@code debug}.
     *
     * @param t The exception to log.
     */
    void debug( Throwable t );

    /**
     * Logs a message and an exception at log level {@code debug}.
     *
     * @param message The message to log.
     * @param t The exception to log.
     */
    void debug( String message, Throwable t );

    /**
     * Getter for property {@code errorEnabled}.
     *
     * @return {@code true} if logging error messages is enabled; {@code false} if logging error messages is disabled.
     */
    boolean isErrorEnabled();

    /**
     * Logs a message at log level {@code error}.
     *
     * @param message The message to log.
     */
    void error( String message );

    /**
     * Logs an exception at log level {@code error}.
     *
     * @param t The exception to log.
     */
    void error( Throwable t );

    /**
     * Logs a message and an exception at log level {@code error}.
     *
     * @param message The message to log.
     * @param t The exception to log.
     */
    void error( String message, Throwable t );

    /**
     * Getter for property {@code fatalEnabled}.
     *
     * @return {@code true} if logging fatal messages is enabled; {@code false} if logging fatal messages is disabled.
     */
    boolean isFatalEnabled();

    /**
     * Logs a message at log level {@code fatal}.
     *
     * @param message The message to log.
     */
    void fatal( String message );

    /**
     * Logs an exception at log level {@code fatal}.
     *
     * @param t The exception to log.
     */
    void fatal( Throwable t );

    /**
     * Logs a message and an exception at log level {@code fatal}.
     *
     * @param message The message to log.
     * @param t The exception to log.
     */
    void fatal( String message, Throwable t );

    /**
     * Getter for property {@code infoEnabled}.
     *
     * @return {@code true} if logging info messages is enabled; {@code false} if logging info messages is disabled.
     */
    boolean isInfoEnabled();

    /**
     * Logs a message at log level {@code info}.
     *
     * @param message The message to log.
     */
    void info( String message );

    /**
     * Logs an exception at log level {@code info}.
     *
     * @param t The exception to log.
     */
    void info( Throwable t );

    /**
     * Logs a message and an exception at log level {@code info}.
     *
     * @param message The message to log.
     * @param t The exception to log.
     */
    void info( String message, Throwable t );

    /**
     * Getter for property {@code traceEnabled}.
     *
     * @return {@code true} if logging trace messages is enabled; {@code false} if logging trace messages is disabled.
     */
    boolean isTraceEnabled();

    /**
     * Logs a message at log level {@code trace}.
     *
     * @param message The message to log.
     */
    void trace( String message );

    /**
     * Logs an exception at log level {@code trace}.
     *
     * @param t The exception to log.
     */
    void trace( Throwable t );

    /**
     * Logs a message and an exception at log level {@code trace}.
     *
     * @param message The message to log.
     * @param t The exception to log.
     */
    void trace( String message, Throwable t );

    /**
     * Getter for property {@code warnEnabled}.
     *
     * @return {@code true} if logging warning messages is enabled; {@code false} if logging warning messages is
     * disabled.
     */
    boolean isWarnEnabled();

    /**
     * Logs a message at log level {@code warn}.
     *
     * @param message The message to log.
     */
    void warn( String message );

    /**
     * Logs an exception at log level {@code warn}.
     *
     * @param t The exception to log.
     */
    void warn( Throwable t );

    /**
     * Logs a message and an exception at log level {@code warn}.
     *
     * @param message The message to log.
     * @param t The exception to log.
     */
    void warn( String message, Throwable t );

    // SECTION-END
}
