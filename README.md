### Rest API with OAuth2 with Google gmail. 

#API
Currently, this app is deployed in AWS, and available at the link - **_share-price-api.eu-north-1.elasticbeanstalk.com_**
After successful login, will redirect to **_/auth-success/hello_** and you will see next message: 

#### Hello! Authorization passed successfully:)

After this, you can start use API:

- get all companies: `/api/v1/companies` with params: `page` and `size`. Default values - `page = 0`, `size = 50`
- get company by symbol: `/api/v1/companies/{symbol}` for example: `/api/v1/companies/AA`
- get five the most expensive trading company currently: `/api/v1/companies/process/fiveMostExpensiveTradingCompany`
- get top five the greatest change percent in stock `/api/v1/companies/process/topFiveGreatestChangePercentInStock`