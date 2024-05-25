INSERT INTO categories (id, category) VALUES (1, 'Cosmetics');
INSERT INTO categories (id, category) VALUES (2, 'Home Care');
INSERT INTO categories (id, category) VALUES (3, 'Soft Drink');


INSERT INTO sub_categories (category_id, id, sub_category) VALUES (1, 1, 'Soap');
INSERT INTO sub_categories (category_id, id, sub_category) VALUES (1, 2, 'Shampoo');
INSERT INTO sub_categories (category_id, id, sub_category) VALUES (1, 3, 'Body lotion');
INSERT INTO sub_categories (category_id, id, sub_category) VALUES (2, 4, 'Floor cleaner');
INSERT INTO sub_categories (category_id, id, sub_category) VALUES (2, 5, 'Detergent');
INSERT INTO sub_categories (category_id, id, sub_category) VALUES (2, 6, 'Dishwash');
INSERT INTO sub_categories (category_id, id, sub_category) VALUES (3, 7, 'Energy Drinks');
INSERT INTO sub_categories (category_id, id, sub_category) VALUES (3, 8, 'Carbonated Drinks');

INSERT INTO company (code, company_name) VALUES ('HUL', 'Hindustan unilever');
INSERT INTO company (code, company_name) VALUES ('ITC', 'ITC Limited');
INSERT INTO company (code, company_name) VALUES ('GCPL', 'Godrej Consumer Products Limited');
INSERT INTO company (code, company_name) VALUES ('P&G', 'Procter & Gamble');
INSERT INTO company (code, company_name) VALUES ('COKE', 'Coca cola');
INSERT INTO company (code, company_name) VALUES ('PEPSI', 'Pepsi');
INSERT INTO company (code, company_name) VALUES ('AW', 'Adani wilmar');

INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (1, 1, 'HUL', 'Lux');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (1, 2, 'HUL', 'Dove');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (1, 3, 'HUL', 'Lifebuoy');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (1, 4, 'HUL', 'pears');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (1, 5, 'ITC', 'Fiama');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (1, 6, 'ITC', 'Vivel');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (1, 7, 'ITC', 'Savlon');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (1, 8, 'GCPL', 'No 1');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (1, 9, 'GCPL', 'Cinthol');

INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (2, 10, 'ITC', 'Fiama');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (2, 11, 'ITC', 'SUPERIA');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (2, 12, 'HUL', 'Sunsilk');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (2, 13, 'HUL', 'Clinic Plus');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (2, 14, 'HUL', 'Dove');

INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (3, 15, 'HUL', 'Lakme');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (3, 16, 'HUL', 'Vaseline');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (3, 17, 'ITC', 'Dermafique');

INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (4, 18, 'ITC', 'Nimyle');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (4, 19, 'HUL', 'Domex');

INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (5, 20, 'P&G', 'Ariel');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (5, 21, 'P&G', 'Tide');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (5, 22, 'HUL', 'Sunlight');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (5, 23, 'HUL', 'Surf excel');

INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (6, 24, 'AW', 'Fortune');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (6, 25, 'HUL', 'Vim');

INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (7, 26, 'COKE', 'Monste');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (7, 27, 'COKE', 'Energy');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (7, 28, 'PEPSI', 'Sting');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (7, 29, 'PEPSI', 'Energy');

INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (8, 30, 'PEPSI', 'PEPSI');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (8, 31, 'PEPSI', 'Mtn Dew');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (8, 32, 'COKE', 'COKE');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (8, 33, 'COKE', 'Limca');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (8, 34, 'COKE', 'Thums UP');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (8, 35, 'COKE', 'Sprite');
INSERT INTO brand (sub_category_id, id, company_code, brand_name) VALUES (8, 36, 'COKE', 'Fanta');

INSERT INTO store (id, name) VALUES (1, 'HYD001');
INSERT INTO store (id, name) VALUES (2, 'HYD002');
INSERT INTO store (id, name) VALUES (3, 'HYD003');
INSERT INTO store (id, name) VALUES (4, 'HYD004');

INSERT INTO supplier (id, name) VALUES (1, 'Max');
INSERT INTO supplier (id, name) VALUES (2, 'DTM');
INSERT INTO supplier (id, name) VALUES (3, 'Ekart');
INSERT INTO supplier (id, name) VALUES (4, 'Ecom');

INSERT INTO store_supplier(id, store_id, supplier_id) VALUES (1, 1, 1);
INSERT INTO store_supplier(id, store_id, supplier_id) VALUES (2, 1, 3);
INSERT INTO store_supplier(id, store_id, supplier_id) VALUES (3, 2, 1);
INSERT INTO store_supplier(id, store_id, supplier_id) VALUES (4, 2, 2);
INSERT INTO store_supplier(id, store_id, supplier_id) VALUES (5, 2, 3);
INSERT INTO store_supplier(id, store_id, supplier_id) VALUES (6, 3, 2);
INSERT INTO store_supplier(id, store_id, supplier_id) VALUES (7, 3, 3);
INSERT INTO store_supplier(id, store_id, supplier_id) VALUES (8, 4, 1);
INSERT INTO store_supplier(id, store_id, supplier_id) VALUES (9, 4, 2);
INSERT INTO store_supplier(id, store_id, supplier_id) VALUES (10, 4, 4);

