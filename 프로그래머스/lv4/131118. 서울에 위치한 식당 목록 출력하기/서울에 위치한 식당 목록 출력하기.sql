SELECT REST_REVIEW.REST_ID,REST_NAME,FOOD_TYPE,FAVORITES,ADDRESS,ROUND(AVG(REVIEW_SCORE),2) AS SCORE
FROM REST_REVIEW join REST_INFO on REST_INFO.REST_ID=REST_REVIEW.REST_ID
GROUP BY REST_REVIEW.REST_ID HAVING REST_INFO.ADDRESS LIKE '서울%'
ORDER BY SCORE DESC,FAVORITES DESC