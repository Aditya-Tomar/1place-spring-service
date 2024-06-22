# 1place-spring-service
Operation required
1. GET: Get all the links.
2. POST: Update/Create - Upsert
    title, link, order 
3. Delete: delete by ID

[(1, link1), (2, link2), (null, newLink)]


Schema
    Link
    - title, link, order
    - createdBy, createdOn
    - userId, deleted, isEnabled

    User
    - profile (name, bio), List<title, link> links, bussiness-id

1place/user-random-id
    
