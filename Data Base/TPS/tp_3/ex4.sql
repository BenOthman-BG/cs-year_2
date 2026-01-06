CREATE OR REPLACE FUNCTION stock_restant (V_num_a IN article.num_a%type)
return number 
is 
V_stock article.stock%type ;
V_qte_total number ;
V_stock_restant number ; 
CURSOR othman is 
SELECT article.stock , sum(qte) from article , vente where vente.num_a = article.num_a 
and article.num_a = V_num_a
group by vente.num_a   , article.stock ;
BEGIN 
    open othman ;
    loop 
     fetch othman into  V_stock  , V_qte_total ;
     EXIT when othman%notfound;
    end loop ;
    V_stock_restant := V_stock - V_qte_total ;
    if V_stock_restant < (V_stock * 0.5) then 
     RAISE_Application_error(-20001 , 'the stock is less than pas normal -> '||V_stock*0.5);
    end if ;
    RETURN V_stock_restant;
end ;
/

DECLARE 
 V_stock_final number ;
BEGIN 
    V_stock_final := stock_restant(2);
    DBMS_OUTPUT.put_line(' le stock article restant  est : '||V_stock_final);
end;
/

