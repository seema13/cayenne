/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/
package org.apache.cayenne.ejbql;

import org.apache.cayenne.exp.ExpressionException;

/**
 * An exception thrown on errors during parsing EJBQL statements.
 * 
 * @since 3.0
 */
public class EJBQLException extends ExpressionException {

    public EJBQLException() {
        super();
    }

    public EJBQLException(String messageFormat, Object... messageArgs) {
        super(messageFormat, messageArgs);
    }

    public EJBQLException(String messageFormat, String expressionString, Throwable th,
            Object... messageArgs) {
        super(messageFormat, expressionString, th, messageArgs);
    }

    public EJBQLException(String messageFormat, Throwable cause, Object... messageArgs) {
        super(messageFormat, cause, messageArgs);
    }

    public EJBQLException(Throwable cause) {
        super(cause);
    }

}
