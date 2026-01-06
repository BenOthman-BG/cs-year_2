DECLARE 
 V_prix article.prix_achat%type ;
begin 
  select prix_achat into V_prix  from article WHERE num_a = 1 ;
  V_prix := V_prix / 2 ;
  if V_prix < 300 then 
    RAISE_Application_error (-20001,'dakxi skhir 3la 300 hanta xof -> ' ||V_prix);
   end if ;


end ;