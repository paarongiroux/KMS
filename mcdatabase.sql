DROP SCHEMA IF EXISTS mcdatabase;
CREATE SCHEMA IF NOT EXISTS mcdatabase;
USE mcdatabase;

CREATE TABLE ingredients (
	item_name VARCHAR(45) NOT NULL,
    price DOUBLE NOT NULL,
    units VARCHAR(45) NOT NULL,
    num_units DOUBLE NOT NULL,
    usage_delta DOUBLE NOT NULL,
    date_since_delta DATE,
    last_update DATE,
    date_created DATE,
    PRIMARY KEY(item_name)
);
    
CREATE TABLE daily_usage (
	item_name VARCHAR(45) NOT NULL,
    daily_units_used DOUBLE NOT NULL,
    today_date DATE
);

CREATE TABLE weekly_usage (
	item_name VARCHAR(45) NOT NULL,
    weekly_units_used DOUBLE NOT NULL
);

CREATE TABLE monthly_usage (
	item_name VARCHAR(45) NOT NULL,
    monthly_units_used DOUBLE NOT NULL
);
    
INSERT INTO ingredients (item_name, price, units, num_units, usage_delta) VALUES ('carrots', 2.50, 'lb', 32, 69.0);
INSERT INTO daily_usage (item_name, daily_units_used) VALUES ('carrots', 40);
INSERT INTO weekly_usage (item_name, weekly_units_used) VALUES ('carrots', 420);


SELECT *
FROM ingredients
	INNER JOIN
    daily_usage ON daily_usage.item_name = ingredients.item_name
    INNER JOIN 
    weekly_usage ON weekly_usage.item_name = ingredients.item_name
;