/*-------------------------------------------------------------------------
*
* Copyright (c) 2004-2011, PostgreSQL Global Development Group
*
*
*-------------------------------------------------------------------------
*/
package com.foundationdb.sql.jdbc.jdbc4;


public class Jdbc4DatabaseMetaData extends AbstractJdbc4DatabaseMetaData implements java.sql.DatabaseMetaData
{

    public Jdbc4DatabaseMetaData(Jdbc4Connection conn)
    {
        super(conn);
    }

}
