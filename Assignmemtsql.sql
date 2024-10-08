CREATE TABLE tblcustomers (
    customerid SERIAL PRIMARY KEY,
    companyname VARCHAR(40) NOT NULL,
    contactname VARCHAR(30),
    contacttitle VARCHAR(30),
    address VARCHAR(60),
    city VARCHAR(15),
    region VARCHAR(15),
    postalcode VARCHAR(10),
    country VARCHAR(15) DEFAULT 'india',
    phone VARCHAR(24)
);
CREATE TABLE tblshippers (
    shipperid SERIAL PRIMARY KEY,
    companyname VARCHAR(40) NOT NULL UNIQUE
);
CREATE TABLE tblproducts (
    productid SERIAL PRIMARY KEY,
    productname VARCHAR(40) NOT NULL,
    supplierid INTEGER,
    categoryid INTEGER,
    quantityperunit VARCHAR(20),
    unitprice NUMERIC(10,2)
);
CREATE TABLE tblorders (
    orderid SERIAL PRIMARY KEY,
    customerid INTEGER,
    employeeid INTEGER,
    orderdate DATE,
    requireddate DATE,
    shippeddate DATE,
    shipvia INTEGER,
    freight NUMERIC(10,2),
    shipname VARCHAR(40),
    shipaddress VARCHAR(60),
    FOREIGN KEY (customerid) REFERENCES tblcustomers(customerid),
    FOREIGN KEY (shipvia) REFERENCES tblshippers(shipperid),
    CONSTRAINT chk_shippeddate CHECK (shippeddate > orderdate)
);
CREATE TABLE tblorderdetails (
    orderid INTEGER,
    productid INTEGER,
    unitprice NUMERIC(10,2) NOT NULL,
    quantity SMALLINT NOT NULL,
    discount REAL NOT NULL,
    PRIMARY KEY (orderid, productid),
    FOREIGN KEY (orderid) REFERENCES tblorders(orderid),
    FOREIGN KEY (productid) REFERENCES tblproducts(productid),
    CONSTRAINT chk_quantity CHECK (quantity > 0)
);
INSERT INTO tblcustomers (companyname, contactname, contacttitle, address, city, region, postalcode, country, phone)
VALUES 
('Bhats Enterprises', 'Jhannesh Bhat', 'Owner', '15 MG Road', 'Bangalore', 'Karnataka', '560022', 'India', '011-43215678'),
('Shettys Foods Pvt Ltd', 'Deepak shetty', 'Sales Manager', 'Ujire main road', 'Ujire', 'Karnataka', '574240', 'India', '040-66886789'),
('Sampoorna Textiles', 'Praveen kumsr', 'Managing Director', 'Collage road', 'Dharmathala', 'Karnataka', '574241', 'India', '022-22356789');
INSERT INTO tblshippers (companyname)
VALUES 
('Bharat Express'),
('Professional Couriers'),
('DHL Logistics');
INSERT INTO tblproducts (productname, supplierid, categoryid, quantityperunit, unitprice)
VALUES 
('Brown Rice', 1, 1, '5 kg bag', 200.00),
('Coffee', 1, 1, '100 coffee bags', 150.00),
('Mango Pickle', 2, 2, '500 g jar', 120.00);
INSERT INTO tblorders (customerid, employeeid, orderdate, requireddate, shippeddate, shipvia, freight, shipname, shipaddress)
VALUES 
(1, 5, '2024-07-04', '2024-07-10', '2024-07-06', 3, 150.00, 'Bhats Enterprises', '15 MG Road, Karnataka'),
(2, 4, '2024-07-05', '2024-07-12', '2024-07-07', 1, 100.00, 'Shettys Foods Pvt Ltd', 'Ujire main road, Ujire'),
(3, 3, '2024-07-08', '2024-07-15', '2024-07-10', 2, 200.00, 'Sampoorna Textiles', 'Collage road, Karnataka');
INSERT INTO tblorderdetails (orderid, productid, unitprice, quantity, discount)
VALUES 
(1, 1, 200.00, 10, 0.05),
(1, 2, 150.00, 15, 0),
(2, 3, 120.00, 20, 0.1),
(3, 1, 200.00, 5, 0),
(3, 2, 180.00, 25, 0.15);
select * from tblcustomers;
INSERT INTO tblcustomers (companyname, contactname, contacttitle, address, city, region, postalcode, phone)
VALUES 
('Bhats Enterprises', 'Jhannesh Bhat', 'Owner', '15 MG Road', 'Bangalore', 'Karnataka', '560022', '011-43215678');
INSERT INTO tblorders (customerid, employeeid, orderdate, requireddate, shippeddate, shipvia, freight, shipname, shipaddress)
VALUES 
(1, 5, '2024-07-04', '2024-07-10', '2024-07-02', 3, 150.00, 'Bhats Enterprises', '15 MG Road,Karnataka')