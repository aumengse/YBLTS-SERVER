SELECT count(t.Passenger_num), sum(t.Total_amount) 
from ticket as t 
inner join passenger as p on p.Passenger_Num = t.Passenger_num
where Bus_Num = 'd112' and p.Discount = 0
		