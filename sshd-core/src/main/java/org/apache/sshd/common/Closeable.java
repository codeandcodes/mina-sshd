/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sshd.common;

import org.apache.sshd.common.future.CloseFuture;

/**
 * A {@code Closeable} is a resource that can be closed.
 * The close method is invoked to release resources that the object is
 * holding.
 *
 * @author <a href="mailto:dev@mina.apache.org">Apache MINA SSHD Project</a>
 */
public interface Closeable {

    /**
     * Close this resource asynchronously and return a future.
     * Resources support two closing modes: a graceful mode
     * which will cleanly close the resource and an immediate mode
     * which will close the resources abruptly.
     *
     * @param immediately <code>true</code> if the resource should be shut down abruptly,
     *                    <code>false</code> for a graceful close
     * @return a future
     */
    CloseFuture close(boolean immediately);

    /**
     * Returns <code>true<</code> if this object has been closed.
     */
    boolean isClosed();

    /**
     * Returns <code>true</code> if the {@link #close(boolean)} method
     * has been called.
     * Note that this method will return <code>true</code> even if
     * this {@link #isClosed()} returns <code>true</code>.
     */
    boolean isClosing();

}
