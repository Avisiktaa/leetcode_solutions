# Write your MySQL query statement below
select product_id,
       year as first_year,
       quantity,
       price
    from(
        select *,
        min(year) over (partition by product_id)as mini
        from sales
    )e
    where year=mini