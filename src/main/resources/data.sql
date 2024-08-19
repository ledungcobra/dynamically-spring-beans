CREATE TABLE bean (
    id INT PRIMARY KEY,
    bean_class VARCHAR(100),
    bean_name VARCHAR(100),
    property VARCHAR(100),
    prop_value VARCHAR(100)
);

INSERT INTO bean (id, bean_class, bean_name, property, prop_value) VALUES
(1, 'com.ledungcobra.app.NoSQLDataSource', 'noSQL1', 'prop', 'NoSQLDataSource'),
(2, 'com.ledungcobra.app.NoSQLDataSource', 'noSQL2', 'prop', 'NoSQLDataSource'),
(3, 'com.ledungcobra.app.SQLDataSource', 'sql1', 'prop', 'NoSQLDataSource'),
(4, 'com.ledungcobra.app.SQLDataSource', 'sql2', 'prop', 'NoSQLDataSource');