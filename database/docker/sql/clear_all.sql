SET SQL_SAFE_UPDATES = 0;
SET FOREIGN_KEY_CHECKS = 0;
DELETE FROM zakupki.long_term_volume_detail;
DELETE FROM zakupki.long_term_volumes;
DELETE FROM zakupki.purchase_plan_item_row;
DELETE FROM zakupki.innovation_plan_item_row;
DELETE FROM zakupki.purchase_plan_item;
DELETE FROM zakupki.innovation_plan_item;
DELETE FROM zakupki.plan_item;
DELETE FROM zakupki.purchase_plan;
DELETE FROM zakupki.customer;
DELETE FROM zakupki.supplier_address;
DELETE FROM zakupki.supplier;
DELETE FROM zakupki.supplier_without_inn;
DELETE FROM zakupki.supplier_to_contract;
DELETE FROM zakupki.contract;
DELETE FROM zakupki.contract_position;
DELETE FROM zakupki.purchase_notice_info;
DELETE FROM zakupki.plan_position;
SET FOREIGN_KEY_CHECKS = 1;
SET SQL_SAFE_UPDATES = 1;

