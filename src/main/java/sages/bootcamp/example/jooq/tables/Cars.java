/*
 * This file is generated by jOOQ.
*/
package sages.bootcamp.example.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import sages.bootcamp.example.jooq.Keys;
import sages.bootcamp.example.jooq.Public;
import sages.bootcamp.example.jooq.tables.records.CarsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Cars extends TableImpl<CarsRecord> {

    private static final long serialVersionUID = -1723771080;

    /**
     * The reference instance of <code>public.cars</code>
     */
    public static final Cars CARS = new Cars();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CarsRecord> getRecordType() {
        return CarsRecord.class;
    }

    /**
     * The column <code>public.cars.id</code>.
     */
    public final TableField<CarsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('cars_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.cars.model</code>.
     */
    public final TableField<CarsRecord, String> MODEL = createField("model", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.cars</code> table reference
     */
    public Cars() {
        this("cars", null);
    }

    /**
     * Create an aliased <code>public.cars</code> table reference
     */
    public Cars(String alias) {
        this(alias, CARS);
    }

    private Cars(String alias, Table<CarsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Cars(String alias, Table<CarsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CarsRecord, Long> getIdentity() {
        return Keys.IDENTITY_CARS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CarsRecord> getPrimaryKey() {
        return Keys.CARS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CarsRecord>> getKeys() {
        return Arrays.<UniqueKey<CarsRecord>>asList(Keys.CARS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cars as(String alias) {
        return new Cars(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Cars rename(String name) {
        return new Cars(name, null);
    }
}
