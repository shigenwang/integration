/*
 * This file is generated by jOOQ.
*/
package com.shigen.wang.jooq;


import com.shigen.wang.jooq.tables.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Integration extends SchemaImpl {

    private static final long serialVersionUID = -119521285;

    /**
     * The reference instance of <code>integration</code>
     */
    public static final Integration INTEGRATION = new Integration();

    /**
     * The table <code>integration.user</code>.
     */
    public final User USER = com.shigen.wang.jooq.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Integration() {
        super("integration", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            User.USER);
    }
}
