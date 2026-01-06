DECLARE 
 prix_m exception ;
 V_prix article.prix_achat%type ;
begin 
  select prix_achat into V_prix  from article WHERE num_a = 1 ;
  V_prix := V_prix / 2 ;
  if V_prix < 300 then 
    RAISE prix_m;
   end if ;

EXCEPTION 
  WHEN prix_m then 
    dbms_output.put_line(' dakxi mahwax ');
end ;