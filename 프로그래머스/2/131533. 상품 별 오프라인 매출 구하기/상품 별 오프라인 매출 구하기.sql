-- 코드를 입력하세요
SELECT DISTINCT(p.PRODUCT_CODE) as 'PRODUCT_CODE', SUM(p.PRICE * o.SALES_AMOUNT) as 'SALES'
FROM PRODUCT p
LEFT JOIN OFFLINE_SALE o ON p.PRODUCT_ID = o.PRODUCT_ID
GROUP BY PRODUCT_CODE
ORDER BY SALES desc, PRODUCT_CODE;

