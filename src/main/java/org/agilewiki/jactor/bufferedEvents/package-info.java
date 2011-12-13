/*
 * Copyright 2011 Bill La Forge
 *
 * This file is part of AgileWiki and is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License (LGPL) as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 * or navigate to the following url http://www.gnu.org/licenses/lgpl-2.1.txt
 *
 * Note however that only Scala, Java and JavaScript files are being covered by LGPL.
 * All other files are covered by the Common Public License (CPL).
 * A copy of this license is also included and can be
 * found as well at http://www.opensource.org/licenses/cpl1.0.txt
 */

/**
 * <p>
 * The bufferedEvents package supports the dispatching of one-way messages (events)
 * but it buffers outgoing events and sends them only when there are no other incoming events
 * to process, which results in a significant improvement in throughput when under load.
 * </p>
 * <p>
 * A BufferedEventsDestination receives lists of events from objects operating
 * on a different thread.
 * </p>
 * <p>
 * An EventDispatcher processes events on another thread.
 * </p>
 * <p>
 * A BufferedEventsSource sends events.
 * </p>
 * <p>
 * A BufferedEventsQueue receives buffered events, queues them,
 * and then processes them on another thread.
 * </p>
 * <p>
 * JABufferedEventsQueue implements BufferedEventsQueue.
 * </p>
 * <p>
 * A JABufferedEventsActor is an actor which passes blocks of one-way message (events).
 * </p>
 * <p>
 * Used mostly for testing, JABufferedEventsFuture is used to send
 * events to a BufferedEventsDestination, like JABufferedEventsActor, and then wait
 * for a return event.
 * </p>
*/
package org.agilewiki.jactor.bufferedEvents;
