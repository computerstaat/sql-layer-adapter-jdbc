/*-------------------------------------------------------------------------
*
* Copyright (c) 2004-2011, PostgreSQL Global Development Group
*
*
*-------------------------------------------------------------------------
*/
package com.foundationdb.sql.jdbc.ds.jdbc4;

import java.sql.Connection;
import java.sql.SQLFeatureNotSupportedException;

import javax.sql.StatementEventListener;

import com.foundationdb.sql.jdbc.ds.jdbc23.AbstractJdbc23PooledConnection;

public abstract class AbstractJdbc4PooledConnection extends AbstractJdbc23PooledConnection
{

    public AbstractJdbc4PooledConnection(Connection con, boolean autoCommit, boolean isXA)
    {
        super(con, autoCommit, isXA);
    }

    public void removeStatementEventListener(StatementEventListener listener)
    {
    }

    public void addStatementEventListener(StatementEventListener listener)
    {
    }

    public java.util.logging.Logger getParentLogger() throws SQLFeatureNotSupportedException
    {
        throw com.foundationdb.sql.jdbc.Driver.notImplemented(this.getClass(), "getParentLogger()");
    }

}
