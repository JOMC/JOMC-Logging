// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Java Object Management and Configuration
 *   Copyright (C) Christian Schulte, 2005-206
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
 * <dl>
 *   <dt><b>Identifier:</b></dt><dd>org.jomc.logging.Logger</dd>
 *   <dt><b>Multiplicity:</b></dt><dd>One</dd>
 *   <dt><b>Scope:</b></dt><dd>None</dd>
 * </dl>
 *
 * @author <a href="mailto:cs@schulte.it">Christian Schulte</a> 1.0
 * @version 1.1
 * @see org.jomc.ObjectManager#getObject(java.lang.Class) getObject(Logger.class)
 * @see org.jomc.ObjectManager#getObject(java.lang.Class,java.lang.String) getObject(Logger.class, "<i>implementation name</i>")
 * @see org.jomc.ObjectManagerFactory
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.5", comments = "See http://www.jomc.org/jomc/1.5/jomc-tools-1.5" )
// </editor-fold>
// SECTION-END
public interface Logger
{
    // SECTION-START[Logger]

    /**
     * Gets a flag indicating logging configuration messages is enabled.
     *
     * @return {@code true}, if logging configuration messages is enabled; {@code false}, if logging configuration
     * messages is disabled.
     *
     * @since 1.3
     */
    boolean isConfigEnabled();

    /**
     * Logs a configuration message.
     *
     * @param message The message to log.
     *
     * @since 1.3
     */
    void config( String message );

    /**
     * Logs a configuration exception.
     *
     * @param t The exception to log.
     *
     * @since 1.3
     */
    void config( Throwable t );

    /**
     * Logs a configuration message and exception.
     *
     * @param message The message to log.
     * @param t The exception to log.
     *
     * @since 1.3
     */
    void config( String message, Throwable t );

    /**
     * Gets a flag indicating logging debug messages is enabled.
     *
     * @return {@code true}, if logging debug messages is enabled; {@code false}, if logging debug messages is disabled.
     */
    boolean isDebugEnabled();

    /**
     * Logs a debug message.
     *
     * @param message The message to log.
     */
    void debug( String message );

    /**
     * Logs a debug exception.
     *
     * @param t The exception to log.
     */
    void debug( Throwable t );

    /**
     * Logs a debug message and exception.
     *
     * @param message The message to log.
     * @param t The exception to log.
     */
    void debug( String message, Throwable t );

    /**
     * Gets a flag indicating logging error messages is enabled.
     *
     * @return {@code true}, if logging error messages is enabled; {@code false}, if logging error messages is disabled.
     */
    boolean isErrorEnabled();

    /**
     * Logs an error message.
     *
     * @param message The message to log.
     */
    void error( String message );

    /**
     * Logs an error exception.
     *
     * @param t The exception to log.
     */
    void error( Throwable t );

    /**
     * Logs an error message and exception.
     *
     * @param message The message to log.
     * @param t The exception to log.
     */
    void error( String message, Throwable t );

    /**
     * Gets a flag indicating logging fatal messages is enabled.
     *
     * @return {@code true}, if logging fatal messages is enabled; {@code false}, if logging fatal messages is disabled.
     */
    boolean isFatalEnabled();

    /**
     * Logs a fatal message.
     *
     * @param message The message to log.
     */
    void fatal( String message );

    /**
     * Logs a fatal exception.
     *
     * @param t The exception to log.
     */
    void fatal( Throwable t );

    /**
     * Logs a fatal message and exception.
     *
     * @param message The message to log.
     * @param t The exception to log.
     */
    void fatal( String message, Throwable t );

    /**
     * Gets a flag indicating logging info messages is enabled.
     *
     * @return {@code true}, if logging info messages is enabled; {@code false}, if logging info messages is disabled.
     */
    boolean isInfoEnabled();

    /**
     * Logs an info message.
     *
     * @param message The message to log.
     */
    void info( String message );

    /**
     * Logs an info exception.
     *
     * @param t The exception to log.
     */
    void info( Throwable t );

    /**
     * Logs an info message and exception.
     *
     * @param message The message to log.
     * @param t The exception to log.
     */
    void info( String message, Throwable t );

    /**
     * Gets a flag indicating logging trace messages is enabled.
     *
     * @return {@code true}, if logging trace messages is enabled; {@code false}, if logging trace messages is disabled.
     */
    boolean isTraceEnabled();

    /**
     * Logs a trace message.
     *
     * @param message The message to log.
     */
    void trace( String message );

    /**
     * Logs a trace exception.
     *
     * @param t The exception to log.
     */
    void trace( Throwable t );

    /**
     * Logs a trace message and exception.
     *
     * @param message The message to log.
     * @param t The exception to log.
     */
    void trace( String message, Throwable t );

    /**
     * Gets a flag indicating logging warning messages is enabled.
     *
     * @return {@code true}, if logging warning messages is enabled; {@code false}, if logging warning messages is
     * disabled.
     */
    boolean isWarnEnabled();

    /**
     * Logs a warning message.
     *
     * @param message The message to log.
     */
    void warn( String message );

    /**
     * Logs a warning exception.
     *
     * @param t The exception to log.
     */
    void warn( Throwable t );

    /**
     * Logs a warning message and exception.
     *
     * @param message The message to log.
     * @param t The exception to log.
     */
    void warn( String message, Throwable t );

    // SECTION-END
}
