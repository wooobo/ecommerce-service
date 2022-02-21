# 도메인

| 도메인                | 설명                  | 설명2             |
|--------------------|---------------------|-----------------|
| Product            | 상품                  |                 |
| ProductOption      | 상품 옵션               |                 |
| ProductOptionGroup | 상품 옵션 그룹            |                 |
| AddressBook        | 주소록                 | 출하지? 반품지? 둘다?   |
| Category           | 상품 카테고리             |                 |

## 도메인 구조
| 도메인          | 컬럼                  | 설명        | 타입                  |
|--------------|---------------------|-----------|--------------ㅈ-------|
| Product      |                     |           |                     |
|              | name                | 상품이름      | String              |
|              | status              | 판매상태      | String              |
|              | price               | 상품가격      | Long                |
|              | content             | 상품 상세내용   | String              |
|              | productOptionGroups | 상품 옵션 그룹  | ProductOptionGroups |
|              | saleStartAt         | 판매 시작 날짜  | Date                |
|              | saleEndAt           | 판매 종료 날짜  | Date                |
|              | brandCode           | 브랜드 코드     | String          |
|              | categoryCode        | 상품 카테고리   | String     |
|              | shippingPlaceCode   | 출고지 코드    | String              |
|              | returnPlaceCode     | 반품지 코드    | String              |


//