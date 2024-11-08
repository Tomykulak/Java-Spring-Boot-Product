CREATE TABLE 't_orders'(
    'id'            bigint(20) NOT NULL AUTO_INCREMENT,
    'order_number'  varchar(255) DEFAULT NOT NULL,
    'sku_code'      varchar(255),
    'price'         double(19, 2),
    'quantity'      int(11),
    PRIMARY KEY ('id')
);