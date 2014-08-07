/*-------------------------------------------------------------------------
*
* Copyright (c) 2004-2011, PostgreSQL Global Development Group
*
*
*-------------------------------------------------------------------------
*/
package com.foundationdb.sql.jdbc.core;

import java.io.IOException;

public class PGBindException extends IOException {

    private IOException _ioe;

    public PGBindException(IOException ioe) {
        _ioe = ioe;
    }

    public IOException getIOException() {
        return _ioe;
    }
}
